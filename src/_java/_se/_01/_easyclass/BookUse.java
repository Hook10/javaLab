package _java._se._01._easyclass;

public class BookUse {
    public static void main(String[] args) {
        Book book = new Book("Java");
        System.out.println(book.getTitle());
        book.setPrice(45_000);
        System.out.println(book.getPrice());
    }
}

