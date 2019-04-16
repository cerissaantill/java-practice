package udemy;

/*
Write a class with the name udemy.SumCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.

Write the following methods (instance methods):

*Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
*Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
*Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
*Method named setSecondNumber wthith one parameter of type double, it needs to set the value of the secondNumberfield.
*Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
*Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
*Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
*Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.

TEST EXAMPLE

TEST CODE:
udemy.SumCalculator calculator = new udemy.SumCalculator();
calculator.setFirstNumber(5.0);
calculator.setSecondNumber(4);
System.out.println("add= " + calculator.getAdditionResult());
System.out.println("subtract= " + calculator.getSubtractionResult());
calculator.setFirstNumber(5.25);
calculator.setSecondNumber(0);
System.out.println("multiply= " + calculator.getMultiplicationResult());
System.out.println("divide= " + calculator.getDivisionResult());

OUTPUT
add= 9.0
subtract= 1.0
multiply= 0.0
divide= 0.0

TIPS:
*add= 9.0 is printed because 5.0 + 4 is 9.0
*subtract= 1.0 is printed because 5.0 - 4 is 1.0
*multiply= 0.0 is printed because 5.25 * 0 is 0.0
*divide= 0.0 is printed because secondNumber is set to 0


NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 8 methods.
NOTE: Do not add the main method to the solution code.
*/


    public class SumCalculator {


        private double firstNumber;
        private double secondNumber;

        public double getFirstNumber() {
            return firstNumber;
        }

        public double getSecondNumber() {
            return secondNumber;
        }

        public double setFirstNumber(double num){
            this.firstNumber = firstNumber;
            return  firstNumber;
        }

        public double setSecondNumber(double num){
            this.secondNumber = secondNumber;
            return secondNumber;
        }

        public double getAdditionResult() {
            double sum = (firstNumber + secondNumber);
            return sum;
        }

        public double getSubtractionResult() {
            double difference = (secondNumber - firstNumber);
            return difference;
        }

        public double getMultiplicationResult() {
            double product = (firstNumber * secondNumber);
            return product;
        }

        public double getDivisionResult() {
            double quotient = (firstNumber / secondNumber);
            return quotient;
//            if  (secondNumber == 0) {
//                int i = 0;
//                return i;
//            }
        }




}  // udemy.SumCalculator class
