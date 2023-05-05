package com.example.compositepattern.service.v3;

import java.util.Collections;

public abstract class BaseComponent {
    public BaseComponent(Integer id, String name, String url, String icon, String tip) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.icon = icon;
        this.tip = tip;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    private Integer id;
    private String name;
    private String url;
    private String icon;
    private String tip;


    public abstract void add(BaseComponent component);

    public abstract void remove(BaseComponent component);

    public void showData(Integer depth) {
        this.preShow(depth);
        this.show(depth);
    }

    private void preShow(Integer depth) {
        //重复字符>指定depth次
        String prefix = String.join("", Collections.nCopies(depth, ">"));
        System.out.println(String.format("%s%s(%d,%s)", prefix, this.getName(), this.getId(), this.getUrl()));
    }

    public abstract void show(Integer depth);
}
