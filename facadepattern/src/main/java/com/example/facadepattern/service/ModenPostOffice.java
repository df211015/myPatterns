package com.example.facadepattern.service;

public class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();

    public void sendLetter(String context,String address){
        //写信
        letterProcess.writeContext(context);

        //写信封
        letterProcess.fillEnvelope(address);

        //把信放到信封中
        letterProcess.letterInotoEnvelope();

        //邮递信件
        letterProcess.sendLetter();
    }
}
