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
