package SoloLearn.Java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SortingLists {
    /*

For the manipulation of data in different collection types, the Java API provides a Collections class, which is included in the java.util package.

One of the most popular Collections class methods is sort(), which sorts the elements of your collection type. 
The methods in the Collections class are static, so you don't need a Collections object to call them.

public class MyClass {
  public static void main(String[ ] args) {
    ArrayList<String> animals = new ArrayList<String>();
    animals.add("tiger");
    animals.add("cat");
    animals.add("snake");
    animals.add("dog");
       
    Collections.sort(animals);
       
    System.out.println(animals);
  }
}

As you can see, the elements have been sorted alphabetically.

You can call the sort() methods on different types of Lists, such as Integers.

import java.util.ArrayList;
import java.util.Collections;

public class MyClass {
  public static void main(String[ ] args) {
    ArrayList<Integer> nums = new ArrayList<Integer>();
    nums.add(3);
    nums.add(36);
    nums.add(73);
    nums.add(40);
    nums.add(1);

    Collections.sort(nums);
    System.out.println(nums);
  }
}

Other useful methods in the Collections class:

max(Collection c): Returns the maximum element in c as determined by natural ordering.

min(Collection c): Returns the minimum element in c as determined by natural ordering.

reverse(List list): Reverses the sequence in list.

shuffle(List list): Shuffles (i.e., randomizes) the elements in list.


The program you are given declares ArrayList of integers.

Complete the program to take numbers as input and add them to ArrayList until its size isn't equal to 5. 
Then output its maximum and minimum values.
     */

        public static void main(String[ ] args) {
            ArrayList<Integer> nums = new ArrayList<Integer>();
            
            Scanner scanner = new Scanner(System.in);
            
            while(nums.size()<5){
                int num = scanner.nextInt();
                //your code goes here
                nums.add(num);
            }
            scanner.close();
            
            //your code goes here
            System.out.println(Collections.max(nums));
            System.out.println(Collections.min(nums));
        }
}
