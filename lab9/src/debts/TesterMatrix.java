package debts;

import java.util.Scanner;

public class TesterMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность матриц");
        int lines = sc.nextInt();
        int columns = sc.nextInt();
        double[][] matrix = new double[lines][columns];
        System.out.println("Введите " + lines * columns + " чисел для первой матрицы");
        for (int i = 0; i < lines; i++) {
            for (int k = 0; k < columns; k++){
                matrix[i][k] = sc.nextDouble();
            }
        }
        Matrix matrix1 = new Matrix(columns, lines, matrix);
        double[][] matrixx = new double[lines][columns];
        System.out.println("Введите " + lines * columns + " чисел для второй матрицы");
        for (int i = 0; i < lines; i++) {
            for (int k = 0; k < columns; k++){
                matrixx[i][k] = sc.nextDouble();
            }
        }
        Matrix matrix2 = new Matrix(columns, lines, matrixx);
        System.out.println("Первая матрица ");
        matrix1.Output();
        System.out.println("Вторая матрица ");
        matrix2.Output();
        Matrix matrix3 = new Matrix(columns, lines, matrix1.AdditionOperation(matrix2));
        System.out.println("Сумма матриц ");
        matrix3.Output();
        Matrix matrix4 = new Matrix(columns, lines, matrix1.MultiplicationOp(5));
        System.out.println("Умножение первой матрицы на число 5 ");
        matrix4.Output();

    }
}
