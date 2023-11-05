# Lab Exersise 1

Imagine you are tasked with designing a class-based system for an online bookstore. The system should allow customers to browse and purchase books. Each book has attributes like title, author, price, and availability. Customers can add books to their shopping carts and make purchases. Additionally, the system should track the customer's information and their order history.


### Data Members:
    title (string): the title of the book.

    author (string): the author of the book.

    price (float): the price of the book.

    availability (int): the number of available copies of the book.

### Member Functions:

    display_info(): displays information about the book.

    is_available(): checks if the book is available for purchase.

    decrement_availability(): decreases the availability when a book is purchased.

### Data Members:
    customer_id (string): a unique identifier for the customer.

    name (string): the name of the customer.

    email (string): the email address of the customer.

    shopping_cart (list of Book objects): the list of books the customer has added to their shopping cart.

    order_history (list of tuples): records of previous orders, each containing book title and purchase date.

### Member Functions:
    add_to_cart(book): adds a book to the customer's shopping cart.

    remove_from_cart(book): removes a book from the shopping cart.

    checkout(): completes the purchase and updates the order history.

    display_cart(): displays the contents of the shopping cart.

    display_order_history(): displays the customer's order history.

### Instructions
    In the Book class, title, author, price, and availability should be private (e.g., use private access specifier) to encapsulate the data and prevent direct modification. Provide appropriate getter methods to access these attributes.

    In the Customer class, customer_id, name, and email can be private, and you can provide getter methods for these attributes. The shopping_cart and order_history can be declared as private and manipulated through the member functions.
    You can create instances of the Book and Customer classes, add books to a customer's shopping cart, simulate the purchase process, and view order history. This case study will demonstrate the use of classes, data members, member functions, and access specifiers to model an online bookstore system.