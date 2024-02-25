package com.feidian.system.service.impl;

import com.feidian.common.core.domain.AjaxResult;

import com.feidian.common.core.domain.entity.SysUser;
import com.feidian.common.utils.BeanCopyUtils;
import com.feidian.common.utils.SecurityUtils;
import com.feidian.system.domain.Course;
import com.feidian.system.domain.vo.CourseVO;
import com.feidian.system.domain.vo.UserVO;
import com.feidian.system.mapper.CourseMapper;
import com.feidian.system.mapper.SysUserMapper;
import com.feidian.system.mapper.UserMapper;
import com.feidian.system.service.UserService;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private CourseMapper courseMapper;

    /**
     * 课程列表
     * @param body
     * @return
     */
    @Override
    public AjaxResult getCoursesList(String body) {
        List<Course> courseList;
        if(!body.equals(" ")&& body != null){
            courseList = userMapper.selectCoursesList(body);
        }else{
            courseList = userMapper.selectAllCoursesList();
        }

        List<CourseVO> courseVOS = BeanCopyUtils.copyProperties(courseList, CourseVO.class);
        return AjaxResult.success(courseVOS);
    }

    /**
     * 课程详细信息
     * @param id
     * @return
     */
    @Override

    public AjaxResult getCoursesDetails(Integer id) {

        Course course = userMapper.selectCourseById(id);
        return AjaxResult.success(course);
    }

    /**
     * 个人信息
     * @return
     */
    @Override
    public AjaxResult getMessage() {
        String username = SecurityUtils.getUsername();
        SysUser sysUser = sysUserMapper.selectUserByUserName(username);
        UserVO userVO = BeanCopyUtils.copyProperty(sysUser, UserVO.class);
        return AjaxResult.success(userVO);


    }

    /**
     * 选课
     * @param id
     * @return
     */
    @Override
    public AjaxResult selectCourse(Integer id) {
        Long userId = SecurityUtils.getUserId();
        // 用户的选课数加一
        userMapper.addCounts(userId);
        // 用户课程关联表填入数据
        userMapper.contactData(userId,id);
        // 课程的选课数加一
        courseMapper.addCounts(Long.valueOf(id));
        return AjaxResult.success();
    }
    /**
     * 增加浏览量
     * @param courseId
     * @return
     */
    @Override
    public AjaxResult addCounts(Long courseId) {
        userMapper.addViewCounts(courseId);
        return AjaxResult.success();
    }
}
