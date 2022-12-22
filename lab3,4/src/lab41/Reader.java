package lab41;

public class Reader {
    private String fullName;
    private int numOfCard;
    private String faculty;
    private String dateOfBirth;
    private int number;

    public Reader(String fullName, int numOfCard, String faculty, String dateOfBirth, int number){
        this.fullName = fullName;
        this.numOfCard = numOfCard;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", numOfCard=" + numOfCard +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", number=" + number +
                '}';
    }

    public void takeBook(int n) {
        System.out.println(fullName + " взял(а) " + n + " книг");
    }

    public void takeBook(String ... T){
        System.out.println(fullName + " взял(а) книги:");
        for (int i = 0; i < T.length; i++){
            System.out.println(T[i]);
        }
    }
    public void takeBook(Book ... T){
        System.out.println(fullName + " взял(а) книги:");
        for (int i = 0; i < T.length; i++){
            System.out.println(T[i].getTitle());
        }
    }
    public void returnBook(int n){System.out.println(fullName + " сдал(а) " + n + " книг");}

    public void returnBook(String ... T){
        System.out.println(fullName + " сдал(а) книги:");
        for (int i = 0; i < T.length; i++){
            System.out.println(T[i]);
        }
    }

    public void returnBook(Book ... T){
        System.out.println(fullName + " сдал(а) книги:");
        for (int i = 0; i < T.length; i++){
            System.out.println(T[i].getTitle());
        }
    }
}
