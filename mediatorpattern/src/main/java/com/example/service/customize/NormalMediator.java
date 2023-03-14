package com.example.service.customize;

public class NormalMediator extends AbsMediator {
    @Override
    public void interruptLandlady() {
        super.getLandlady().rent();
    }
}
