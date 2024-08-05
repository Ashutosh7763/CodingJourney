public class Book {
    String title,author;
    Integer price;
    Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    Book(String title,String author,Integer price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public static void main(String[] args) {
        Book obj=new Book("Java","E.Balagurusamy");
        Book obj1=new Book("Javascript","Narasimbha",450);
        System.out.println("Title:" + obj.title);
        System.out.println("Author:" + obj.author);
        System.out.println("Title:"+ obj1.title);
        System.out.println("Author:"+ obj1.author);
        System.out.println("Price:"+ obj1.price);
    }
}
