package co.jp.chapter04;

import java.util.Arrays;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//問題1:int[] array = new int[4]; 各要素の値を記載してください。
		
		int[] array1 = new int[4];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("array1[" + i + "] = " + array1[i]);
		}
		System.out.println(Arrays.toString(array1));
		
/*回答1：	array[0] = 0
		array[1] = 0
		array[2] = 0
		array[3] = 0 
		つまり、[0, 0, 0, 0]になる。 */
		

		
//		問題2:int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		
		int[] array2 = new int[4];
		for (int i = 0; i < array2.length; i++) {
			System.out.println("array2[" + i + "] = " + array2[i]);
		}
		System.out.println(Arrays.toString(array2));

/*回答2: array[0] = 5
  		 array[1] = 6
  		つまり、[5, 6]になる。 */

		
		
//		問題3:int[][] array = new int[2][3]; 各要素の値を記載してください。
		int[][] array3 = new int[2][3]; 
		for (int i = 0; i < array3.length; i++) {
			 for (int j = 0; j < array3[i].length; j++) {
				 System.out.println("array３[" + i + "][" + j + "] = " + array3[i][j]);
			 }
		}
	 
/*回答3:	array3[0][0] = 0
		array3[0][1] = 0
		array3[0][2] = 0
		array3[1][0] = 0
		array3[1][1] = 0
		array3[1][2] = 0 
		*/
		
		
		
		//問題4:以下2重Foreachを理解してください。	
		 int[][] array2d =  new int [4][2];//2重Foreach "array2d"を宣言および初期化すること。
		 for(int[] out :array2d) {    //外側の拡張forループで、array2d の各行（1次元配列）を out としてイテレートすること。
			 for(int inner : out) {   //内側の拡張forループで、各行（out）の各要素を inner としてイテレートすること
				 System.out.println(inner); //各要素の値（inner）をコンソールに出力する。
			 }
		 }
		
			 

		
//		問題5:int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
//		左の配列の最大値と最小桁値を System.out.println()。
		 int[] array5 = new int[] {1, 3, 5, 7, 100, 0, 1};
		 for(int i=0; i<array5.length;i++) {
			 for(int j=0;j<array5.length;j++) {
				 if(i!=j) {
					 if(array5[i]<array5[j]) {
						 int temp = array5[j];
						 array5[j] = array5[i];
						 array5[i] = temp;
					 }
				 }
			 }
		 }
		 System.out.println(Arrays.toString(array5));
		 System.out.println("配列の最大値:" + array5[6] +"	配列の最小値:"+array5[0] );
/*回答5: 配列の最大値:0		配列の最小値:100*/

	
//		問題6:問題1の配列のSUMを求める
		 int[] array6 = new int[4];
		 int sum6 = 0;
		 for (int i = 0; i < array6.length; i++) {
			 sum6 += array6[i];
		 }
		 System.out.println("問題６の配列の合計: " + sum6);
		
//		問題7:行列(2次元配列)の和と積を計算してください。
		 int[][] array7 = {
				 {1,2,5},
				 {3,4,7},
				 {5,6,8}
		 }; 
		int pro = 1;
		int sum = 0;
		for(int i=0; i<array7.length;i++) {
			for(int j=0;j<array7.length;j++) {
				sum += array7[i][j];
				pro *= array7[i][j];
			}
		}
		 System.out.println("配列の合計: " + sum);
		 System.out.println("配列の積: " + pro);
			
//		
		
		 
		
		 
				 
				 
				 
		 
		 
		 
		 
		 
	

	}
	
}