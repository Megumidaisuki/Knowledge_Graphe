package com.feidian.system.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseVO {
    private Long id;
    private String courseName;
    private String thumbnail;
    private String teacher;
    private String school;
    private String categoryName;
}
