class Person {
    Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println(name + "  " + age);
    }
    private final String name;
    private final int age;
}

class Employee1 extends Person {
    Employee1(String name, int age, int employeeId) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.employeeId = employeeId;
    }
    void display (){
        System.out.println(name + " " + age + " " + employeeId);
    }
    private final String name;
    private final int age;
    private final int employeeId;
}

public class PersonTester {
    public static void main(String[] args) {
        Person sample = new Person("Ajit", 22);
        Employee1 sample2 = new Employee1("Amit", 32, 1234);
        sample.display();
        sample2.display();
    }
}