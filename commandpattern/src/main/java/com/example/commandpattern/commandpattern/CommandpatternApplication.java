package com.example.commandpattern.commandpattern;

import com.example.commandpattern.commandpattern.simple.AbsCommand;
import com.example.commandpattern.commandpattern.simple.AbsReceiver;
import com.example.commandpattern.commandpattern.simple.ConcreteCommand;
import com.example.commandpattern.commandpattern.simple.ConcreteReceiver;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandpatternApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(CommandpatternApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("程序启动成功");

        /**
         * 命令模式的简化版本demo
         */
        AbsReceiver receiver = new ConcreteReceiver();
        AbsCommand command = new ConcreteCommand(receiver);
        command.execute();
    }
}
