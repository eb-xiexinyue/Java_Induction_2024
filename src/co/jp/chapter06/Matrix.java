package co.jp.chapter06;
		public class Matrix {
		    private final int[][] data; 
		    // コンストラクタ
		    public Matrix(int[][] data) {
		        this.data = data;
		    }
		
		   
		    public Matrix add(Matrix b) {
		      
		        int rows = data.length;
		        int cols = data[0].length;
		        int[][] resultData = new int[rows][cols];
		
		        // 各要素を加算
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                resultData[i][j] = this.data[i][j] + b.data[i][j];
		            }
		        }
		
		        return new Matrix(resultData);
		    }
		
		    public static void main(String[] args) {
		        int[][] dataA = {{1, 2}, {3, 4}};
		        int[][] dataB = {{5, 6}, {7, 8}};
		
		        Matrix a = new Matrix(dataA);
		        Matrix b = new Matrix(dataB);
		
		        Matrix c = a.add(b);
		
		        for (int i = 0; i < c.data.length; i++) {
		            for (int j = 0; j < c.data[i].length; j++) {
		                System.out.print(c.data[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		}
