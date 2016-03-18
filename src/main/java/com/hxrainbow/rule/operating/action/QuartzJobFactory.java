package com.hxrainbow.rule.operating.action;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
/**
 * 定时任务运行工厂
 * @author zongren.jiang
 * @version $Id: QuartzJobFactory.java, v 0.1 2016年3月2日 上午9:47:58 zongren.jiang Exp $
 */
public class QuartzJobFactory implements Job {
    public void execute(JobExecutionContext context) throws JobExecutionException {
         System.out.println("任务成功运行");
         ScheduleJob scheduleJob = (ScheduleJob)context.getMergedJobDataMap().get("scheduleJob");
         System.out.println("任务名称 = [" + scheduleJob.getJobName() + "]");
         //根据name 与 group组成的唯一标识来判别该执行何种操作……
    }
}