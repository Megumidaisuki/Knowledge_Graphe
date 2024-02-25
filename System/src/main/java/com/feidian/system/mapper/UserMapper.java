package com.feidian.system.mapper;


import com.feidian.common.core.domain.entity.SysUser;
import com.feidian.system.domain.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserMapper {
    List<Course> selectCoursesList(@Param("body") String body);

    Course selectCourseById(Integer id);


    List<Course> selectAllCoursesList();

    void addCounts(Long userId);

    void contactData(Long userId, Integer id);

    void addViewCounts(Long courseId);
}
