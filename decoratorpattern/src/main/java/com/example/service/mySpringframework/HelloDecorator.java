package com.example.service.mySpringframework;

public abstract class HelloDecorator implements HelloComponent {
    private HelloComponent helloComponent;

    public HelloDecorator(HelloComponent helloComponent) {
        this.helloComponent = helloComponent;
    }

    @Override
    public String hello() {
        return this.helloComponent.hello();
    }
}
