import java.util.ArrayList;

public class UltraClass <E> {
    private ArrayList<E> arr;

    public ArrayList<E> Convert(E[] t_arr) {
        ArrayList<E> new_arr = new ArrayList<E>();
        for (int i = 0; i < t_arr.length; i ++) {
            new_arr.add(t_arr[i]);
        }
        return new_arr;
    }

    public void Save(E[] t_arr){
        arr = Convert(t_arr);
    }

    public E Get(int index){
        return arr.get(index);
    }

    public void SaveAndOutput(E[] t_arr) {
        arr = Convert(t_arr);
        for (int i = 0; i < 5 && i < t_arr.length; i++){
            System.out.println(arr.get(i));
        }
    }
}
