
// Create a new class VipCustomer.

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

    private String customerName;
    private double customerCreditLimit;
    private String customerEmailAddress;


    // 1st Constructor

    public VipCustomer(String customerName, double customerCreditLimit, String customerEmailAddress) {
        this.customerName = customerName;
        this.customerCreditLimit = customerCreditLimit;
        this.customerEmailAddress = customerEmailAddress;
    }



    // 2nd Constructor

    public VipCustomer() {
    this("Cerissa Tottenham", 9000, "cerissa@email.com");
        System.out.println("Empty (2nd) Constructor called.");
    }



    // 3rd Constructor

    public VipCustomer() {

    }



    // Getters:

    public String getCustomerName() {
        return this.customerName;
    }

    public double getCustomerCreditLimit() {
        return this.customerCreditLimit;
    }

    public String getCustomerEmailAddress() {
        return this.customerEmailAddress;
    }





}  //VipCustomer class
