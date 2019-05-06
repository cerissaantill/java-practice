package InterviewPractice;

//    1. Sort through an array of strings or numbers, return a boolean if it exists.
//        “You’re going to loop through the array and compare it to each item in the array.”

//   *** BE ABLE TO DO THIS ON A WHITEBOARD IN Java & JavaScript ****


public class NumbersArray {

        static boolean search(int[] array, int number) {
            boolean found = false;
            for(int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    return true;
                }
            }
            return found;
        }

        public static void main(String[] args) {
            int[] nums = {126, 4, 21, 12, 10008, 333, -42, 10, 007};
            int lookingFor = 4;
            System.out.println(search(nums, lookingFor));

            // now write a method above psvm named search that will loop through the array and return a boolean.


        }  // main method
    } // StringsArray class

