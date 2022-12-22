package prob12;

import java.lang.StringBuilder;
import java.util.Stack;

public class UndoStringBuilder {
    StringBuilder stringBuilder;
    //String str;

    public UndoStringBuilder(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        this.stringBuilder = stringBuilder;
    }
    private Stack actions = new Stack<Action>();

    public UndoStringBuilder reverse() { //обратная строка
        stringBuilder.reverse();
        Action action = new Action(){
            public void undo() {
                stringBuilder.reverse();
            }
        };
        actions.add(action);
        return this;
    }

    public UndoStringBuilder append(String str) { //добавление подстроки
        stringBuilder.append(str);

        Action action = new Action(){
            public void undo() {
                stringBuilder.delete(
                        stringBuilder.length() - str.length() -1,
                        stringBuilder.length());
            }
        };

        actions.add(action);
        return this;
    }

    public UndoStringBuilder delete(int start, int end) { //удаление подстроки
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);

        Action action = new Action(){
            public void undo() {
                stringBuilder.insert(start, deleted);
            }
        };
        actions.add(action);
        return this;
    }

    public UndoStringBuilder deleteCharAt(int index) { //удаление символа
        char deleted = stringBuilder.charAt(index);
        stringBuilder.deleteCharAt(index);

        Action action = new Action(){
            public void undo() {
                stringBuilder.insert(index, deleted);
            }
        };

        actions.add(action);
        return this;
    }

    public UndoStringBuilder replace(int start, int end, String str) { //перемещение подстроки
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.replace(start, end, str);

        Action action = new Action(){
            public void undo() {
                stringBuilder.replace(start, end, deleted);
            }
        };
        actions.add(action);
        return this;
    }

    public void undo(){ //обратно
        if(!actions.isEmpty()){
            ((Action) actions.pop()).undo();
        }
    }

    public String toString() {
        return stringBuilder.toString();
    }
}
