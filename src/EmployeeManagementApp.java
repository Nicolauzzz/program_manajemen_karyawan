public class EmployeeManagementApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Nicolaus", "IT", 5000);

        EmployeePrinter printer = new EmployeePrinter();
        printer.printDetails(employee);

        EmployeeSalaryCalculator calculator = new EmployeeSalaryCalculator();
        double yearlySalary = calculator.calculateYearlySalary(employee);
        System.out.println("Yearly Salary: " + yearlySalary);
    }
}

class Employee {
    private String name;
    private String department;
    private double monthlySalary;

    public Employee(String name, String department, double monthlySalary) {
        this.name = name;
        this.department = department;
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}

class EmployeePrinter {
    public void printDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Monthly Salary: " + employee.getMonthlySalary());
    }
}

class EmployeeSalaryCalculator {
    public double calculateYearlySalary(Employee employee) {
        return employee.getMonthlySalary() * 12;
    }
}
