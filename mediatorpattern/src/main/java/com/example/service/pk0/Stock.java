package com.example.service.pk0;

public class Stock extends AbstractColleague {
    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    private static int COMPURTER_NUMBER = 100;

    //库存增加
    public void increase(int number){
        COMPURTER_NUMBER += number;
        System.out.println("库存数量为:" + COMPURTER_NUMBER);
    }

    //库存降低
    public void decrease(int number){
        COMPURTER_NUMBER -= number;
        System.out.println("库存数量为:" + COMPURTER_NUMBER);
    }

    //获取库存数量
    public int getStockNumber(){
        return COMPURTER_NUMBER;
    }

    //存货压力大了,就要通知采购人员不要采购,销售人员要尽快销售
    public void clearStock(){
        System.out.println("清理存货数量为:" + COMPURTER_NUMBER);
        super.mediator.execute("stock.clear");
    }
}
