package com.example.builderpattern.service.buider03;

public class MyDirector {
    /**
     *
     * @param myBuilder
     * @return
     */
    public SuperStar getSuperStar(MyBuilder myBuilder){
        SuperStar superStar = myBuilder.buildSuperStar();
        return superStar;
    }

    /**
     * 可以在这里进行对像属性初始化,这里比较契合该类的定位
     * @return
     */
    public SuperStar getSuperStar(){
        MyBuilder myBuilder = new MyBuilder01();
        myBuilder.setAge(19);
        myBuilder.setName("bbb");
        myBuilder.setFavourite("dance");
        SuperStar superStar = myBuilder.buildSuperStar();

        return superStar;
    }
}
