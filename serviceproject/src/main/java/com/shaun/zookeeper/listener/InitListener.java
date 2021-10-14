package com.shaun.zookeeper.listener;

import com.shaun.zookeeper.zk.ServiceRegister;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Properties;

@WebListener
public class InitListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent){
        Properties properties = new Properties();
        try {
            properties.load(InitListener.class.getClassLoader().getResourceAsStream("application.yml"));

            String hostAddress = InetAddress.getLocalHost().getHostAddress();

            String po = properties.getProperty("port");
            int port = Integer.parseInt(po);

            ServiceRegister.reister(hostAddress,port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}