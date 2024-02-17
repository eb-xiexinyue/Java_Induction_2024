package co.jpChapter07;

public class JavaHomeWork07 {
	
  // 質問１︓以下コードのコンパイルエラー理由を教えてください。	
		// Pet.java
		 //public class Pet {
		 // public String name;
		  
		  //public void setName(String value) {
		  //this.name = value;
		  //}
		  //}
		 // Kicker.java
		  //public class Kicker {
		  //public static void main(String...args) {
		  //Pet cat = new Pet();
		  //cat.setAge(1234);
		  //}
		  //}
	//答え：コンパイルエラーの理由はsetAgeメソッドが定義されていないからである。
	
	//質問２︓Mathクラスを作成してください。以下メソッドを定義します。
    // 1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
	//2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
	// 3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
	// 4. mainメソッドで上記それぞれメソッドを呼び出してください。
	// 以下はメソッドの定義のソースの抜枠です。
	// public class Math {
	//public static int max(int[] input) {
	//...
	// }
	// }
	//答え：
			    public static int max(int[] input) {
			        int max = input[0];
			        for (int i = 1; i < input.length; i++) {
			            if (input[i] > max) {
			                max = input[i];
			            }
			        }
			        return max;
			    }

			    public static int min(int[] input) {
			        int min = input[0];
			        for (int i = 1; i < input.length; i++) {
			            if (input[i] < min) {
			                min = input[i];
			            }
			        }
			        return min;
			    }

			    public static double average(int[] input) {
			        int sum = 0;
			        for (int num : input) {
			            sum += num;
			        }
			        return (double) sum / input.length;
			    }
			    public static void main(String[] args) {
			    int[] numbers = {24, 2,17 ,18, 38};

		        System.out.println("配列の最大値: " + max(numbers));
		        System.out.println("配列の最小値: " + min(numbers));
		        System.out.println("配列の平均値: " + average(numbers));
			    }
	 }

