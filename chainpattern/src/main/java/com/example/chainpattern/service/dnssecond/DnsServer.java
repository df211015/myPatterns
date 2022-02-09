package com.example.chainpattern.service.dnssecond;

import com.example.chainpattern.service.dnsfirst.Recorder;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public abstract class DnsServer extends Observable implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Recorder recorder = (Recorder) arg;
        if (this.isLocal(recorder)) {
            recorder.setIp(this.genIpAddress());
        } else {
            this.responseFromUpperServer(recorder);
        }
        this.sign(recorder);
    }

    /**
     * 作为被观察者,允许增加观察者,这里上级DNS一般只有一个
     *
     * @param dnsServer
     */
    public void setUpperServer(DnsServer dnsServer) {
        super.deleteObservers();
        super.addObserver(dnsServer);
    }

    /**
     * 向父DNS请求解析,即通知观察者
     *
     * @param recorder
     */
    private void responseFromUpperServer(Recorder recorder) {
        super.setChanged();
        super.notifyObservers(recorder);
    }

    protected abstract void sign(Recorder recorder);

    protected abstract boolean isLocal(Recorder recorder);

    /**
     * 随机生成ip地址
     *
     * @return
     */
    private String genIpAddress() {
        Random rand = new Random();
        String ipAddress = String.format("%s.%s.%s.%s",
                rand.nextInt(255),
                rand.nextInt(255),
                rand.nextInt(255),
                rand.nextInt(255));
        return ipAddress;
    }
}
