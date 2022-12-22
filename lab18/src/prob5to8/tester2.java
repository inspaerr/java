package prob5to8;

public class tester2 {
    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        Message message1 = null;
        Message message2 = new Message();
        message2.setText("java");
        throwsDemo.printMessage(message1);
        throwsDemo.printMessage(message2);
    }
}
