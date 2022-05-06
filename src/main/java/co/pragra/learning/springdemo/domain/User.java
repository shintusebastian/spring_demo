package co.pragra.learning.springdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data @NoArgsConstructor @Builder @AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private String course;
     private List<String> hobbies;// here we are using getters and setters. So, in the bean, we will use properties.
    private Map<String,String> courseGradeMap;// we can also add a property that is of Map type to the bean.

    //{Car car =new Car("Honda","Civic",()->"Petrol Engine");
//	Here, we are not hardcoding the engine type. We are providing all the dependencies to create the object within
//	 the constructor body. This is one way.
    //second way, we can construct an object with null values and use setters to set the dependencies.
    //When we are not specifying any values within the constructor body is called loose coupling.
    //Depencency injection says pass all the required values to create the object. } refers to dependency injection
    /*<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
               http://www.springframework.org/schema/beans/spring-beans.xsd">*
               We can copy this from google. Just type beans.xml/
               */
//public void init(){//if user entered hobby is null, add coding to hobbies.
//    if(hobbies ==null){
//        hobbies=new ArrayList<>();
//    }
//    hobbies.add("Coding");
//}//in the bean user, we have to add init-method("init") on it to initialize the bean with the hobbies.
    //But, the initialization method(init()) is run after object is created.
    //After initialization, we can add hobbies to the bean using setters.

    //if the hobbies is null and we remove the init method from the bean.xml, then spring will realize it needs to set
    //the values. So, it will pick up the implementation of Array List and the hobbies will be set as Reading and Writing.
    //It will not add coding to the bean.
/*init is a bean life cycle method. */
//    public void destroy(){
//        System.out.println("Destroying");
    }//we can specify this destroy method in the bean. But the bean will be there till the application is running.
    //The bean will be alive till the context is running.
//}
