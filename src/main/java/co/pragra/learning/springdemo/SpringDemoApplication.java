package co.pragra.learning.springdemo;


import co.pragra.learning.springdemo.config.AppConfig;
import co.pragra.learning.springdemo.config.UserConfig;
import co.pragra.learning.springdemo.domain.Car;
import co.pragra.learning.springdemo.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



@Slf4j
//@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringDemoApplication.class, args);


//		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:bean.xml");
// This is an xml based configuration context.

	//	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class, UserConfig.class);
//		ApplicationContext context=new AnnotationConfigApplicationContext("co.pragra.learning.springdemo.config");

		ApplicationContext context=new AnnotationConfigApplicationContext("co.pragra.learning.springdemo");
		//now we say that all the sub packages should be considered.

		/* If we pass the base package instead of both classes specified separately, we get some error. It will say
		* no bean named car is available.  It can be resolved if we make the classes in that package as
		* configuration classes by adding the configuration annotation.*/
		//Here we passed the classes individually.
		//We changed the xml configuration context to Annotation configuration context.n

		/* After creating beans in xml, we need to create an application context. Now, we can select a bean from the
		 * application context.  */


		Car car1 = context.getBean("car", Car.class);

log.info("Car - {} ", car1);
//		System.out.println(car1);
//        Car car2 = context.getBean("car", Car.class);
//        System.out.println(car2);
        //Now, when we remove the Data marker from the Car class, change the scope to prototype,
        // and we can see that the beans are different.

//		User user = context.getBean("user", User.class);
//		System.out.println(user);
		// or we can write the same code above as
		//System.out.println(context.getBean(User.class));// this can also replace the above code. But, above code is preferred over this code.
		//In the above methods, we have created the beans using constructors and setters.
		//First one is called constructor based injection. When we are calling the constructors over the bean,
		//it is called constructor based injection.
		//Second one is setter based injection.When we are calling the properties over the bean, it is called the setter based injection.

//		((ConfigurableApplicationContext) context).registerShutdownHook();
		//select context.cast and make it a configurable context and register shutdown hook.
		//Now, the bean will call destroying.

		//How bean is getting managed?
	}
}

