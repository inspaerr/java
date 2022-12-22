import java.util.Scanner;

public class prob8 {
    static boolean isPalindrome(String str) {
        if (str.length() <= 1)  return true;
        if (str.charAt(0) != str.charAt(str.length() - 1))  return false;
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово");
        String word = sc.next();
        if (isPalindrome(word)) {System.out.println("YES");}
        else {System.out.println("NO");}
    }
}
