package com.example.builderpattern.service.builder02;

import lombok.Data;

public class Computer {
    private String cpu;
    private String ram;
    private String usb;
    private String keyboard;
    private Computer(Builder builder){
        this.cpu = builder.getCpu();
        this.ram = builder.getRam();
        this.usb = builder.getUsb();
        this.keyboard = builder.getKeyboard();
    }

    public String getInfo(){
        return String.format("cpu:%s,ram:%s,usb:%s,keyboard:%s",this.cpu,this.ram,this.usb,this.keyboard);
    }

    @Data
    public static class Builder{
        private String cpu;
        private String ram;
        private String usb;
        private String keyboard;

        public Builder(){
        }

        public Builder buildCpu(String cpu){
            this.cpu = cpu;
            return  this;
        }

        public Builder buildRam(String ram){
            this.ram = ram;
            return this;
        }

        public Builder buildUsb(String usb){
            this.usb = usb;
            return this;
        }

        public Builder buildKeyboard(String keyboard){
            this.keyboard = keyboard;
            return this;

        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
