class Author {
    private String name;
    private String email;
    private char gender;
    
    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public char getGender() {
        return gender;
    }
    
    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    
    Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Author getAuthor() {
        return author;
    }
    
    public void setAuthor(Author author) {
        this.author = author;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getQtyInStock() {
        return qtyInStock;
    }
    
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    
    public String toString() {
        return "Book[name=" + name + ", " + author + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
    }
}

public class TestBook {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling", "jk@hogwarts.com", 'F');
        Book book1 = new Book("Harry Potter", author1, 499.99, 50);
        
        System.out.println(book1);
        
        System.out.println("Book Name: " + book1.getName());
        System.out.println("Author Name: " + book1.getAuthor().getName());
        System.out.println("Author Email: " + book1.getAuthor().getEmail());
        System.out.println("Price: " + book1.getPrice());
        System.out.println("Stock: " + book1.getQtyInStock());
    }
}