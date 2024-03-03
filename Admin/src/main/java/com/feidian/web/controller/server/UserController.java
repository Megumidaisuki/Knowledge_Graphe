package com.feidian.web.controller.server;

import com.feidian.common.annotation.Anonymous;
import com.feidian.common.core.controller.BaseController;
import com.feidian.common.core.domain.AjaxResult;

import com.feidian.system.service.UserService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/know")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    /**
     * 搜索课程列表
     * @param body
     * @return
     */
    @GetMapping("/selectList")
    public AjaxResult getList(@RequestParam("body")String body) {
        return userService.getCoursesList(body);
    }

    /**
     * 详细课程信息
     * @param courseId
     * @return
     */
    @GetMapping("/getDetails/{courseId}")
    public AjaxResult getDetails(@PathVariable Integer courseId) {
        return userService.getCoursesDetails(courseId);
    }

    /**
     * 用户个人信息
     * @return
     */
    @GetMapping("/getMessage")
    public AjaxResult getMessage(){
        return userService.getMessage();
    }

    /**
     * 选课
     * @param courseId
     * @return
     */
    @PostMapping("/selectCourse/{courseId}")
    public AjaxResult selectCourse(@PathVariable Integer courseId){
        return userService.selectCourse(courseId);
    }

    /**
     * 增加浏览量
     * @param courseId
     * @return
     */
    @PostMapping("/addViewCounts/{courseId}")
    public AjaxResult addViewCounts(@PathVariable Long courseId){

        return userService.addCounts(courseId);
    }


}








































