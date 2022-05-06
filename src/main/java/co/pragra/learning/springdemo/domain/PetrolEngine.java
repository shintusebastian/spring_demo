package co.pragra.learning.springdemo.domain;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements Engine{
    @Override
    public String getEngineType() {
        return "Petrol Engine";
    }
}
