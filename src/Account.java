

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.

// Create getters and setters for each field

// Create two additional methods
//  1. To allow the customer to deposit funds (this should increment the balance field).
//  2. To allow the customer to withdraw funds. This should deduct from the balance field,
//      but not allow the withdrawal to complete if their are insufficient funds.

// You will want to create various code in the Main class (the one created by IntelliJ) to
//  confirm your code is working.

// Add some System.out.println's in the two methods above as well.


public class Account {

    // creating fields for requested variables:
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;
    // after declaring variables above, select command + N
    //  to auto-populate the getters and setters.


    public Account() {
        System.out.println("Empty constructor called.");
    }


    // method 1:

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    // method 2:

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not able to be processed.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }




    // GETTERS

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double valance) {
        this.balance = valance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }


    // SETTERS

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }


//    private String number;
//    private double balance;
//    private String customerName;
//    private String customerEmailAddress;
//    private String customerPhoneNumber;
//
//    public Account() {
//        this("56789", 2.50, "Default name", "Default address", "default phone");
//        System.out.println("Empty constructor called");
//    }
//
//    public Account(String number, double balance, String customerName, String customerEmailAddress,
//                   String customerPhoneNumber) {
//        System.out.println("Account constructor with parameters called");
//        this.number = number;
//        this.balance = balance;
//        this.customerName = customerName;
//        this.customerEmailAddress = customerEmailAddress;
//        this.customerPhoneNumber = customerPhoneNumber;
//    }
//
//    public void deposit(double depositAmount) {
//        this.balance += depositAmount;
//        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
//    }
//
//    public void withdrawal(double withdrawalAmount) {
//        if(this.balance - withdrawalAmount < 0) {
//            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
//        } else {
//            this.balance -= withdrawalAmount;
//            System.out.println("Withdrawal of " + withdrawalAmount + " processed, Remaining balance = " + this.balance);
//        }
//    }
//
//    public String getNumber() {
//        return number;
//    }
//
//    public void setNumber(String number) {
//        this.number = number;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public String getCustomerEmailAddress() {
//        return customerEmailAddress;
//    }
//
//    public void setCustomerEmailAddress(String customerEmailAddress) {
//        this.customerEmailAddress = customerEmailAddress;
//    }
//
//    public String getCustomerPhoneNumber() {
//        return customerPhoneNumber;
//    }
//
//    public void setCustomerPhoneNumber(String customerPhoneNumber) {
//        this.customerPhoneNumber = customerPhoneNumber;
//    }


}
