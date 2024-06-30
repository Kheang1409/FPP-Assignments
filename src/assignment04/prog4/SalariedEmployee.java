package prog4;

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getPayment() {

            return weeklySalary;
    }
    @Override
    public String toString() {
        return String.format("The weekly salary is: %.2f", weeklySalary);
    }
}
