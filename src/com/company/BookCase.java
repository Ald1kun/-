package com.company;

public class BookCase implements Furniture {
    public int price;
    public String madeIn;
    public String material;
    public int height;
    public String limitations;

    public BookCase(int price,String country,String material,int height,String limitations) {
        this.price = price;
        this.height = height;
        this.madeIn=country;
        this.material=material;
        this.limitations = limitations;
    }

    @Override
    public void outputprice(){
        System.out.println("The price of this bookcase: " + price +" dollars");
    }

    @Override
    public void outputMadeIn() {
        System.out.println("This bookcase made in :" + madeIn + " country");
    }

    @Override
    public void outputmaterial() {
        System.out.println("This bookcase " +"made from :"+material);

    }

    @Override
    public void outputheight() {
        System.out.println("Bookcase height: " + height + "centimeters");
    }
}


