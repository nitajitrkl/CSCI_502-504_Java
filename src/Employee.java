public class Employee {
    public Employee(String aName, int aMonthlySalary){
        this.name = aName;
        this.monthlySalary = aMonthlySalary;
    }
    String getName(){
        return name;
    }
    int getMonthlySalary(){
        return monthlySalary;
    }
    void displayDetails (){
        System.out.println("Employee Details!!!");
    }
    private final String name;
    private final int monthlySalary;
}

class Manager1 extends Employee{
    public Manager1(String aName, int aMonthlySalary, String department) {
        super(aName, aMonthlySalary);
        this.department = department;
    }
    void displayDetails (){
        System.out.println("Manager Details!!!");
    }
    private String department;
}
class Developer extends Employee {
    public Developer(String aName, int aMonthlySalary, String language) {
        super(aName, aMonthlySalary);
        this.language = language;
    }
    void displayDetails (){
        System.out.println("Developer Details!!!");
    }
    private String language;
}