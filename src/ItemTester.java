import java.util.ArrayList;

class Item {
    Item (int id, String title, boolean status){
        this.id = id;
        this.title = title;
        this.status = status;
    }
    void details (){
        System.out.println("Item Details");
    }
    public int id;
    public String title;
    public boolean status;
}

class Book1 extends Item {
    Book1(int id, String title, boolean status, int isbn) {
        super(id, title, status);
        this.isbn = isbn;
    }
    void details (){
        System.out.println("Book Details");
    }
    private int isbn;
}

class DVD extends Item {
    DVD(int id, String title, boolean status, double storage) {
        super(id, title, status);
        this.storage = storage;
    }
    void details (){
        System.out.println("DVD Details");
    }
    private double storage;
}

class Journal extends Item {
    Journal(int id, String title, boolean status, String author) {
        super(id, title, status);
        this.author = author;
    }
    void details (){
        System.out.println("Journal Details");
    }
    private String author;
}
public class ItemTester {
    public static void main(String[] args) {
        System.out.println("Output----");
        Item sample = new Item(12, "Item", true);
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Book1(123, "Hidden Brain", false, 12344));
        items.add(new DVD(4343, "X", false, 45.2));
        items.add(new Journal(12121212,"Java", true, "Ajit"));
        for (Item item : items){
            item.details();
        }
    }
}
