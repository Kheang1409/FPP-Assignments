package assignment10.prog2;

public class CustomerAccountTest {
    public static void main(String[] args) {
        CustomerAccount customer = new CustomerAccount("Taing, Hang Kheang", "6412330129", 1_000_000L);

        try{
            CustomerAccount customer_neg = new CustomerAccount("Taing, Hang Kheang", "6412330129", -1_000_000L);
        }
        catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(customer);
        System.out.println(customer.deposit(-100) ? "Deposit Successfully!": "");
        System.out.println(customer.deposit(100) ? "Deposit Successfully!": "");
        System.out.println(customer.withdraw(-100) ? "Withdraw Successfully!": "");
        System.out.println(customer.withdraw(2_000_000L) ? "Withdraw Successfully!": "");
        System.out.println(customer.withdraw(999_900L) ? "Withdraw Successfully!": "");
        System.out.println(customer.withdraw(180) ? "Withdraw Successfully!": "");
        System.out.println(customer);
    }
}
