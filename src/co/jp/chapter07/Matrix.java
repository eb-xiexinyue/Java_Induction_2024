package co.jp.chapter07;

public class Matrix {
    private int rows;
    private int cols;
    private int[][] data;

    // コンストラクタ
    public Matrix(int rows, int cols, int[][] data) {
        this.rows = rows;
        this.cols = cols;
        this.data = data;
    }

    // 行列の加算メソッド
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
        }

        int[][] resultData = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultData[i][j] = this.data[i][j] + other.data[i][j];
            }
        }

        return new Matrix(rows, cols, resultData);
    }

    // 行列の表示メソッド
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 行列 A
        int[][] dataA = {{1, 2, 3}, {4, 5, 6}};
        Matrix matrixA = new Matrix(2, 3, dataA);

        // 行列 B
        int[][] dataB = {{7, 8, 9}, {10, 11, 12}};
        Matrix matrixB = new Matrix(2, 3, dataB);

        // 行列の加算
        Matrix matrixC = matrixA.add(matrixB);

        // 結果の表示
        System.out.println("Matrix A:");
        matrixA.printMatrix();

        System.out.println("\nMatrix B:");
        matrixB.printMatrix();

        System.out.println("\nMatrix C (A + B):");
        matrixC.printMatrix();
    }
}

