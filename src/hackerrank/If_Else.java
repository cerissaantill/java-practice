package hackerrank;
import java.util.Scanner;

//    Given an integer, n ,perform the following conditional actions:
//
//    If n is odd, print Weird
//    If n is even and in the inclusive range of 2 to 5, print "Not Weird"
//    If n is even and in the inclusive range of 6 to 20, print "Weird"
//    If n is even and greater than 20, print "Not Weird"
//    Complete the stub code provided in your editor to print whether or not n is weird.

//    Input Format:
//    A single line containing a positive integer, n.



public class If_Else {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        if ((n % 2) == 1) {
            System.out.print("Weird");

        } else if
            (n >= 2 && n <= 5) {
            System.out.print("Not Weird");

        } else if
            (n >= 6 && n <= 20) {
            System.out.print("Weird");

        } else if
            ((n % 2 == 0) && n > 20) {
            System.out.print("Not Weird");
        }


        scanner.close();
    }
}




