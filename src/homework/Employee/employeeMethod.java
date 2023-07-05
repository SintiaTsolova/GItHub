package homework.Employee;

public class employeeMethod {
    private int id;
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public employeeMethod(int id, String firstName, String lastName, double monthlySalary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public double getMonthlySalary(){
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }

    public String getName(){
        String name = firstName + lastName;
        return name;
    }

    public double getAnnualSalary(){

        double annualSalary = monthlySalary * 12;

        return annualSalary;
    }

    public double getRaiseSalary(){
        double percent;
        percent = (monthlySalary * 20) / 100;

        return percent;
    }

    public double getRaisedSalary(){
        double percent;
        percent = (monthlySalary * 20) / 100;
        percent += monthlySalary;

        return percent;
    }
}
