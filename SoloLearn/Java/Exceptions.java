package SoloLearn.Java;

public class Exceptions {
    /*

An exception is a problem that occurs during program execution. Exceptions cause abnormal termination of the program.

Exception handling is a powerful mechanism that handles runtime errors to maintain normal application flow.

An exception can occur for many different reasons. Some examples:

- A user has entered invalid data.

- A file that needs to be opened cannot be found.

- A network connection has been lost in the middle of communications.

- Insufficient memory and other issues related to physical resources.


As you can see, exceptions are caused by user error, programmer error, or physical resource issues. 
However, a well-written program should handle all possible exceptions.


Exceptions can be caught using a combination of the try and catch keywords.

A try/catch block is placed around the code that might generate an exception.

    try {
        //some code
    } catch (Exception e) {
        //some code to handle errors
    }

A catch statement involves declaring the type of exception you are trying to catch. If an exception occurs in the try block, the catch block that follows the try is checked. If the type of exception that occurred is listed in a catch block, the exception is passed to the catch block much as an argument is passed into a method parameter.

The Exception type can be used to catch all possible exceptions.

A catch statement involves declaring the type of exception you are trying to catch. If an exception occurs in the try block, the catch block that follows the try is checked. If the type of exception that occurred is listed in a catch block, the exception is passed to the catch block much as an argument is passed into a method parameter.

The Exception type can be used to catch all possible exceptions.

The example below demonstrates exception handling when trying to access an array index that does not exist

public class MyClass {
  public static void main(String[ ] args) {
    try {
      int a[ ] = new int[2];
      System.out.println(a[5]);
    } catch (Exception e) {
      System.out.println("An error occurred");
    }
  }
}

Without the try/catch block this code should crash the program, as a[5] does not exist.


Notice the (Exception e) statement in the catch block - it is used to catch all possible Exceptions.


     */
}
