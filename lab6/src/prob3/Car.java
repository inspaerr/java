package prob3;

public class Car implements Nameable{
    private String Name;
    public Car(String Name){
        this.Name = Name;
    }
    @Override
    public String getName() {
        return Name;
    }
}
