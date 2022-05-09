package com.example.service.mySpringframework;

public class LowerHelloDecorator extends HelloDecorator {
    public LowerHelloDecorator(HelloComponent helloComponent) {
        super(helloComponent);
    }

    @Override
    public String hello() {
        String hello = super.hello();
        hello = hello.toLowerCase();
        System.out.println(String.format("-->LowerHelloDecorator:%s", hello));
        return hello;
    }
}
