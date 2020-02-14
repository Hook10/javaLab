package _java._se._02;

public class ProgrammerBook extends Book {
    private String language;

    public ProgrammerBook(){}

    public ProgrammerBook(String title, int price, String language){
        super(title, price);
        this.language = language;
    }
}
