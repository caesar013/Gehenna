package SoloLearn.Java;

public class Inheritances {
    /*
     *
     * Inheritance is the process that enables one class to acquire the properties (methods and variables) of another. With inheritance, the information is placed in a more manageable, hierarchical order.
     * The class inheriting the properties of another is the subclass (also called derived class, or child class); the class whose properties are inherited is the superclass (base class, or parent class).
     * To inherit from a class, use the extends keyword.
     * This example shows how to have the class Dog to inherit from the class Animal. 
     */

     // class Dog extends Animal {}

     // Here, Dog is the subclass, and Animal is the superclass.

     /*
      * When one class is inherited from another class, it inherits all of the superclass' non-private variables and methods.
      */

      /*
       * class Animal {
  protected int legs;
  public void eat() {
    System.out.println("Animal eats");
  }
}

class Dog [b]extends [/b]Animal {
  Dog() {
    legs = 4;
  }
}
       */

//        As you can see, the Dog class inherits the legs variable from the Animal class.

//        We can now declare a Dog object and call the eat method of its superclass

    /*
     * class MyClass {
  public static void main(String[ ] args) {
    Dog d = new Dog();
    d.eat();
  }
}
     */

     // Recall the protected access modifier, which makes the members visible only to the subclasses.

     /**
      * Constructors are not member methods, and so are not inherited by subclasses.

However, the constructor of the superclass is called when the subclass is instantiated.
      */

      /**
       * class A {
  public A() {
    System.out.println("New A");
  }
}
class B extends A {
  public B() {
    System.out.println("New B");
  }
}

class Program {
  public static void main(String[ ] args) {
      B obj = new B();
  }
}
       */

    // You can access the superclass from the subclass using the super keyword.

    // For example, super.var accesses the var member of the superclass.
    
    
}
