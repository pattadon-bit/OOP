package Lab1;
public class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Developing Java Software","Russel Winder",79.75);
        System.out.println(myBook.getTitle());
        System.out.println(myBook.getAuthor());
    }
}
