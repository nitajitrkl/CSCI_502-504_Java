import java.util.ArrayList;

public class EmployeeTester {
    public static void main(String[] args) {
        ArrayList<Employee> employess = new ArrayList<>();
        employess.add(new Manager1("Ajit", 3000, "Recursion"));
        employess.add(new Developer("Amit", 4000, "Python"));
        for (Employee employee : employess) {
            employee.displayDetails();
            System.out.println(employee.getName());
        }
    }
}
