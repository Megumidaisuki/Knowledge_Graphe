package com.feidian;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



/**
 * 启动程序
 * 
 * @author ruoyi
 */
@MapperScan("com.feidian.system.mapper")
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class FeidianApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(FeidianApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  学生知识图谱平台启动成功   ლ(´ڡ`ლ)ﾞ ");
    }
}
