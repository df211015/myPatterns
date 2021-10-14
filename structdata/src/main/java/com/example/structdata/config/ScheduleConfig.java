package com.example.structdata.config;

//@Configuration
//@EnableScheduling
//public class ScheduleConfig implements SchedulingConfigurer {
//
//    @Override
//    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
//        TaskScheduler taskScheduler = taskScheduler();
//        scheduledTaskRegistrar.setTaskScheduler(taskScheduler);
//    }
//
//    /**
//     * 定时任务多线程处理
//     * 返回的是一个类 ,相同的bean会被覆盖
//     */
//    @Bean
//    public ThreadPoolTaskScheduler taskScheduler() {
//        /*http://blog.sina.com.cn/s/blog_7d1968e20102x1x4.html
//        在配置了spring线程池的情况下，如果某时刻要停止应用，如果没有优雅停机，存在于线程池中的任务将会被强制停止，导致部分任务失败。此时，只需要在线程配置中设置：
//        l  WaitForTasksToCompleteOnShutdown=true（默认为false），表明等待所有线程执行完
//        l  AwaitTerminationSeconds=xx（默认为0，此时立即停止），并没等待xx秒后强制停止*/
//        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
//        scheduler.setPoolSize(5);
//        scheduler.setThreadNamePrefix("task-");
//        scheduler.setAwaitTerminationSeconds(60);
//        scheduler.setWaitForTasksToCompleteOnShutdown(true);
//        return scheduler;
//    }
//
//
//}
