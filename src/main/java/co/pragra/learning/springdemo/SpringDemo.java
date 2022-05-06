package co.pragra.learning.springdemo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SpringDemo {
    public static void main(String[] args) {
//printGreet("Shintu");
//printGreet(new String[]{"Atin","Vivek", "Richa"});
// calling the method using a string array.
        //We can do the same thing above by using a spread operator.

//        List<String> strings = Arrays.asList("Shintu", "hsdnsdl", "skjdhfk");//the asList method is a spread operated method
//        Iterator<String> iterator = strings.iterator();
//        while(iterator.hasNext()) {
//
////            System.out.println(iterator.next());
//        }
        printGreet("Atin", "Vivek", "Richa");// calling printGreet . Here, we can pass n number of strings.
    }
//    public static void printGreet(String name){   }
//    public static void printGreet(String [] arr){} // instead of writing both the given methods, we can use a spread operator.
public static void printGreet(String... arr){
    for(String name:arr){
        System.out.println("Hello From "+name);
    }
}
}
