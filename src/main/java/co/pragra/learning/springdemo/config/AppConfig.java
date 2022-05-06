package co.pragra.learning.springdemo.config;

import co.pragra.learning.springdemo.domain.Car;
import co.pragra.learning.springdemo.domain.ElectricEngine;
import co.pragra.learning.springdemo.domain.PetrolEngine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.text.NumberFormat;

@PropertySource("classpath:car.properties")
@Configuration //this will say that this is a configuration class.
public class AppConfig {
//    @Value("#{ '${car.make}'.toUpperCase()}")
//    private String make;
//    //to write an expression in SpEL
//    @Value("#{100+300}")
//    private int total;
//    @Value("${car.model:'Generic Car'}")//this is the spel expression to make the model as a Generic car. It is used
//    //when we need some default values and whenever we need, we can overwrite it.  To overwrite it, go to the car.properties
//    // and enable the model value there.
//    private String model;
//
//    @Bean
//    public ElectricEngine electricEngine() {
//        return new ElectricEngine();//This will be considered a bean now.
//    }
//
//    @Bean
//    public PetrolEngine petrolEngine() {
//        return new PetrolEngine();
//    }


//    @Bean
//    public Car car() {
//        System.out.println(total);//printing the total.
//        return new Car(make, model, petrolEngine(), NumberFormat.getInstance());
//    }this code is not used when spring creates beans from the domain classes.

    //below code is used in the case of creating beans from the domain classes.
    @Bean
    public NumberFormat format(){
        return NumberFormat.getInstance();
    }
}
