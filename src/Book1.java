import java.util.ArrayList;
public class Book1 {
    String title, author, ISBN;

    static ArrayList<Book1> bookCollection = new ArrayList<>();

    Book1(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    //Implementing Getter Concept....
    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    String getISBN() {
        return ISBN;
    }

    //Implementing Setter Concept....
    void setTitle(String title) {
        this.title = title;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    static void addBook(Book1 book) {
        bookCollection.add(book);
    }

    static void removeBook(Book1 book) {
        bookCollection.remove(book);
    }

    static ArrayList<Book1> getBookCollection() {
        return bookCollection;
    }

    public static void main(String[] args) {
        Book1 book1 = new Book1("Java", "Ashutosh", "76857");
        Book1 book2 = new Book1("Javascript", "Jones", "84847");
        Book1.addBook(book1);
        Book1.addBook(book2);
        System.out.println("List of books");
        for(Book1 book:bookCollection){
            System.out.println("Author name:" + book.getAuthor()+ " title:"+book.getAuthor()+" ISBN:"+ book.getISBN());
        }
        Book1.removeBook(book1);
        System.out.println("List of books");
        for(Book1 book:bookCollection){
            System.out.println("Author name:" + book.getAuthor()+ " title:"+book.getAuthor()+" ISBN:"+ book.getISBN());
        }
    }
}
