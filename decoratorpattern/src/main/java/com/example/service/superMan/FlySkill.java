package com.example.service.superMan;

public class FlySkill extends SkillDecorator{
    public FlySkill(AbsSkillPackage absSkillPackage) {
        super(absSkillPackage);
    }

    @Override
    public void getSkillPackage() {
        super.getSkillPackage();
        this.fly();
    }

    private void fly(){
        System.out.println("产生fly技能包");
    }
}
