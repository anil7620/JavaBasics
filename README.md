# # Interface in Java

An  **interface in Java**  is a blueprint of a class. It has static constants and abstract methods.

The interface in Java is  _a mechanism to achieve  abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple  inheritance in Java.

In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.

Java Interface also  **represents the IS-A relationship**.

It cannot be instantiated just like the abstract class.

Since Java 8, we can have  **default and static methods**  in an interface.

Since Java 9, we can have  **private methods**  in an interface.

# ## Why use Java interface?

There are mainly three reasons to use interface. They are given below.

-   It is used to achieve abstraction.
-   By interface, we can support the functionality of multiple inheritance.
-   It can be used to achieve loose coupling.

 # ## More About Java Interface?
 [Click here!](https://www.javatpoint.com/interface-in-java)


# ## Abstract Class

The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes). We use the  `abstract`  keyword to declare an abstract class. ,



## Java Abstract Method

A method that doesn't have its body is known as an abstract method. We use the same  `abstract`  keyword to create abstract methods. For example,
```
abstract void display();
```
 # ## More About Java Abstract?
 [Click here!](https://www.javatpoint.com/abstract-class-in-java)

# Concrete class in Java
A  **concrete class**  is a class that has an implementation for all of its methods. They cannot have any unimplemented methods. It can also extend an  abstract class or implement an   interface   as long as it implements all their methods. It is a complete class and can be instantiated.

In other words, we can say that any class which is not abstract is a concrete class.

**Necessary condition for a concrete class:**  There must be an implementation for each and every method.

# Method Overriding in Java

If subclass (child class) has the same method as declared in the parent class, it is known as  **method overriding in Java**.

In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.

### Usage of Java Method Overriding

-   Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
-   Method overriding is used for runtime polymorphism

#### Rules for Java Method Overriding

1.  The method must have the same name as in the parent class
2.  The method must have the same parameter as in the parent class.
3.  There must be an IS-A relationship (inheritance).

 # ## More About Java Interface?
 [Click here!](https://www.javatpoint.com/method-overriding-in-java)
