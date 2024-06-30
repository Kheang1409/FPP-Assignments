package prog4;

class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getPayment() {
        return baseSalary + (super.getGrossSales() * super.getCommissionRate());
    }
    public String toString () {
        return String.format("The base salary is %.2f", baseSalary);
    }

}
