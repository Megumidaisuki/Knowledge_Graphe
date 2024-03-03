package com.feidian.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.feidian.common.annotation.Excel;
import com.feidian.common.core.domain.BaseEntity;

/**
 * 课程对象 course
 * 
 * @author ruoyi
 * @date 2024-02-22
 */
public class Course extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 课程名 */
    @Excel(name = "课程名")
    private String courseName;

    /** 视频存储地址 */
    @Excel(name = "视频存储地址")
    private String content;

    /** 视频简介 */
    @Excel(name = "视频简介")
    private String summary;

    /** 所属分类id */
    private Long categoryId;

    /**所属分类名 */

    private String categoryName;

    /** 缩略图 */
    @Excel(name = "缩略图")
    private String thumbnail;

    /** 视频长度 */
    @Excel(name = "视频长度")
    private String length;

    /** 是否置顶（0否，1是） */
    @Excel(name = "是否置顶", readConverterExp = "0=否，1是")
    private String isTop;

    /** 状态（0已发布，1草稿） */
    @Excel(name = "状态", readConverterExp = "0=已发布，1草稿")
    private String status;

    /** 访问量 */
    @Excel(name = "访问量")
    private Long viewCount;

    /** 是否允许评论 1是，0否 */
    @Excel(name = "是否允许评论 1是，0否")
    private String isComment;

    /** 点赞量 */
    @Excel(name = "点赞量")
    private Long likes;

    /** 点踩量 */
    @Excel(name = "点踩量")
    private Long dislikes;

    /** 选课量
 */
    @Excel(name = "选课量 ")
    private Long collectCounts;

    /** 删除标志（0代表未删除，1代表已删除） */
    private Long delFlag;

    /** 学分 */
    @Excel(name = "学分")
    private String points;

    /** 学时 */
    @Excel(name = "学时")
    private String courseTime;

    /** 见面课次数 */
    @Excel(name = "见面课次数")
    private Long offlineClasses;

    /** 学校名 */
    @Excel(name = "学校名")
    private String school;

    /** 授课教师 */
    @Excel(name = "授课教师")
    private String teacher;

    /** 开课时间 */
    @Excel(name = "开课时间")
    private String startTime;

    /** 结束时间 */
    @Excel(name = "结束时间")
    private String endTime;

    @Excel(name = "课程设计")
    private String courseDesign;

    public String getCourseDesign() {
        return courseDesign;
    }

    public void setCourseDesign(String courseDesign) {
        this.courseDesign = courseDesign;
    }


    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setSummary(String summary) 
    {
        this.summary = summary;
    }

    public String getSummary() 
    {
        return summary;
    }
    public void setCategoryId(Long categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() 
    {
        return categoryId;
    }
    public void setThumbnail(String thumbnail) 
    {
        this.thumbnail = thumbnail;
    }

    public String getThumbnail() 
    {
        return thumbnail;
    }
    public void setLength(String length) 
    {
        this.length = length;
    }

    public String getLength() 
    {
        return length;
    }
    public void setIsTop(String isTop) 
    {
        this.isTop = isTop;
    }

    public String getIsTop() 
    {
        return isTop;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setViewCount(Long viewCount) 
    {
        this.viewCount = viewCount;
    }

    public Long getViewCount() 
    {
        return viewCount;
    }
    public void setIsComment(String isComment) 
    {
        this.isComment = isComment;
    }

    public String getIsComment() 
    {
        return isComment;
    }
    public void setLikes(Long likes) 
    {
        this.likes = likes;
    }

    public Long getLikes() 
    {
        return likes;
    }
    public void setDislikes(Long dislikes) 
    {
        this.dislikes = dislikes;
    }

    public Long getDislikes() 
    {
        return dislikes;
    }
    public void setCollectCounts(Long collectCounts) 
    {
        this.collectCounts = collectCounts;
    }

    public Long getCollectCounts() 
    {
        return collectCounts;
    }
    public void setDelFlag(Long delFlag) 
    {
        this.delFlag = delFlag;
    }

    public Long getDelFlag() 
    {
        return delFlag;
    }
    public void setPoints(String points) 
    {
        this.points = points;
    }

    public String getPoints() 
    {
        return points;
    }
    public void setCourseTime(String courseTime) 
    {
        this.courseTime = courseTime;
    }

    public String getCourseTime() 
    {
        return courseTime;
    }
    public void setOfflineClasses(Long offlineClasses) 
    {
        this.offlineClasses = offlineClasses;
    }

    public Long getOfflineClasses() 
    {
        return offlineClasses;
    }
    public void setSchool(String school) 
    {
        this.school = school;
    }

    public String getSchool() 
    {
        return school;
    }
    public void setTeacher(String teacher) 
    {
        this.teacher = teacher;
    }

    public String getTeacher() 
    {
        return teacher;
    }
    public void setStartTime(String startTime) 
    {
        this.startTime = startTime;
    }

    public String getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(String endTime) 
    {
        this.endTime = endTime;
    }

    public String getEndTime() 
    {
        return endTime;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("courseName", getCourseName())
            .append("content", getContent())
            .append("summary", getSummary())
            .append("categoryId", getCategoryId())
            .append("thumbnail", getThumbnail())
            .append("length", getLength())
            .append("isTop", getIsTop())
            .append("status", getStatus())
            .append("viewCount", getViewCount())
            .append("isComment", getIsComment())
            .append("likes", getLikes())
            .append("dislikes", getDislikes())
            .append("collectCounts", getCollectCounts())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .append("points", getPoints())
            .append("courseTime", getCourseTime())
            .append("offlineClasses", getOfflineClasses())
            .append("school", getSchool())
            .append("teacher", getTeacher())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
                .append("courseDesign",getCourseDesign())
            .toString();
    }
}
