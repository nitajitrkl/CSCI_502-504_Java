public class EmployeeTester {
    public static void main(String[] args) {
        Employee sample = new Employee("Ajit", 4000, 5);
        System.out.println(sample.getName()+" is working for " + sample.getYearOfJoining() + " in" + " monthly salary of " + sample.getMonthlySalary());
        System.out.println("Annual Salary: " + sample.calculateAnnualSalary());
    }
}
