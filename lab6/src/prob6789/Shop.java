package prob6789;

public class Shop implements Printable{
    private String goods;
    private String name;
    @Override
    public void print() {
        System.out.println("Название - " + name + ", продаваемые товары - " + goods);
    }
}
