package InterviewPractice;

public class bubbleSort {

    public static void main(String[] args) {

        int numbers = {15, 30, 5, 26, 77, 43, 61};

        for (int j=0; j < numbers.length; j++) {
            boolean swapped = false;                        // initially swapped is false
            int i = 0;
            while (i < 7-1) {

                if (numbers[i] > numbers[i + 1]) {          //  comparing adjacent elements
                    int temp = numbers[i];                  // swapping (lines 15-17)
                    numbers[i] = numbers[i + 1];
                    numbers[i] = temp;

                    swapped = true;                         // changing value of swapped
                }
                i++;

            } // while

            if (!swapped)                                   // if swapped is false then the
                break;                                      // array is sorted, stop the loop.
        } // for loop

    } // main
} // bubbleSort class
