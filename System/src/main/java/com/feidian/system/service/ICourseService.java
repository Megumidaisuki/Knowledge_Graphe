package com.feidian.system.service;

import java.util.List;

import com.feidian.common.core.domain.AjaxResult;
import com.feidian.system.domain.Course;

/**
 * 课程Service接口
 * 
 * @author ruoyi
 * @date 2024-02-22
 */
public interface ICourseService 
{
    /**
     * 查询课程
     * 
     * @param id 课程主键
     * @return 课程
     */
    public Course selectCourseById(Long id);

    /**
     * 查询课程列表
     * 
     * @param course 课程
     * @return 课程集合
     */
    public List<Course> selectCourseList(Course course);

    /**
     * 新增课程
     * 
     * @param course 课程
     * @return 结果
     */
    public int insertCourse(Course course);

    /**
     * 修改课程
     * 
     * @param course 课程
     * @return 结果
     */
    public int updateCourse(Course course);

    /**
     * 批量删除课程
     * 
     * @param ids 需要删除的课程主键集合
     * @return 结果
     */
    public int deleteCourseByIds(Long[] ids);

    /**
     * 删除课程信息
     * 
     * @param id 课程主键
     * @return 结果
     */
    public int deleteCourseById(Long id);

    /**
     * 查询分类
     *
     * @return 分类
     */

    AjaxResult selectCategory();
}
