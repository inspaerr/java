package lab3;

public class ArrayOf4 {
    public static void main(String args[]) {
        int counter = 0;
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = random(10, 99);
        }
        System.out.println("Полученный массив: ");
        for (int i = 0; i < 4; i++) {System.out.println(arr[i] + " ");}
        for (int i = 1; i < 4; i++) {
            if (arr[i] > arr[i - 1]){counter++;}
        }
        if (counter == 3){System.out.println("Массив - возрастающая последовательность");}
        else {System.out.println("Массив - невозрастающая последовательность");}
    }

    public static int random(int min, int max) //функция получения псевдорандомного числа
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
