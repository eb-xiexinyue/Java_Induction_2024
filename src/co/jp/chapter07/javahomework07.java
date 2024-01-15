package co.jp.chapter07;

public class javahomework07 {
	
//	問１︓以下コードのコンパイルエラー理由を教えてください。
	
	// Pet.java
	public class Pet {
	 public String name;
	 
	 public void setName(String value) {
	 this.name = value;
	 }
	}
	// Kicker.java
	public class Kicker {
	 public static void main(String...args) {
	 Pet cat = new Pet();
	 cat.setAge(1234);    //Petクラスに、"setAge"のメソッドが存在しないため、コンパイルエラーが発生します。
	 }
	}

	
	

//	質問２︓Mathクラスを作成してください。以下メソッドを定義します。
//	1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
//	2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
//	3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
//	4. mainメソッドで上記それぞれメソッドを呼び出してください。
//	以下はメソッドの定義のソースの抜枠です。
	
	public class Math {
		 public static int max(int[] input) {
		 
			 if (input == null || input.length == 0) {
		            throw new IllegalArgumentException("Input array is empty or null");
		        }

		        int max = input[0];
		        for (int i = 1; i < input.length; i++) {
		            if (input[i] > max) {
		                max = input[i];
		            }
		        }
		        return max;
		    }

		    public static int min(int[] input) {
		        if (input == null || input.length == 0) {
		            throw new IllegalArgumentException("Input array is empty or null");
		        }

		        int min = input[0];
		        for (int i = 1; i < input.length; i++) {
		            if (input[i] < min) {
		                min = input[i];
		            }
		        }
		        return min;
		    }

		    public static double average(int[] input) {
		        if (input == null || input.length == 0) {
		            throw new IllegalArgumentException("Input array is empty or null");
		        }

		        int sum = 0;
		        for (int num : input) {
		            sum += num;
		        }

		        return (double) sum / input.length;
		    }

		    public static void main(String[] args) {
		        int[] numbers = {5, 10, 3, 8, 15};

		        // MAX
		        int maxResult = max(numbers);
		        System.out.println("Max: " + maxResult);

		        // MIN
		        int minResult = min(numbers);
		        System.out.println("Min: " + minResult);

		        // Average
		        double averageResult = average(numbers);
		        System.out.println("Average: " + averageResult);
		    }
		} 			 
	}

//		2.行列計算。2D行列クラスのコンストラクタには１配列引数設定してください。
	
		
		public class Matrix {
			private final int[][] data;

		    // コンストラクタ
		    public Matrix(int[][] data) {
		        this.data = data;
		    }

		    // 行列加算メソッド
		    public Matrix add(Matrix b) {
		        if (b == null || this.data.length != b.data.length || this.data[0].length != b.data[0].length) {
		            throw new IllegalArgumentException("Invalid matrix dimensions for addition");
		        }

		        int rows = this.data.length;
		        int cols = this.data[0].length;

		        int[][] resultData = new int[rows][cols];

		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                resultData[i][j] = this.data[i][j] + b.data[i][j];
		            }
		        }

		        return new Matrix(resultData);
		    }
		
		
		}
	
	
