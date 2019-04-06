public class AccountMain {

    public static void main(String[] args) {

        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.

        // Create getters and setters for each field

        // Create two additional methods
        //      1. To allow the customer to deposit funds (this should increment the balance field).
        //      2. To allow the customer to withdraw funds. This should deduct from the balance field,
        //          but not allow the withdrawal to complete if their are insufficient funds.

        // You will want to create various code in the Main class (the one created by IntelliJ) to
        //      confirm your code is working.

        // Add some System.out.println's in the two methods above as well.


        Account bobsAccount = new Account();

        // control N will auto-populate the constructors below:

        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmailAddress("myemail@bob.com");
        bobsAccount.setCustomerPhoneNumber("(087)345-6789");


        bobsAccount.withdrawal(100.00);

        bobsAccount.deposit(50.00);
        bobsAccount.withdrawal(100.00);

        bobsAccount.deposit(51.00);
        bobsAccount.withdrawal(100.00);



    }  // main method

}  // AccountsMain class
