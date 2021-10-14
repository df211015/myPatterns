package com.example.service.score;

public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("尊敬的xxx家长:");
        System.out.println("................");
        System.out.println("语文:62,数学:65,英语:67");
        System.out.println("................");
        System.out.println("家长签名:");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名:" + name);
    }
}
