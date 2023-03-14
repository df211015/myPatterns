package com.example.service.customize;

public class ColleagueOfTenant extends AbsColleague {
    public ColleagueOfTenant(AbsMediator mediator) {
        super(mediator);
    }

    @Override
    public void rent() {
        this.renantRent();
        super.mediator.getLandlady().landladyRent();
    }

    public void renantRent(){
        System.out.println("ColleagueOfTenant --> rent");
    }
}
