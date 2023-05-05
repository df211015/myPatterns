package com.example.compositepattern.service.v3;

import java.util.ArrayList;
import java.util.List;

public class Menu extends BaseComponent {

    private List<BaseComponent> lstFunction = new ArrayList<>();

    public Menu(Integer id, String name, String url, String icon, String tip) {
        super(id, name, url, icon, tip);
    }

    @Override
    public void add(BaseComponent component) {
        this.lstFunction.add(component);
    }

    @Override
    public void remove(BaseComponent component) {
        this.lstFunction.remove(component);
    }

    @Override
    public void show(Integer depth) {
        if (this.lstFunction.isEmpty()) {
            return;
        }
        for (BaseComponent item : this.lstFunction) {
            item.showData(depth + 1);
        }
    }
}
