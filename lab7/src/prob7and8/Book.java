package prob7and8;

public class Book implements Printable{
    private String title;

    public Book(String title){
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Название книги - " + title);
    }

    static void printBook(Printable[] printable){
        for (int i = 0; i < printable.length; i++) {
            if(printable[i] instanceof Book) {
                printable[i].print();
            };
        }
    }
}
