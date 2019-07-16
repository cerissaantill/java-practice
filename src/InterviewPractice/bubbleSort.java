package InterviewPractice;

public class bubbleSort {

    public static void main(String[] args) {

        int[] numbers = {15, 30, 5, 26, 77, 43, 61};

        for (int j=0; j < numbers.length; j++) {
            boolean swapped = false;                        // initially swapped is false
            int i = 0;
            while (i < 7-1) {

                if (numbers[i] > numbers[i+1]) {          //  comparing adjacent elements
                    int temp = numbers[i];                  // swapping:
                    numbers[i] = numbers[i+1];
                    numbers[i] = temp;

                    swapped = true;                         // changing value of swapped
                }
                i++;

            } // while

            if (!swapped)                                   // if swapped is false then the
                break;                                      // array is sorted, stop the loop.
        } // for

        for(int x : numbers) {
            System.out.println(x);
        }
    } // main








//    public static void main (String[] args)
//    {
//        int a[] = {16, 19, 11, 15, 10, 12, 14};
//
//        for(int j = 0; j<a.length; j++)
//        {
//            //initially swapped is false
//            boolean swapped = false;
//            int i = 0;
//            while(i<7-1)
//            {
//                //comparing the adjacent elements
//                if (a[i] > a[i+1])
//                {
//                    //swapping
//                    int temp = a[i];
//                    a[i] = a[i+1];
//                    a[i+1] = temp;
//                    //Changing the value of swapped
//                    swapped = true;
//                }
//                i++;
//            }
//            //if swapped is false then the array is sorted
//            //we can stop the loop
//            if (!swapped)
//                break;
//        }
//
//        for(int x : a)
//        {
//            System.out.println(x);
//        }
//
//    }





} // bubbleSort class
