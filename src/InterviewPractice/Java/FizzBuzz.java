package InterviewPractice.Java;
import java.lang.String;
import java.util.*;


public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizz buzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            }

        }  // for loop

    }  // main method
}  // FizzBuzz class
