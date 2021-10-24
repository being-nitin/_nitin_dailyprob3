package com.nitincodes;
import java.util.*;
public class Main {
/*  create a class having properties manufacturer and price. create three instances of the class and display
    the details in a sorted descending order:
    */
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        c1.price = 4500000;
        c2.price = 3000000;
        c3.price = 2000000;
        c1.manufacturer = "Mercedis";
        c2.manufacturer = "Honda";
        c3.manufacturer = "Maruti Suzuki";
        if(c1.price>c2.price){
            if(c1.price>c3.price){
                if(c2.price< c3.price){
                    c1.details1();
                    c3.details1();
                    c2.details1();
                }
                else{
                    c1.details1();
                    c2.details1();
                    c3.details1();
                }
            }
            else{
                if(c1.price<c2.price){
                    c3.details1();
                    c2.details1();
                    c1.details1();
                }
                else{
                    c3.details1();
                    c1.details1();
                    c2.details1();
                }
            }
        }
    }
}
class Car{
    String manufacturer;
    int price;
    void details1(){
        System.out.println("The price of "+manufacturer+" is " +price);
    }
}
// this will print the car which is having the highest price