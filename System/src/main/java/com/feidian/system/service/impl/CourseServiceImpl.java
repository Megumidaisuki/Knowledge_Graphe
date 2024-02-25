package com.feidian.system.service.impl;

import java.util.List;

import com.feidian.common.core.domain.AjaxResult;
import com.feidian.common.utils.DateUtils;
import com.feidian.system.domain.SysCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.feidian.system.mapper.CourseMapper;
import com.feidian.system.domain.Course;
import com.feidian.system.service.ICourseService;

/**
 * 课程Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-02-22
 */
@Service
public class CourseServiceImpl implements ICourseService 
{
    @Autowired
    private CourseMapper courseMapper;

    /**
     * 查询课程
     * 
     * @param id 课程主键
     * @return 课程
     */
    @Override
    public Course selectCourseById(Long id)
    {
        Course course = courseMapper.selectCourseById(id);
        course.setCategoryName(courseMapper.getCategoryNameById(course.getCategoryId()));
        return course;
    }

    /**
     * 查询课程列表
     * 
     * @param course 课程
     * @return 课程
     */
    @Override
    public List<Course> selectCourseList(Course course)
    {

        List<Course> courseList = courseMapper.selectCourseList(course);
        for (Course c : courseList) {
            c.setCategoryName(courseMapper.getCategoryNameById(c.getCategoryId()));
        }
        return courseList;
    }

    /**
     * 新增课程
     * 
     * @param course 课程
     * @return 结果
     */
    @Override
    public int insertCourse(Course course)
    {
        course.setCreateTime(DateUtils.getNowDate());
        course.setCategoryId(courseMapper.getCategoryIdByName(course.getCategoryName()));
        return courseMapper.insertCourse(course);
    }

    /**
     * 修改课程
     * 
     * @param course 课程
     * @return 结果
     */
    @Override
    public int updateCourse(Course course)
    {
        course.setUpdateTime(DateUtils.getNowDate());
        course.setCategoryId(courseMapper.getCategoryIdByName(course.getCategoryName()));
        return courseMapper.updateCourse(course);
    }

    /**
     * 批量删除课程
     * 
     * @param ids 需要删除的课程主键
     * @return 结果
     */
    @Override
    public int deleteCourseByIds(Long[] ids)
    {
        return courseMapper.deleteCourseByIds(ids);
    }

    /**
     * 删除课程信息
     * 
     * @param id 课程主键
     * @return 结果
     */
    @Override
    public int deleteCourseById(Long id)
    {
        return courseMapper.deleteCourseById(id);
    }


    /**
     * 查询分类
     * @return 分类
     */

    @Override
    public AjaxResult selectCategory() {
        List<SysCategory> sysCategories = courseMapper.selectCategory();
        return AjaxResult.success(sysCategories);
    }
}
