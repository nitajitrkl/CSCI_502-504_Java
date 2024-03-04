interface AnimalNew {
    void makeSound();
}
interface WildAnimal extends AnimalNew {
}
interface DomesticAnimal extends AnimalNew {
}
class DogNew implements DomesticAnimal {

    @Override
    public void makeSound() {
        System.out.println("Dog making sound!!!");
    }
}
class LionNew implements WildAnimal {

    @Override
    public void makeSound() {
        System.out.println("Lion making sound!!!");
    }
}
public class AnimalTesterNew {
    public static void main(String[] args) {
        DogNew dog = new DogNew();
        LionNew lion = new LionNew();
        dog.makeSound();
        lion.makeSound();
    }
}
