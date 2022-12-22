package prob8;

import prob8.Filter;

import java.util.Arrays;

public class Tester8 {
    public static Object[] filter(Object[] array, Filter filter) {
        int offset = 0;

        for(int i = 0; i< array.length; i++){
            if(!filter.apply(array[i])){
                offset++;
            } else{
                array[i - offset] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - offset);
    }

    public static void main(String[] args) {
        String array[] = new String[]{"1rewf ", null, "feefewf", "a", null, "hdjh", null, "1"};

        String[] newArray =  (String[]) filter(array, new Filter() {
            @Override
            public boolean apply(Object o) {
                return o != null;
            }
        });
        for (int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i]);
        }
    }
}
//почта и фильтр!!