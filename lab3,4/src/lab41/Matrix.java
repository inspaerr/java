package lab41;

public class Matrix {
    private int countOfLines;
    private int countOfColumns;
    private double [][] matrix;

    public Matrix(int countOfColumns, int countOfLines, double [][]matrix){
        this.countOfColumns = countOfColumns;
        this.countOfLines = countOfLines;
        this.matrix = matrix;

    }
    public int getCountOfLines() {
        return countOfLines;
    }

    public int getCountOfColumns() {
        return countOfColumns;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public double[][] AdditionOperation(Matrix matrix2) {
        double[][] mat = new double [this.countOfLines][this.countOfColumns];
        for (int i = 0; i < this.countOfLines; i++){
            for (int k = 0; k < this.countOfColumns; k++){
                mat[i][k] = this.matrix[i][k] + matrix2.getMatrix()[i][k];
            }
        }
        return mat;
    }

    public double[][] MultiplicationOp(double x) {
        double[][] mat = new double [this.countOfLines][this.countOfColumns];
        for (int i = 0; i < this.countOfLines; i++){
            for (int k = 0; k < this.countOfColumns; k++){
                mat[i][k] = this.matrix[i][k] * x;
            }
        }
        return mat;
    }
    public void Output(){
        for (int i = 0; i < this.countOfLines; i++){
            for (int k = 0; k < this.countOfColumns; k++){
                System.out.print(this.matrix[i][k] + " ");
            }
            System.out.println("\n");
        }
    }
}
