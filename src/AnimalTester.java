class Animal{
    void makeSound(){
        System.out.println("Sound!!!");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Bark!!!");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("Meow!!!");
    }
}

public class AnimalTester {
    public static void main(String[] args) {
        Animal sample = new Animal();
        sample.makeSound();
        Cat sampleCat = new Cat();
        sampleCat.makeSound();
        Dog sampleDog = new Dog();
        sampleDog.makeSound();
    }
}