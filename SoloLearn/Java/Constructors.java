package SoloLearn.Java;
/**
 * Constructors are special methods invoked when an object is created and are
 * used to initialize them.
 * A constructor can be used to provide initial values for object attributes.
 * 
 * - A constructor name must be same as its class name.
 * - A constructor must have no explicit return type.
 */

 class Vehicle {
    private String color;

    Vehicle() {
        color = "Red";
    }

    // I create this Getter only for I not getting any warning bullshits. 
    // You may ignore it as it doesn't have any relation in this subject we're discussing.
    public String getColor(){
        return this.color;
    }
}

/**
 * The Vehicle() method is the constructor of our class, so whenever an object
 * of that class is created, the color attribute will be set to "Red".
 * A constructor can also take parameters to initialize attributes.
 */

 class Vehicle2 {
    private String color;

    Vehicle2(String c) {
        this.color = c;
    }

    // this getter below also has the same reason as its sibling you'll read 
    public String getColor(){
        return this.color;
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
        //Vehicle v1 = new Vehicle("Blue"); -> This won't work because we don't have the constructor with the parameter.

        // color will be "Red"(by Default)
        Vehicle v2 = new Vehicle();

        // third3:

        // color will be "Red"
        Vehicle3 v3 = new Vehicle3();

        // color will be "Green"
        Vehicle3 v4 = new Vehicle3("Green");

        // These command below also just because I hate getting some warning. 
        // They don't actually have particular meaning what-so-ever
        v2.toString();
        v3.toString();
        v4.toString();

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

 class Vehicle3 {
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

    // I set this Getter just so the code won't give me a lil annoying warning
    public String getColor(){
        return this.color;
    }

    /**
     * The class above has two constructors, one without any parameters setting the
     * color attribute to a default value of "Red", and another constructor that
     * accepts a parameter and assigns it to the attribute.
     */

    // Now, we can use the constructors to create objects of our class.

    // check the main function. I'll mark it with third3
}
