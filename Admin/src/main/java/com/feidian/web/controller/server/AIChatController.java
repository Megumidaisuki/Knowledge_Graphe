package com.feidian.web.controller.server;

import com.feidian.common.core.domain.AjaxResult;

import com.feidian.system.service.AIChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/AI")
public class AIChatController {
    @Autowired
    private AIChatService aiChatService;
    @PostMapping("/Chat")
    public AjaxResult getResponse(@RequestParam("body") String body){

        return aiChatService.getResponse(body);
    }


}
