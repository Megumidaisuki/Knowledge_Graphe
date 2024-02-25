package com.feidian.system.service.impl;

import com.feidian.common.core.domain.AjaxResult;

import com.feidian.system.service.AIChatService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.springframework.stereotype.Service;

@Service
public class AIChatServiceImpl implements AIChatService {

    @Override
    public AjaxResult getResponse(String body) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        //打开ai问答网址
        driver.get("http://region-31.seetacloud.com:33398/");
        //获取输入框
        WebElement inputElement = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/section[2]/div/div/div/div/div[4]/div/div/div/div[1]/div/textarea"));
        inputElement.clear();
        // sendKeys()方法，在搜索框中输入搜索内容
        inputElement.sendKeys(body);
        // 通过submit提交
        driver.findElement(By.className("st-emotion-cache-1ch8vux e1d2x3se3")).submit();
        // click()方法，点击搜索
        driver.findElement(By.className("st-emotion-cache-1ch8vux e1d2x3se3")).click();
        String text = driver.findElement(By.className("st-emotion-cache-5rimss e1nzilvr5")).getText();
        return AjaxResult.success(text);

    }
}
