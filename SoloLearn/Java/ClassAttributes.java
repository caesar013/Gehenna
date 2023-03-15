package SoloLearn.Java;
public class ClassAttributes {
    /**
     * A class has attributes and methods. The attributes are basically variables
     * within a class.
     * Let's create a class called Vehicle, with its corresponding attributes and
     * methods.
     */

    

    /**
     * maxSpeed, wheels, color and fuelCapacity are the attributes of our Vehicle
     * class, and horn() is the only method.
     */

    // You can define as many attributes and methods as necessary.

    /**
     * Next, we can create multiple objects of our Vehicle class, and use the dot
     * syntax to access their attributes and methods.
     */

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        v1.color = "red";
        v2.horn();
    }
}

class Vehicle{
        int maxSpeed, wheels;
        String color;
        double fuelCapacity;

        void horn() {
            System.out.println("Beep!");
        }
    }