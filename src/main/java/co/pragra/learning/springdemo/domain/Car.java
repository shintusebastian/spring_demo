package co.pragra.learning.springdemo.domain;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.NumberFormat;

@ToString
@Component
public class Car {
    private  final  String make;
    private final String model;
    private final Engine engine;
private final NumberFormat format;

public Car(@Value("${car.make}")String make, @Value("${car.model}") String model, @Qualifier("petrolEngine") Engine engine, NumberFormat format) {
        this.make = make;
        this.model = model;
        this.engine = engine;//spring can automatically inject the engine in this case.
        this.format = format;//spring can automatically inject the format in this case
    }

//    public Car(String make, String model, Engine engine, NumberFormat format) {
//        this.make = make;
//        this.model = model;
//        this.engine = engine;
//        this.format = format; //this constructor is used for creating context from the base package and configuration packages.
//    }
//    public Car(String make, String model) {
//        this.make = make;
//        this.model = model;
//        engine=new ElectricEngine(); This is an example of tight coupling. Each time, if we need to create a new car,
    // we are creating it with an electric engine.
//    }

//    public Car(String make, String model, Engine engine) {
//        this.make = make;
//        this.model = model;
//        this.engine = engine;
//    }/* This is an example of loose coupling. Each time while we create a new car, we can specify the engine type.
//    This allows us to inject the dependencies everytime we create the object.
//    */
}
