package com.example.service.imgBox;

public abstract class DecorateBox implements Img{
    private Img img;

    public DecorateBox(Img img) {
        this.img = img;
    }

    @Override
    public void ImgDescription() {
        this.img.ImgDescription();
    }
}
