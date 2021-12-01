package com.example.service.superMan;

public class DefenseSkill extends SkillDecorator {
    public DefenseSkill(AbsSkillPackage absSkillPackage) {
        super(absSkillPackage);
    }

    @Override
    public void getSkillPackage() {
        super.getSkillPackage();
        this.defense();
    }

    private void defense() {
        System.out.println("产生defense技能包");
    }
}
