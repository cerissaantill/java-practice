package udemy;
// Create a new class udemy.VipCustomer.

// It should have 3 fields: name, credit limit, email address.

// Create 3 constructors:
//      1st constructor empty should call the constructor
//          with 3 parameters with default values.
//      2nd constructor should pass on the 2 values it receives and
//          add a default value for the 3rd.
//      3rd constructor should save all fields.

// Create getters only for this using code generated from Intellij as
//    setters won't be needed.

// Test and confirm it works.



public class VipCustomer {

    // Fields

    private String name;
    private double creditLimit;
    private String emailAddress;


////////////////////////////////

    // 1st Constructor

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }



    // 2nd Constructor

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }



    // 3rd Constructor

    public VipCustomer() {
        this("Default name", 50000.00, "default@email.com");
    }

///////////////////////////////


    // Getters:

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }





}  //udemy.VipCustomer class
