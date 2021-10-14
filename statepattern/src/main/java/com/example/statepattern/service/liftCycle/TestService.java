package com.example.statepattern.service.liftCycle;

import com.example.statepattern.comm.ArraysUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

@Service
public class TestService {
    @Autowired
    @Qualifier("newExecutorPool")
    private ExecutorService executorService;

    /**
     * 线程池处理测试
     *
     * @param param
     */
    public void threadTest(Map<String, Object> param) {
        try {
            List<String> unids = (List<String>) param.get("unids");
            Integer frequency = (Integer) param.get("frequency");
            Integer sleepTime = (Integer) param.get("sleepTime");
            List<List<String>> lists = ArraysUtils.divideEqually(unids, frequency);
            lists.stream().forEach(v -> {
                executorService.submit(() -> {
                    v.stream().forEach(u -> {
                        print(u, Thread.currentThread().getName());
                        try {
                            Thread.sleep(sleepTime);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    });
                });
            });
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void print(String u, String threadName) {
        System.out.println(String.format("当前线程名称:%s,处理结果:%s", threadName, u));
    }
}
