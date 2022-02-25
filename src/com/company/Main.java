package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args)  {
//        Try with resources-те колдоно ала турган Car деген класс тузунуз
//        close() деген метод "Машина жабылып жатат" деп консольго чыгаруусу керек.
//        try unchecked exception дарды кармап аларды игнор кылыш керек.
//                main методдо try блоктун ичинде drive() деген методду чакырыныз,
//                ал консольго "Машина журуп жатат" деп чыгаруусу керек
//        Эскертуу: маселени чыгарууда try with resources колдонуу керек.
        //try (Car car = new Car()) {

        // public class Car extends AutoClosalbe
//    }
        try (Car car = new Car()) {
        car.drive();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
