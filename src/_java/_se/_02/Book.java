package _java._se._02;

public class Book {
    private String title;
    private int price;

    public Book(String title, int price) {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book() {
        price = 0;
    }

    public Book(int price) {
        setPrice(price);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
