package com.example.service.mySpringframework;

public class UpperHelloDecorator extends HelloDecorator {
    public UpperHelloDecorator(HelloComponent helloComponent) {
        super(helloComponent);
    }

    @Override
    public String hello() {
        String hello = super.hello();
        hello = hello.toUpperCase();
        System.out.println(String.format("-->UpperHelloDecorator:%s", hello));
        return hello;
    }
}
