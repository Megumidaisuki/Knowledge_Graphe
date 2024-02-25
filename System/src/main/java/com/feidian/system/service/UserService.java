package com.feidian.system.service;

import com.feidian.common.core.domain.AjaxResult;

public interface UserService {
    AjaxResult getCoursesList(String body);

    AjaxResult getCoursesDetails(Integer id);

    AjaxResult getMessage();

    AjaxResult selectCourse(Integer id);

    AjaxResult addCounts(Long courseId);
}
