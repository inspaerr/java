package prob7and8;

public class Magazine implements Printable{
    private String title;

    public Magazine(String title){
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Название журнала - " + title);
    }

    static void printMagazines(Printable[] printable){
        for (int i = 0; i < printable.length; i++) {
            if(printable[i] instanceof Magazine) {
                printable[i].print();
            };
        }
    }
}
