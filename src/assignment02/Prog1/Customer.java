package assignment02.Prog1;

public class Customer {

    private String firstName, lastName, socSecurityNum;
    private Address billingAddress;
    private Address shippingAddress;


    public Customer(String fname, String lname, String socSNum) {

        firstName = fname;
        lastName = lname;
        socSecurityNum = socSNum;
    }


    public String getSocSecurityNum() {
        return socSecurityNum;
    }

    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    public String toString() {
        return STR."[\{firstName}, \{lastName}, ssn: \{socSecurityNum}]";
    }
}
