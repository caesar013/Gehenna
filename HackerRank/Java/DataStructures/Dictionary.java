package HackerRank.Java.DataStructures;

import java.util.Map;
import java.util.HashMap;

public class Dictionary {

    public static void main(String[] args) {
        // English to Spanish Dictionary
        Map<String, String> engSpanDictionary = new HashMap<String, String>();
        // putting things into Dictionary
        engSpanDictionary.put("Monday", "Lunes");
        engSpanDictionary.put("Tuesday", "Martes");
        engSpanDictionary.put("Wednesday", "Miercoles");
        engSpanDictionary.put("Thursday", "Jueves");
        engSpanDictionary.put("Friday", "Viernes");
        engSpanDictionary.put("Saturday", "Sabado");
        engSpanDictionary.put("Sunday", "Domingo");
        // Retrieve things from Dictionary
        System.out.println(engSpanDictionary.get("Monday"));
        System.out.println(engSpanDictionary.get("Tuesday"));
        System.out.println(engSpanDictionary.get("Wednesday"));
        System.out.println(engSpanDictionary.get("Thursday"));
        System.out.println(engSpanDictionary.get("Friday"));
        System.out.println(engSpanDictionary.get("Saturday"));
        System.out.println(engSpanDictionary.get("Sunday"));
        // Print out all keys
        System.out.println(engSpanDictionary.keySet());
        // Print out all values
        System.out.println(engSpanDictionary.values());
        // Print out size
        System.out.println("The size of our dictionary is " + engSpanDictionary.size());

        System.out.println();
        System.out.println();

        // Shopping List
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        // Put some stuff in dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);
        // Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Eggs"));
        // Remove item
        shoppingList.remove("Eggs");
        // Replace value for certain key
        shoppingList.replace("Oreos", false);
        // Print Key-Value pairs
        System.out.println(shoppingList.toString());
        // Clear our Dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        System.out.println("Is our dictionary empty? " + shoppingList.isEmpty());
    }
}
