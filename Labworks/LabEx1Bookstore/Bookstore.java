package Labworks.LabEx1Bookstore;

public class Bookstore {
    public static void main(String[] args) {
        
        Book b1 = new Book("b101", "Harry Potter", "JK Rowling",300, 10);
        Book b2 = new Book("b102", "Wings of Fire", "APJ Abdul Kalam",400, 20);
        Book b3 = new Book("b103", "Wimpy Kid", "Jeff Kinley",250, 5);
        Book b4 = new Book("b104", "Game of Thrones", "George RR Martin",600, 30);
        Book b5 = new Book("b105", "Sherlock Holmes", "Aurthor Conan Doyle",300, 10);
        Book b6 = new Book("b106", "Normal People", "Sally Rooney",250, 15);
        Book b7 = new Book("b107", "Goosebumps", "RL Stevenson",350, 12);
        Customer c1 = new Customer();
        c1.get_customer_data();



    }
    
}
