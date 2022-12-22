package prob12;

import java.util.Scanner;

public class Tester12 {
    public static void main(String[] args) {
        String str = "bibaboba";
        UndoStringBuilder undoStringBuilder = new UndoStringBuilder(str);
        undoStringBuilder.delete(1, 4); //bboba
        undoStringBuilder.reverse(); //abobb
        undoStringBuilder.deleteCharAt(1); //aobb
        undoStringBuilder.undo(); //abobb
        System.out.println(undoStringBuilder.stringBuilder.toString());
    }
}
