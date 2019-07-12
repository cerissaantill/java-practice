package InterviewPractice;

import java.lang.String;

// 1.  Sort through an array of Strings, return a boolean if it exists.
//      “You’re going to loop through the array and compare it to each item in the array.”

// BE ABLE TO DO THIS ON A WHITEBOARD IN Java & JavaScript ****


public class StringsArray {

    static boolean search(String[] array, String searchTerm) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(searchTerm)) return true;
        }
                return true;
        }

    public static void main(String[] args) {

        String[] fruit = {"Apple", "Banana", "Mango", "Cherry", "Kiwi"};
        String favoriteFruit = "Mango";
        System.out.println(search(fruit, favoriteFruit));
    }
}

