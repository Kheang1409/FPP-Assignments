package assignment10.prog2;

import static java.lang.StringTemplate.STR;

public class CustomerAccount {
    private String cusName;
    private String accNo;
    private double balance;

    public CustomerAccount(String cusName, String accNo, double balance) throws IllegalArgumentException{
        this.cusName = cusName;
        this.accNo = accNo;
        if(balance < 0)
            throw new IllegalArgumentException(STR."Account Balance cannot be negative number (\{balance})");
        this.balance = balance;
    }
    public boolean deposit(double amount) {
        try{
            if(amount < 0)
                throw new IllegalArgumentException(STR."You cannot deposit negative amount (\{amount})");
            balance +=amount;
            return true;
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
            return false;
        }

    }
    public boolean withdraw(double amount) {
        try{
            if(amount < 0)
                throw new IllegalArgumentException(STR."You cannot withdraw negative amount (\{amount})");
            if(balance < amount)
                throw new UnsupportedOperationException("Insufficient balance");
            balance -= amount;
            return true;
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
            return false;
        }
        catch (UnsupportedOperationException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    public double getBalance(){
        try{
            if(balance < 100)
                throw new IllegalArgumentException("Your balance now reached below: 100");
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            return balance;
        }
    }
    @Override
    public String toString() {
        return STR."""
                Account Detail:
                - Customer Name: \{cusName}
                - Account No: \{accNo}
                - Balance: \{this.getBalance()}
                """;
    }
}
