package assignment02.Prog1;

public class Main {


    public static void main(String[] args) {

        Address address1 = new Address("123 Main St", "Chicago", "IL", "60601");
        Address address2 = new Address("1000 N 4th Street", "FairField", "IA", "52557");
        Address address3 = new Address("789 Oak St", "San Francisco", "CA", "94102");

        Customer c1 = new Customer("Alex", "Smith", "332-291-4444");
        c1.setBillingAddress(address1);
        c1.setShippingAddress(address3);

        Customer c2 = new Customer("Kheang", "Doe", "554-332-1234");
        c2.setBillingAddress(address2);
        c2.setShippingAddress(address3);

        Customer c3 = new Customer("Bishnu", "Pokhrel", "641-819-2400");
        c3.setBillingAddress(address1);
        c3.setShippingAddress(address2);

        Customer[] customers = {c1, c2, c3};

        for (Customer customer : customers) {
            if (customer.getBillingAddress().getCity().equals("Chicago")) {
                System.out.println(customer);
            }
        }
    }
}
