package InterviewPractice;

import java.lang.String;


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

        String[] fruit = {"Apple", "Banana", "Mango", "Durian", "Kiwi"};
        String favoriteFruit = "Mango";
        System.out.println(search(fruit, favoriteFruit));
    }
}

