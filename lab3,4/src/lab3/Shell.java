package lab3;

public class Shell {
    public static void main(String args[]) {
        Double double1 = Double.valueOf(7.12);
        Double double2 = Double.valueOf("5.67");
        Double double3 = Double.parseDouble("3.46574");

        System.out.println(double1);
        System.out.println(double1.byteValue());
        System.out.println(double1.shortValue());
        System.out.println(double1.intValue());
        System.out.println(double1.longValue());
        System.out.println(double1.floatValue());

        String d = Double.toString(3.14);

    }
}
