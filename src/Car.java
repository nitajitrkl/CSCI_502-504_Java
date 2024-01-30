public class Car {
    public Car (String model, String make, int year){
        this.model = model;
        this.make = make;
        this.year = year;
    }
    public void displayDetails(){
        System.out.println("Model: "+ model);
        System.out.println("Make: "+ make);
        System.out.println("Year: "+ year);
    }
    private String model;
    private String make;
    private int year;
}
