package cochapter07;


	
//	質問２︓Mathクラスを作成してください。以下メソッドを定義します。
//	1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
//	2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
//	3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
//	4. mainメソッドで上記それぞれメソッドを呼び出してください。
//	以下はメソッドの定義のソースの抜枠です。
//	public class Math {
//	 public static int max(int[] input) {
//	 //...
	
	public class Math {
	    
	    public static int max(int[] input) {
	        if (input == null || input.length == 0) {
	            throw new IllegalArgumentException("Input array is null or empty");
	        }

	        int max = input[0];
	        for (int value : input) {
	            if (value > max) {
	                max = value;
	            }
	        }
	        return max;
	    }

	    public static int min(int[] input) {
	        if (input == null || input.length == 0) {
	            throw new IllegalArgumentException("Input array is null or empty");
	        }

	        int min = input[0];
	        for (int value : input) {
	            if (value < min) {
	                min = value;
	            }
	        }
	        return min;
	    }

	    public static double average(int[] input) {
	        if (input == null || input.length == 0) {
	            throw new IllegalArgumentException("Input array is null or empty");
	        }

	        int sum = 0;
	        for (int value : input) {
	            sum += value;
	        }

	        return (double) sum / input.length;
	    }

	    public static void main(String[] args) {
	        int[] array = {5, 2, 8, 1, 6};

	        // メソッドの呼び出しと結果の表示
	        System.out.println("Max: " + max(array));
	        System.out.println("Min: " + min(array));
	        System.out.println("Average: " + average(array));
	    }
	    
	   
	


}
