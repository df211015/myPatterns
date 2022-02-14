package com.example.service.pk3;

import com.example.domain.ERentType;

import java.util.Iterator;

public class MyMediator extends AbsMediator {
    @Override
    public void process(ERentType rentType) {
        Iterator<ERentType> iterator = super.getMapColleague().keySet().iterator();
        while (iterator.hasNext()) {
            ERentType mapKey = iterator.next();
            if (!mapKey.equals(rentType)) {
                AbsColleague absColleague = super.getMapColleague().get(mapKey);
                absColleague.processOther();
            }
        }
    }
}
