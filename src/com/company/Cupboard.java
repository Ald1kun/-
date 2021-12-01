package com.company;
public abstract class Cupboard implements Furniture{
        public int price;
        public String madeIn;
        public String material;
        public int height;

    public Cupboard(int price,String country,String material,int height) {
        this.price = price;
        this.height = height;
        this.madeIn=country;
        this.material=material;
    }
    @Override
    public void outputprice(){
        System.out.println("The price of this cabinet :" + price +" dollars");
    }

    @Override
    public void outputMadeIn() {
        System.out.println("This Cupboard made in" + madeIn + " country");
    }

    @Override
    public void outputmaterial() {
        System.out.println("This cupboard " +"made from"+material);

    }

    @Override
    public void outputheight() {
        System.out.println("cabinet height :" + height + "centimeters");
    }
}
