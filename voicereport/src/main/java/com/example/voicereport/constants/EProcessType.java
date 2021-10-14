package com.example.voicereport.constants;

public enum EProcessType {
    File("file",0),
    DB("db",1);
    private String description;
    private int index;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    EProcessType(String description, Integer index) {
        this.description = description;
        this.index = index;
    }

    /**
     * 将数字转化为枚举
     * @param index 数字
     * @return EProcessType
     */
    public static EProcessType findEProcessType(Integer index) {
        for (EProcessType e : EProcessType.values()) {
            if(e.getIndex() == index) {
                return e;
            }
        }
        return null;
    }
}
