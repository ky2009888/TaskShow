package com.apps.task_show.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述:
 * 项目名称:TaskShow
 * 创建日期:2020/8/14
 */
@RestController
@RequestMapping("/task")
@Slf4j
public class LoggerController {
    @GetMapping("/log")
    public String showTask(){
        log.info("show task");
        return "show task";
    }
}
