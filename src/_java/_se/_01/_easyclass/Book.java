package _java._se._01._easyclass;

public class Book {
    private String title;

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
