package com.example.compositepattern.service.v3;

public class Function extends BaseComponent {
    public Function(Integer id, String name, String url, String icon, String tip) {
        super(id, name, url, icon, tip);
    }

    @Override
    public void add(BaseComponent component) {
        //
    }

    @Override
    public void remove(BaseComponent component) {
        //
    }

    @Override
    public void show(Integer depth) {
        //可以个性化自己的属性上来
    }
}
