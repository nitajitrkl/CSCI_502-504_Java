import java.util.ArrayList;

class Animal{
    Animal (int age, String name){
        this.age = age;
        this.name = name;
    }
    void eat(){
        System.out.println("Eating!!!");
    }
    void sleep(){
        System.out.println("Sleeping!!!");
    }
    public int getAge (){
        return age;
    }
    public String getName (){
        return name;
    }
    private final int age;
    private final String name;
}

class Lion extends Animal{
    Lion(int age, String name) {
        super(age, name);
    }
    void eat(){
        System.out.println("Lion is Eating!!!");
    }
    void sleep(){
        System.out.println("Lion is Sleeping!!!");
    }
}

class Elephant extends Animal{
    Elephant(int age, String name) {
        super(age, name);
    }
    void eat(){
        System.out.println("Elephant is Eating!!!");
    }
    void sleep(){
        System.out.println("Elephant is Sleeping!!!");
    }
}
class Eagle extends Animal{
    Eagle(int age, String name) {
        super(age, name);
    }
    void eat(){
        System.out.println("Eagle is Eating!!!");
    }
    void sleep(){
        System.out.println("Eagle is Sleeping!!!");
    }
}

public class AnimalTester {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion(10, "Simba"));
        animals.add(new Elephant(50, "Jon"));
        animals.add(new Eagle(30, "Joe"));
        for (Animal animal : animals){
            animal.eat();
            animal.sleep();
            System.out.println(animal.getAge());
            System.out.println(animal.getName());
            System.out.println(" ");
        }
    }
}