package com.example.chainpattern.service.dns;

public class RequestDns {
    private Integer requestLevel;
    private String requestMsg;

    public Integer getRequestLevel() {
        return requestLevel;
    }

    public void setRequestLevel(Integer requestLevel) {
        this.requestLevel = requestLevel;
    }

    public String getRequestMsg() {
        return requestMsg;
    }

    public void setRequestMsg(String requestMsg) {
        this.requestMsg = requestMsg;
    }

    /**
     *
     * @param requestLevel
     * @param requestMsg
     */
    public RequestDns(Integer requestLevel, String requestMsg) {
        this.requestLevel = requestLevel;
        this.requestMsg = requestMsg;
    }

    public void printRequestMsg(){
        System.out.println(this.requestMsg);
    }
}