abstract class AbstractProduct {
    int productId;
    String name;
    String description;

    AbstractProduct(int id, String name, String desc) {
        productId = id; this.name = name; description = desc;
    }

    abstract void displayDetails();
}

class Product extends AbstractProduct {
    double price;

    Product(int id, String name, String desc, double price) {
        super(id, name, desc);
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("ID: " + productId + " | Name: " + name +
            " | Desc: " + description + " | Price: $" + price);
    }
}

class Book extends Product {
    String isbn, author;

    Book(int id, String name, String desc, double price, String isbn, String author) {
        super(id, name, desc, price);
        this.isbn = isbn; this.author = author;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("  ISBN: " + isbn + " | Author: " + author);
    }
}

class TravelGuide extends Product {
    String country;

    TravelGuide(int id, String name, String desc, double price, String country) {
        super(id, name, desc, price);
        this.country = country;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("  Country: " + country);
    }
}

class CompactDisc extends Product {
    String artist, title;

    CompactDisc(int id, String name, String desc, double price, String artist, String title) {
        super(id, name, desc, price);
        this.artist = artist; this.title = title;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("  Artist: " + artist + " | Title: " + title);
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        TravelGuide tg = new TravelGuide(1, "Europe Guide", "Travel book", 29.99, "France");
        Book book = new Book(2, "Java OOP", "Programming", 49.99, "978-0", "John Doe");
        CompactDisc cd = new CompactDisc(3, "Greatest Hits", "Music CD", 14.99, "The Beatles", "Abbey Road");

        tg.displayDetails();
        book.displayDetails();
        cd.displayDetails();
    }
}
