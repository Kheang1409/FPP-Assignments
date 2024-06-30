package prog4;

class CommissionEmployee extends Employee {
    final public static double HUNDRED_PERCENT = 100;
    private double grossSales;
    private double commissionRate;

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate*HUNDRED_PERCENT;
    }

    @Override
    public double getPayment() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return String.format("%s: Commission Employee\n%s: $%.2f\n%s: %.2f%%",
                super.toString(), "Gross Sales", grossSales, "Commission Rate", commissionRate);
    }
}
