package com.company;
public class Main {

public static void main(String[]args){
//интерфейс мебель - абстрактный класс шкаф - класс книжный шкаф
//("Введите по последовательности цена , страна производства ,material,и высота объекта , недостаки");

BookCase bookCase = new BookCase(1500,"Kazakhstan","Wood",120,null);
bookCase.outputheight();
bookCase.outputMadeIn();
bookCase.outputmaterial();
bookCase.outputprice();
}

}





