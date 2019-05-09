package codingBat;

public class sumDouble {

/** Given two int values, return their sum.
    Unless the two values are the same, then return double their sum.

    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8
*/

    public int sumDouble(int a, int b) {
        // store the sum in a local variable:
        int sum = a + b;

        // double it if a and b are the same:
        if (a == b) {
            sum = sum * 2;
        }
        return sum;
    }

}  // sumDouble class
