package Learning.Bookstore;

import java.util.*;


public class Customer {
    Scanner sc = new Scanner(System.in);
    private String name;
    private String email;
    private List<Book> shopping_cart;
    private List<Object[]> order_history;

    public void get_customer_data(){
        System.out.println("Enter customer's name: ");
        this.name = sc.nextLine();
        System.out.println("Enter customer's email address: ");
        this.email = sc.nextLine(); 
    }

    public void add_to_cart(Book b){
        this.shopping_cart.add(b);

    }

    public void remove_from_cart(Book b){
        if (this.shopping_cart.contains(b)){
            int index = this.shopping_cart.indexOf(b);
            this.shopping_cart.remove(index);
        }

    }

    public void display_cart(){
        System.out.println("\nName : "+this.name);
        System.out.println("\nEmail : "+this.email);
        System.out.println("\nCart Contents:\n");
        if(this.shopping_cart.size()==0){
            System.out.println("\tNo items in cart.");
        }
        else{
            for (int i=0;i<this.shopping_cart.size();i++){
                Book temp = this.shopping_cart.get(i);
                temp.show_book();
            }
        }

    }

    public void display_order_history(){
        System.out.println("\nOrder History of "+this.name);
        if(this.order_history.size() == 0){
            System.out.println("\tNo orders made yet.");
        }
        else{
            for (int i=0;i<this.order_history.size();i++){
                Object[] temp = this.order_history.get(i);
                System.out.println("\nBook Name : "+temp[0]+"\nDate: "+temp[1]+"\n");    
            }
        }
    }
}
