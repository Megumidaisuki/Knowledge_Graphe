package com.feidian.system.service;


import com.feidian.common.core.domain.AjaxResult;

public interface AIChatService {
    AjaxResult getResponse(String body);
}
