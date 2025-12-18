// Create a class Book which contains four members: name,
// author, price, num_pages. Include a constructor to set the
// values for the members. Include methods to set and get the
// details of the objects. Include a toString( ) method that
// could display the complete details of the book. Develop a
// Java program to create n book objects 
import java.util.Scanner;

class Book {
    String name;
    String author;
    double price;
    int num_pages;

    public Book(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum_pages() {
        return num_pages;
    }

    public void setNum_pages(int num_pages) {
        this.num_pages = num_pages;
    }

    public String toString() {
        return "Book Name: " + name +
               "\nAuthor: " + author +
               "\nPrice: " + price +
               "\nNumber of Pages: " + num_pages;
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for book " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Number of Pages: ");
            int num_pages = sc.nextInt();
            sc.nextLine(); 

            books[i] = new Book(name, author, price, num_pages);
        }

        
        System.out.println("\n----- Book Details -----");
        for (int i = 0; i < n; i++) {
            System.out.println(books[i]);
            System.out.println();
            
        }

        sc.close();
    }
}
