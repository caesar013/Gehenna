/**
 * Constructors are special methods invoked when an object is created and are
 * used to initialize them.
 * A constructor can be used to provide initial values for object attributes.
 * 
 * - A constructor name must be same as its class name.
 * - A constructor must have no explicit return type.
 */

public class Vehicle {
    private String color;

    Vehicle() {
        color = "Red";
    }
}

/**
 * The Vehicle() method is the constructor of our class, so whenever an object
 * of that class is created, the color attribute will be set to "Red".
 * A constructor can also take parameters to initialize attributes.
 */

public class Vehicle2 {
    private String color;

    Vehicle(String c) {
        color = c;
    }
}

/**
 * You can think of constructors as methods that will set up your class by
 * default, so you don’t need to repeat the same code every time.
 */

/**
 * The constructor is called when you create an object using the new keyword.
 */

/** */

public class Constructors {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Blue");

        // color will be "Red"(by Default)
        Vehicle v2 = new Vehicle();

        // third3:

        // color will be "Red"
        Vehicle3 v1 = new Vehicle3();

        // color will be "Green"
        Vehicle3 v2 = new Vehicle3("Green");

        /**
         * Java automatically provides a default constructor, so all classes have a
         * constructor, whether one is specifically defined or not.
         */
    }
}

/**
 * This will call the constructor, which will set the color attribute to "Blue".
 */

/**
 * A single class can have multiple constructors with different numbers of
 * parameters.
 * The setter methods inside the constructors can be used to set the attribute
 * values.
 */

public class Vehicle3 {
    private String color;

    Vehicle3() {
        this.setColor("Red");
    }

    Vehicle3(String c) {
        this.setColor(c);
    }

    // Setter
    public void setColor(String c) {
        this.color = c;
    }

    /**
     * The class above has two constructors, one without any parameters setting the
     * color attribute to a default value of "Red", and another constructor that
     * accepts a parameter and assigns it to the attribute.
     */

    // Now, we can use the constructors to create objects of our class.

    // check the main function. I'll mark it with third3
}
