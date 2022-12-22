package lab41;

public class Phone {
    private double weight;
    private String model;
    private int number;

    public Phone(String model, int number){
        this.model = model;
        this.number = number;
    }
    public Phone(double weight, String model, int number){
        this(model, number);
        this.weight = weight;
    }
    public Phone(){
    }

    public void receiveCall(String name, int number){
        System.out.println("Звонит " + name + " " + number);
    }
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    public void sendMessage(int ...T){
        for (int i = 0; i < T.length; i++){
            System.out.println(T[i]);
        }
    }
    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "weight=" + weight +
                ", model='" + model + '\'' +
                ", number=" + number +
                '}';
    }
}
