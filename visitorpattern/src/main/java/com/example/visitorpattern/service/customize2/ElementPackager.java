package com.example.visitorpattern.service.customize2;

/**
 * 通过该类将dto的定义部分分离出来
 */
public class ElementPackager {
    private ElementDto elementDto;

    public ElementDto getElementDto() {
        return elementDto;
    }

    public void setElementDto(ElementDto elementDto) {
        this.elementDto = elementDto;
    }

    /**
     * 实现访问者方法
     *
     * @param visitorPlus
     */
    public void accept(IVisitorPlus visitorPlus) {
        visitorPlus.visit(this);
    }
}
