package com.company;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args)throws IOException  {
//        Try with resources-те колдоно ала турган Car деген класс тузунуз
//        close() деген метод "Машина жабылып жатат" деп консольго чыгаруусу керек.
//        try unchecked exception дарды кармап аларды игнор кылыш керек.
//                main методдо try блоктун ичинде drive() деген методду чакырыныз,
//                ал консольго "Машина журуп жатат" деп чыгаруусу керек
//        Эскертуу: маселени чыгарууда try with resources колдонуу керек.

        try (Car car = new Car("Polo","Wolksvagen","White",1.8,
                                        LocalDate.of(2014, Month.AUGUST,11))) {
            System.out.println(car);
        car.drive();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
