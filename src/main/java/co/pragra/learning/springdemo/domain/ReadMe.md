###Spread operator ...
The spread operator is used to create some easiness in writing codes.
It also creates an array behind the scenes. But it gives us flexibility. 

Instead of writing 

**public static void printGreet(String [] arr){}**

we can use the spread operator like below. 

public static void printGreet(String... arr){}

We can pass an array of size 0 to any number of array. 
But, if we need to make sure at least 1 value is required,
rewrite the code as

public static void printGreet(String name, String... arr){}

This will make sure that at least one value is passed into the array. 
Spread will take a zero value to any number of values. 

Even for the psvm or  public static void main(String... args), 

we can replace the square bracket with the spread operator. 
It is a valid piece of code. 

When constructor calls are blocked, they will typically gives us 
factory methods to get a object. 
For example, in the NumberFormat class, we can see that
the constructors are protected. So, we can't call it. 

We can define the factory method inside the bean.(xml file) 
Spring will call the factory method to get the object,and 
we can pass it to the bean. 

Spring actually creates bean by using a factory. 

##Maintaining beans: Bean Life Cycle.
By default, every bean in the spring is singleton. 
By default, if we go and ask for a bean, spring will only 
create one instance of the bean, and it will keep on passing
the same to you. So, singleton means only one instance will
be maintained. 

**If we go and create car1 and car2**


If we go and  look at the scope in the bean.xml, we can see
2 options. singleton and prototype. By default, the scope 
of the bean will be singleton. But, if we go and change 
the scope to prototype, the beans will be different. 

In singleton, spring maintains only one copy of the bean. In
prototype, spring creates the bean whenever you ask. 


If we are not asking or printing for the beans from 
the main, spring will create the beans. Unless we specify
lazy-init in the scope part, spring will create the bean.
Spring will not create the bean if we are not asking 
for the beans in the prototype scope. 

if we use lazy-init in the scope part, spring will not 
create a bean. In the lazy-init scope,
spring will create a bean only if we ask for it. 
