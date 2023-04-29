package SoloLearn.Java;

import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {
    /*
     * 
     * Arrays and Lists store elements as ordered collections, with each element
     * given an integer index.
     * 
     * HashMap is used for storing data collections as key and value pairs. One
     * object is used as a key (index) to another object (the value).
     * 
     * The put, remove, and get methods are used to add, delete, and access values
     * in the HashMap.
     * 
     * import java.util.HashMap;
     * public class MyClass {
     * public static void main(String[ ] args) {
     * HashMap<String, Integer> points = new HashMap<String, Integer>();
     * points.put("Amy", 154);
     * points.put("Dave", 42);
     * points.put("Rob", 733);
     * System.out.println(points.get("Dave"));
     * }
     * }
     * 
     * We have created a HashMap with Strings as its keys and Integers as its
     * values.
     * 
     * Use the get method and the corresponding key to access the HashMap elements.
     * 
     * 
     * 
     * A HashMap cannot contain duplicate keys. Adding a new item with a key that
     * already exists overwrites the old element.
     * 
     * The HashMap class provides containsKey and containsValue methods that
     * determine the presence of a specified key or value.
     * 
     * If you try to get a value that is not present in your map, it returns the
     * value of null.
     * 
     * 
     * Note : null is a special type that represents the absence of a value.
     * 
     * 
     * The program you are given defines and outputs HashMap, where the names of
     * employees are stored as keys, and their ages as values.
     * 
     * It also takes N number from user as age limit. Write code to delete all the
     * employees whom age is less than N number.
     * 
     * The line of code for the output of HashMap object is already provided.
     * 
     * 
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("David", 22);
        ages.put("Tom", 23);
        ages.put("Robert", 32);
        ages.put("Alice", 21);
        ages.put("Sophie", 19);
        ages.put("Maria", 24);
        ages.put("John", 28);

        String[] nameArr = new String[ages.size()];
        nameArr = ages.keySet().toArray(nameArr);

        int ageLimit = scanner.nextInt();

        scanner.close();

        for (String emp : nameArr) {
            // your code goes here
            if (ages.get(emp) < ageLimit) {
                ages.remove(emp);
            }
        }

        System.out.println(ages);
    }
}
