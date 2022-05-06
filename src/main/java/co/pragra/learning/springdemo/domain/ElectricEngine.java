package co.pragra.learning.springdemo.domain;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements   Engine{
    @Override
    public String getEngineType() {
        return"Electric Engine";
    }
}
