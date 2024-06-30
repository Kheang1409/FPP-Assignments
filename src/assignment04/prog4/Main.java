package prog4;

public class Main {

    public static Employee findMaxSalary(Employee[] col) {
        if (col == null || col.length == 0) {
            return null;
        }
        else {
            Employee withMaxSalary = col[0];
            for (Employee employee : col) {
                if (employee != null && employee.getPayment() > withMaxSalary.getPayment()) {
                    withMaxSalary = employee;
                }
            }
            return withMaxSalary;
        }
    }
    public static void main(String[] args) {
        findMaxSalary(null);

        Employee[] employees = new Employee[5];

        employees[0] = new CommissionEmployee("John", "Smith", "123-456-789", 2000, 10);
        employees[1] = new HourlyEmployee("Alexander", "John", "678-678-213", 120, 45.6);
        employees[2] = new SalariedEmployee("Jennifer", "Lopez", "123-456-789", 1230);
        employees[3] = new BasePlusCommissionEmployee("Bruce", "Lee", "5678-321-456", 4560, 7, 789);
        //employees[4] = null; Test NPE

        System.out.println(findMaxSalary(employees));
    }
}
