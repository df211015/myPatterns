package com.example.prototypepattern.servrice.instance01;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Thing implements Cloneable {
    @Override
    public Thing clone() throws CloneNotSupportedException {
        Thing thing = (Thing) super.clone();
//        thing.arrayList = (ArrayList<String>)thing.arrayList.clone();
        ArrayList lstTmp = new ArrayList<>();
        if (null != thing.arrayList && thing.arrayList.size() > 0) {
            thing.arrayList.forEach(r -> {
                lstTmp.add(r);
            });
            thing.arrayList = lstTmp;
        }
        return thing;
    }

    private ArrayList<String> arrayList = new ArrayList<String>();

    public void setList(String str) {
        this.arrayList.add(str);
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }
}
