package InterviewPractice.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicatesFromArrays {

    public static void main(String[] args) {

        // Create a new array that contains instances that exist in both array1 and array2

        // first array
        List<Integer> array1 = new ArrayList<>(Arrays.asList(1, 5, 6, 9, 11));

        // second array to compare
        List<Integer> array2 = new ArrayList<>(Arrays.asList(1, 5, 3, 8, 11));

        // new array that will contain the matched instances
        List<Integer> newArray = new ArrayList<>();


        for (int i = 0; i < array1.size(); i++) {
            for (int j = 0; j < array2.size(); j++) {
                if (array1.get(i) == array2.get(j)) {
                    newArray.add(array1.get(i));
                }
            }
        }

        // this will print out "1, 5, 11"
        for (Integer i : newArray) {
            System.out.println(i);
        }



    } // main method
}  // DuplicatesFromArrays class
