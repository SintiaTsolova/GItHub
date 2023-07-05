package homework.Employee;

public class employeeMain {
    public static void main(String[] args) {
        employeeMethod employee = new employeeMethod(32156, "Alexander ", "Yonchev", 7580.59);
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee's name: " + employee.getName());
        System.out.println("Employee salary per month: " + employee.getMonthlySalary());
        System.out.println("Annual salary: " + employee.getAnnualSalary());
        System.out.println("Salary raise: " + employee.getRaiseSalary());
        System.out.println("Current raised salary: " + employee.getRaisedSalary());
    }
}
