package com.apps.task_show.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 功能描述:
 * 项目名称:TaskShow
 * 创建日期:2020/8/14
 */
@Component
@Slf4j
public class ScheduledTaskShowInfo {
    /**
     * fixedRate 是 long 类型，表示任务执行的间隔毫秒数，
     * 以上代码中的定时任务每 3 秒执行一次
     */
    @Scheduled(fixedRate = 3000)
    public void scheduledTask() {
       log.info("任务执行时间：" + LocalDateTime.now());
    }
}
