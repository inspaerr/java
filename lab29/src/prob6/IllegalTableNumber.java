package prob6;

public class IllegalTableNumber extends RuntimeException {
    public IllegalTableNumber(String message) {
        super("Столик с таким номером не существует: " + message);
    }
}