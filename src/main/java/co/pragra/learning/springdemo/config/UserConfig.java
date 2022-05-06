package co.pragra.learning.springdemo.config;

import co.pragra.learning.springdemo.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
@Configuration
public class UserConfig {
//@Bean (initMethod = "init",destroyMethod = "destroy")//we create the initialization and destroy methods while specifying the bean .
public User user(){
    return new User("Manpreet","Khangura","Java", Collections.emptyList(), Collections.emptyMap());
}
}
