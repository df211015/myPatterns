package com.example.permissiondata.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

@Slf4j
@Service
public class CmdOfDataProcessExt extends MyCommandExt {

    @Override
    public void excute(String fileName,String fileName1) {
        StopWatch sw = new StopWatch(String.format("%s", System.currentTimeMillis()));
        sw.start();
        String mySql = super.getMyReceiver().process();
        sw.stop();

        log.info(String.format("处理耗时,共计:%s(ms)", sw.getTotalTimeMillis()));

        //写入本地文件
        this.wirteLocalFile(mySql, fileName);

        StopWatch sw1 = new StopWatch(String.format("%s", System.currentTimeMillis()));
        sw1.start();
        String mySql1 = super.getMyReceiver().process1();
        sw1.stop();

        log.info(String.format("处理耗时,共计:%s(ms)", sw1.getTotalTimeMillis()));

        //写入本地文件
        this.wirteLocalFile(mySql1, fileName1);
    }

    /**
     * 写入本地文件
     *
     * @param mySql    sql内容
     * @param fileName 文件路径
     */
    private void wirteLocalFile(String mySql, String fileName) {
        try {
            File file = new File(fileName);
            if (file.exists()) {
                FileWriter fw = new FileWriter(file, Boolean.TRUE);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(mySql);
                bw.close();
                fw.close();
                log.info("-- wirteLocalFile写入完成");
            }
        } catch (Exception ex) {
            log.info("wirteLocalFile异常", ex);
        }
    }
}
