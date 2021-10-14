package com.example.service.imgBox;

public class ImgOfColor extends DecorateBox {
    public ImgOfColor(Img img) {
        super(img);
    }

    @Override
    public void ImgDescription() {
        super.ImgDescription();
        System.out.println("add color image");
    }
}