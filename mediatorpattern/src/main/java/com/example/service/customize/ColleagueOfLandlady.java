package com.example.service.customize;

public class ColleagueOfLandlady extends AbsColleague {
    public ColleagueOfLandlady(AbsMediator mediator) {
        super(mediator);
    }

    @Override
    public void rent() {
        this.landladyRent();
        //通过中介者调用与外部的交互类
        super.mediator.getTenant().renantRent();
    }

    public void landladyRent(){
        System.out.println("ColleagueOfLandlady --> rent");
    }
}
