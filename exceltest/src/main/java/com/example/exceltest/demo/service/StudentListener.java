package com.example.exceltest.demo.service;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.example.exceltest.demo.dao.StudentDao;
import com.example.exceltest.demo.domain.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class StudentListener extends AnalysisEventListener<Student> {
    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 5;

    private List<Student> list = new ArrayList<Student>();

    /**
     * 假设这个是一个DAO，当然有业务逻辑这个也可以是一个service
     */
    @Autowired
    private StudentDao studentDao;

    /**
     * 每一条数据解析都会来调用
     * @param student
     * @param analysisContext
     */
    @Override
    public void invoke(Student student, AnalysisContext analysisContext) {
        System.out.println("invoke方法被调用");
        list.add(student);
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (list.size() >= BATCH_COUNT) {
            this.saveData();
            // 存储完成清理 list
            list.clear();
        }
    }

    /**
     * 所有数据解析完成了 都会来调用
     * @param analysisContext
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("doAfterAllAnalysed方法 被调用");
        // 这里也要保存数据，确保最后遗留的数据也存储到数据库
        this.saveData();
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        this.studentDao.save(list);
    }
}
