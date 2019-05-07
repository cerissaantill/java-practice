package treehouse;

import java.util.ArrayList;
import java.util.List;



public class Lists {

    public static void main(String[] args) {
        List<String> groceryLine = new ArrayList<>();
        groceryLine.add("Jerome");
        groceryLine.add("Beth");
        groceryLine.add("Sam");

        System.out.println(groceryLine);



        // Remove an item from the list  (can use name or index)
        groceryLine.remove("Beth");
        System.out.println(groceryLine);


        // Accessing an item of the list:
        String jerome = groceryLine.get(0);
        System.out.println(jerome);


        // IndexOf() function:
        int samIndex = groceryLine.indexOf("Sam");
        System.out.println(samIndex);


        // Searching for an Object that doesn't exist in the list:
        samIndex = groceryLine.indexOf("Pam");   // samIndex already declared in scope, no need to declare type again.
        System.out.println(samIndex);


        // Since lists can change length, size() needs be a function instead of a property:
        System.out.println(groceryLine.size());   // returns 2


        // using size() with a forEach loop:
        for (String name : groceryLine) {
            System.out.println(name);            // printing the name variable
        }


        // Remove all items from list using clear():
        groceryLine.clear();




        // set() will set an item at a specified index


        // toArray() will return an array containing the same elements of the list,
        //  use when you have a function that takes in an array but you only have a list.



    }  // main method
}  // Lists class
