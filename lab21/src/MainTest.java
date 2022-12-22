public class MainTest {
    public static void main(String args[]) {
        UltraClass<Integer> uc1 = new UltraClass<>();
        Integer[] int_list = {1, 2, 3, 4, 5, 6, 7};
        uc1.SaveAndOutput(int_list);

        UltraClass<String> uc2 = new UltraClass<>();
        String[] str_list = {"kjdfk", "kefnkew", "kvek", "jkfe", "fjkef", "kejf,"};
        uc2.SaveAndOutput(str_list);

        UltraClass<Double> uc3 = new UltraClass<>();
        Double[] db_list = {1.2, 3.4, 6.3, 5.3, 6.8, 3.5, 8.9};
        uc3.SaveAndOutput(db_list);
    }
}
