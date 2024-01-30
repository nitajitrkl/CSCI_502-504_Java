public class Book {
    public Book(String aTitle, String aAuthor, int aPrice){
        this.title = aTitle;
        this.author = aAuthor;
        this.price = aPrice;
    }
    public void displayDetails (){
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Price: "+price);
    }
    private String title;
    private String author;
    private int price;
}
