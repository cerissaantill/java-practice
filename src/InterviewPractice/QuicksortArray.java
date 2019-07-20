package InterviewPractice;

import java.util.Arrays;

public class QuicksortArray {

    public static void main(String[] args) {

        int [] unsortedArr = {10,8,7,3,2,1,5,4,6,9};
        System.out.println("Unsorted array: " + Arrays.toString(unsortedArr));

        // sorting int array
        Arrays.sort(unsortedArr);

        System.out.println("Sorted array: " + Arrays.toString(unsortedArr));
    }
}
