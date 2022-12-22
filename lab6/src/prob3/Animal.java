package prob3;

public class Animal implements Nameable{
    private String Name;
    public Animal(String Name){
        this.Name = Name;
    }
    @Override
    public String getName() {
        return Name;
    }
}
