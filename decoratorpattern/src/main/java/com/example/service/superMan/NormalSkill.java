package com.example.service.superMan;

public class NormalSkill extends AbsSkillPackage {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    private String name;
    private Integer level;

    @Override
    public void getSkillPackage() {
        System.out.println("普通技能包");
    }
}