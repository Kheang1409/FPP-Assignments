package prog4;

class HourlyEmployee extends Employee {
    private double wage;

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double getPayment() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return String.format("%s: Hourly Employee\n%s: $%.2f\n%s: %.2f",
                super.toString(), "Wage", wage, "Hours Worked", hours);
    }
}

