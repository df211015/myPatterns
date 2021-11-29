package com.dfliu.performancemonitor;

import com.dfliu.performancemonitor.domain.dto.RequestInfo;
import com.dfliu.performancemonitor.service.MetricsStorage;
import com.dfliu.performancemonitor.service.impl.v2.ConsoleReporter;
import com.dfliu.performancemonitor.service.impl.v2.EmailReporter;
import com.dfliu.performancemonitor.service.impl.v2.MetricsCollector;
import com.dfliu.performancemonitor.service.impl.v2.RedisMetricsStorage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PerformancemonitorApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PerformancemonitorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("programmer started！");

        MetricsStorage storage = new RedisMetricsStorage();
        ConsoleReporter consoleReporter = new ConsoleReporter(storage);
        consoleReporter.startRepeatedReport(60, 60);

        EmailReporter emailReporter = new EmailReporter(storage);
        emailReporter.addToAddress("wangzheng@xzg.com");
        emailReporter.startDailyReport();

        MetricsCollector collector = new MetricsCollector(storage);
        collector.recordRequest(new RequestInfo("register", 123, 10234));
        collector.recordRequest(new RequestInfo("register", 223, 11234));
        collector.recordRequest(new RequestInfo("register", 323, 12334));
        collector.recordRequest(new RequestInfo("login", 23, 12434));
        collector.recordRequest(new RequestInfo("login", 1223, 14234));

        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
