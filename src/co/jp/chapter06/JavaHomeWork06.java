package co.jp.chapter06;


	
		// TODO 自動生成されたメソッド・スタブ
		
		
		/*質問１︓以下コードのコンパイルエラー理由を教えてください
		 * 
		 *  Kicker.javaファイル内でコンパイルエラーが発生している理由は、
		 * PetクラスにsetAgeメソッドが定義されていないためです。
		 * PetクラスにはsetNameメソッドのみが定義されてて、setAgeメソッドは存在しないから、
		 * Kickerクラスのmainメソッド内でcat.setAge(1234);を呼び出すと、
		 * JavaコンパイラはsetAgeメソッドをPetクラス内で見つけないから、コンパイルエラーを発生します。
		 * 
		 
		 // 質問２.1：Mathクラスを作成してください。以下メソッドを定義します。
			public class JavaHomeWork06 {
			
			    public static int max(int[] array) {
			        int max = array[0];
			        for (int i = 1; i < array.length; i++) {
			            if (array[i] > max) {
			                max = array[i];
			            }
			        }
			        return max;
			    }
			
			    // 配列の最小値を求めるメソッド
			    public static int min(int[] array) {
			        int min = array[0];
			        for (int i = 1; i < array.length; i++) {
			            if (array[i] < min) {
			                min = array[i];
			            }
			        }
			        return min;
			    }
			
			    // 配列の平均値を求めるメソッド
			    public static double average(int[] array) {
			        int sum = 0;
			        for (int value : array) {
			            sum += value;
			        }
			        return (double) sum / array.length;
			    }
			
			    // mainメソッド
			    public static void main(String[] args) {
			        int[] numbers = {10, 11, 12, 13, 14};
			
			        System.out.println("最大値: " + max(numbers));
			        System.out.println("最小値: " + min(numbers));
			        System.out.println("平均値: " + average(numbers));
			    }
			} 
		*/ 		
//質問2.2⾏列計算。2D⾏列クラスのコンストラクタには１配列引数
public class Matrix {
    private final int[][] data; 
    public Matrix(int[][] data) {
        this.data = data;
    }

    public Matrix add(Matrix b) {
        
       

        int rows = data.length;
        int cols = data[0].length;
        int[][] resultData = new int[rows][cols];

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


		
		    
		
	
