package SoloLearn.Java;

public class OverridingsOverloadings {
    /*
     * 
As we saw in the previous lesson, a subclass can define a behavior that's specific to the subclass type, meaning that a subclass can implement a parent class method based on its requirement.

This feature is known as method overriding.

class Animal {
    public void makeSound() {
        System.out.println("Grr...");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

In the code above, the Cat class overrides the makeSound() method of its superclass Animal.

Rules for Method Overriding:

- Should have the same return type and arguments

- The access level cannot be more restrictive than the overridden method's access level (Example: If the superclass method is declared public, the overriding method in the sub class can be neither private nor protected)

- A method declared final or static cannot be overridden

- If a method cannot be inherited, it cannot be overridden

- Constructors cannot be overridden

Note : Method overriding is also known as runtime polymorphism.



When methods have the same name, but different parameters, it is known as method overloading.

This can be very useful when you need the same method functionality for different types of parameters.

The following example illustrates a method that returns the maximum of its two parameters.

int max(int a, int b) {
  if(a > b) {
    return a;
  }
  else {
    return b;
  }
}

The method shown above will only work for parameters of type integer.

However, we might want to use it for doubles, as well. For that, you need to overload the max method

double max(double a, double b) {
  if(a > b) {
    return a;
  }
  else {
    return b;
  }
}

Now, our max method will also work with doubles.

An overloaded method must have a different argument list; the parameters should differ in their type, number, or both.

Note : Another name for method overloading is compile-time polymorphism.


     */
}
