package com.example.service.pk0;

/**
 * 中介者模式如果再改成策略模式,就失去了该模式的初衷
 */
public class Mediator extends AbstractMediator {
    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) {
            this.buyComputer((Integer) objects[0]);
        } else if (str.equals("sale.sell")) {
            this.sellComputer((Integer) objects[0]);
        } else if (str.equals("sale.offsell")) {
            this.offSell();
        } else if (str.equals("stock.clear")) {
            this.clearStock();
        }
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if(saleStatus > 80){
            System.out.println("采购IBM电脑:" + number + "台");
            super.stock.increase(number);
        }else{
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑:" + buyNumber + "台");
        }
    }

    private void sellComputer(int number) {
        if(super.stock.getStockNumber() < number){
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSell() {
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
    }

    private void clearStock() {
        //要求清仓销售
        super.sale.offSale();
        //要求采购人员不要采购
        super.purchase.refuseBuyIBM();
    }
}
