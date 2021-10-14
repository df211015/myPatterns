package com.example.service.pk0;

public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyIBMcomputer(int number){
        super.mediator.execute("purchase.buy",number);
    }

    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}
