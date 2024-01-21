package co.jp.chapter07;

import java.util.Arrays;

public class JavaHomeWork07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		質問1: 以下コードのコンパイルエラー理由を教えてください。
		// Pet.java
//		public class Pet {
//		 public String name;
//
//		 public void setName(String value) {
//		 this.name = value;
//		 }
//		}
//		// Kicker.java
//		public class Kicker {
//		 public static void main(String...args) {
//		 Pet cat = new Pet();
//		 cat.setAge(1234);
//		 }
//		}
		
//		回答1: Petクラスに、"setName"のメソッドがあり、"setAge"のメソッドがないから、コンパイルエラーが発生する。
		
		
		
//		質問2.1: Mathクラスを作成してください。以下メソッドを定義します。
//		1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
//		2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
//		3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
//		4. mainメソッドで上記それぞれメソッドを呼び出してください。
		
//		回答2.1: Math Class の作成の詳しいことを Math.java 内に御覧でください。
		
		int[]array = {3,7,54,89,21,60};
		//调用 Math Class：
		Math math = new Math();	
		
		//最大值：
		int max = Math.max(array);		
		System.out.println(max);
		
		//最小值：
		int min = Math.min(array);
		System.out.println(min);
		
		//平均值：
		double ave = Math.ave(array);
		System.out.println(ave);
		
//		質問2.2: ⾏列計算。2D⾏列クラスのコンストラクタには１配列引数設定してください。
		
//		回答2.2: Matrix Class の作成の詳しいことを Matrix.java 内に御覧でください。
		
		// 行列 A
		int[][] dataA = {{1, 2, 3}, {4, 5, 6}};
		Matrix matrixA = new Matrix(2,3,dataA);
		
		// 行列 B
		int[][] dataB = {{7, 8, 9}, {10, 11, 13}};
		Matrix matrixB = new Matrix(2,3,dataB);
		
		// 行列の加算
		Matrix matrixC = matrixA.add(matrixB);
		
		// 結果の表示
		System.out.println("Matrix A:");
		for(int[] arr1:dataA) {
			System.out.println(Arrays.toString(arr1));	
		}
	        
		System.out.println("\nMatrix B:");
		for(int[] arr2:dataB) {
			System.out.println(Arrays.toString(arr2));
		}
	        
		System.out.println("\nMatrix C (A + B):");
		matrixC.printMatrix();
		
	}
	
}
