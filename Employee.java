class Employee {
    private String empName;
    private int empId;
    private double basicSalary;

    Employee(String empName, int empId, double basicSalary) {
        this.empName = empName;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    double calculateHRA() {
        return basicSalary * 0.20; // 20%
    }

    double calculateDA() {
        return basicSalary * 0.10; // 10%
    }

    double calculatePF() {
        return basicSalary * 0.05; // 5%
    }

    double grossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    double netSalary() {
        return grossSalary() - calculatePF();
    }

    void display() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + grossSalary());
        System.out.println("Net Salary: " + netSalary());
    }

    public static void main(String[] args) {
        Employee e = new Employee("Pratiksha", 101, 50000);
        e.display();
    }
}
