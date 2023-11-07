package Learning.Bookstore;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private double price;
    private int availability;

    Book(String bookId,String title,String author,double price,int availability){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public void display_info(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: $" + this.price);
        if(this.availability == 0)
            System.out.println("Availability: Out of Stock");
        else
            System.out.println("Availability: In Stock of "+this.availability+" copies");
        }  
    
    public boolean is_available(){
        return (this.availability > 0);
    }

    public void decrement_availability(int qty){
        this.availability-=qty;
    }

    public void show_book(){
        System.out.print("\nTitle: "+this.title+"\nAuthor: "+this.author+"\nPrice: "+this.price+"\n");
    }
      
}
