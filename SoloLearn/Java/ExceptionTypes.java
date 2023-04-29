package SoloLearn.Java;

public class ExceptionTypes {
    /*


There are two exception types, checked and unchecked (also called runtime). 
The main difference is that checked exceptions are checked when compiled, while unchecked exceptions are checked at runtime.

As mentioned in our previous lesson, Thread.sleep() throws an InterruptedException. 
This is an example of a checked exception. Your code will not compile until you've handled the exception.

public class MyClass {
  public static void main(String[ ] args) {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      //some code
    }
  }
}

We have seen examples of unchecked exceptions, which are checked at runtime, in previous lessons.

public class MyClass {
  public static void main(String[ ] args) {
    int value = 7;
    value = value / 0;
  }
}

Exception in thread "main" java.lang.ArithmeticException: / by zero
  at MyClass.main(MyClass.java:4)


It is good to know the Types of Exceptions because they can help you debug your code faster.


  */

}
