public class Employee {
    public Employee(String aName, int aMonthlySalary, int aYearOfJoining){
        this.name = aName;
        this.monthlySalary = aMonthlySalary;
        this.yearOfJoining = aYearOfJoining;
    }
    public String getName(){
        return name;
    }
    public int getMonthlySalary(){
        return monthlySalary;
    }
    public int getYearOfJoining(){
        return yearOfJoining;
    }
    public int calculateAnnualSalary(){
        return 12*monthlySalary;
    }
    private final String name;
    private final int monthlySalary;
    private final int yearOfJoining;
}