package com.example.voicereport.comm;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StringProcess {
    /**
     * 进行语音播报处理
     *
     * @param content 播报内容
     */
    public void process(String content) {
        //ActiveXComponent sap = new ActiveXComponent("Sapi.SpVoice");
        ActiveXComponent sap = new ActiveXComponent("SAPI.SpVoice");
        Dispatch sapo = sap.getObject();
        try {
            //音量
            sap.setProperty("Volume", new Variant(100));
            //语速
            sap.setProperty("Rate", new Variant(0.1));
            //语音播放当前行的内容 GBK UTF-8
            byte[] utf8Bytes = content.getBytes("UTF-8");
            String utf8Str = new String(utf8Bytes, "UTF-8");
            Dispatch.call(sapo, "Speak", new Object[]{utf8Str});
        } catch (Exception ex) {
            log.info("process异常", ex);
        } finally {
            sapo.safeRelease();
            sap.safeRelease();
        }
    }
}
