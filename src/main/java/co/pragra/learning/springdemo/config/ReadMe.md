Now, instead of xml based configuration context we can 
go for an annotation based(Java based) configuration context. 
So, we change the XML based configuration to Annotation based 
configuration. 

We can pass either the base package(config) or we can pass the 
individual classes. 
the Slf4j annotation is used instead of sout statement. 

Instead of hardcoding the properties for the car, we can take the 
properties from the resources. 
For that, we created a file named car.properties in the resources.
Then, in the AppConfig class, we added an annotation
@PropertySource("classpath:car.properties"). 
We are saying that please use this properties file to get 
the values from the file. 

In order to get the values, spring uses another language called
SpEL(Spring Expression Language).
For that, we have to specify the values in the AppConfig class. 
We have created make, model properties in the AppConfig class and
passed them into the Car constructor. 

Now to get the values, we have to add @Value("${}"). To get 
a variable, you have to put a $ sign. we have to provide 
$ value for all the variables. 
But, we have to create the keys in the car.properties 
file as well. Then pass the values to the 
@Value("${car.make}") @Value("${car.model}"). Now, the 
context will fetch these values from the car.properties file. 

In the UserConfig, we are specifying the initialization method
inside the @bean(init-method, destroy-method). 

if we are writing an expression in SpEL, we have to use
 hash symbol {"""}# 

We can use the base package and make it as the annotation configuration
application context. In that case, we have to make sure that
all the configuration classes we are using for the configuration has to 
be marked as @Configuration. Only then we can make the
base package as path file for the application context. Then, 
spring will pick up the classes which we annotated as configuration. 

We don't have to configure every class we wanted. Spring has another
way to configure the classes. Spring can scan the domain
classes. If we want a class to be automatically beaned out, 
we can mark that class in the domain package with a @Component annotation. 
Then, spring will be able to create beans automatically. 
In this scenario, the constructor has to be called. 
So, we need to pass the values to the constructor 
using the @Values annotation. 

we have a UserConfig, so we don't do anything on it. 
If we run the program by creating application context from 
the config package, it will throw error. Because it cannot create
bean from that package. So, we change the base package to
co.pragra.learning.springdemo. 

If we put @Component annotation in both Electric engine and 
Petrol engine, then spring will be confused to create which 
bean. So, it will show no qualifying bean of type Engine 
available: expected single matching, but found two. 

So, in this case we have to specify the qualifying bean. 




