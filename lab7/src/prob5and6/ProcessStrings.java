package prob5and6;

public class ProcessStrings implements WorkWithStrings {

    @Override
    public int counterOfChars(String str) {
        return str.length();
    }

    @Override
    public String newString(String str) {
        String str2 = "";
        int k = 0;
        for (int i = 0; i < str.length(); i++){
            if (i % 2 != 0) {
                str2 += str.charAt(i);
                k++;
            }
        }
        return str2;
    }

    @Override
    public void stringInversion(String str) {
        char[] array = str.toCharArray();
        char k;
        for (int i = 0; i < str.length() / 2; i++){
            k = str.charAt(i);
            array[i] = array[str.length() - i - 1];
            array[str.length() - i - 1] = k;
        }
        for (int i = 0; i < str.length(); i++){
            System.out.print(array[i]);
        }
    }
}
