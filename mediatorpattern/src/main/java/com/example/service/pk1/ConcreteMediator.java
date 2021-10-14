package com.example.service.pk1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void register(Colleague colleague) {
        if (!this.colleagues.contains(colleague)) {
            this.colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(Colleague c) {
        for (Colleague item : this.colleagues) {
            if (!item.equals(c)) {
                item.receive();
            }
        }
    }
}
