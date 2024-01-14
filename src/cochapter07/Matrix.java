package cochapter07;


	//	    2.⾏列計算。2D⾏列クラスのコンストラクタには１配列引数設定してください。
//    public class Matrix {
//     private final int[][] data;
//     /** construct method */
//     public Matrix(int[][] data) {
//     this.data = data;
//     }
//     // 行列 ADD
//     public Matrix add(Matrix b) {
//     //....
//     return ???
	public class Matrix {
	    private final int[][] data;

	    public Matrix(int[][] data) {
	        this.data = data;
	    }

	    public Matrix add(Matrix b) {
	        if (b == null || data.length != b.data.length || data[0].length != b.data[0].length) {
	            throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
	        }

	        int numRows = data.length;
	        int numCols = data[0].length;

	        int[][] result = new int[numRows][numCols];

	        for (int i = 0; i < numRows; i++) {
	            for (int j = 0; j < numCols; j++) {
	                result[i][j] = data[i][j] + b.data[i][j];
	            }
	        }

	        return new Matrix(result);
	    }

	    // 他のメソッドや必要に応じてtoStringメソッドを実装することができます。

	    public static void main(String[] args) {
	        int[][] data1 = {{1, 2, 3}, {4, 5, 6}};
	        int[][] data2 = {{7, 8, 9}, {10, 11, 12}};

	        Matrix matrix1 = new Matrix(data1);
	        Matrix matrix2 = new Matrix(data2);

	        Matrix result = matrix1.add(matrix2);

	        // 結果の表示
	        System.out.println("Matrix 1:");
	        System.out.println(matrix1);
	        System.out.println("Matrix 2:");
	        System.out.println(matrix2);
	        System.out.println("Sum Result:");
	        System.out.println(result);
	    }
	


}
