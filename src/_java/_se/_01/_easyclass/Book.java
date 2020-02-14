package _java._se._01._easyclass;

public class Book {
    private String title;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book() {
        setTitle("without a title");
    }

    public Book(String title) {
        setTitle(title);
    }

    public void setTitle(String title) {
        if (null == title) {
            this.title = "no title";
        } else {
            this.title = title;
        }
    }

    public String getTitle() {
        return title;
    }
}
