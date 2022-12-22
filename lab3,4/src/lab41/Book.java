package lab41;

public class Book {
    private String title;
    private int date;

    public Book(String title, int date){
        this.date = date;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getDate() {
        return date;
    }


}
