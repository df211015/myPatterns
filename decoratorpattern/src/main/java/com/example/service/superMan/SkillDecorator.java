package com.example.service.superMan;

public class SkillDecorator extends AbsSkillPackage {
    private AbsSkillPackage absSkillPackage;

    public SkillDecorator(AbsSkillPackage absSkillPackage) {
        this.absSkillPackage = absSkillPackage;
    }

    @Override
    public void getSkillPackage() {
        this.absSkillPackage.getSkillPackage();
    }
}
