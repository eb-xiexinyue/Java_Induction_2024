package co.jp.chapter05;

import java.util.Arrays;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
//		設問1:1から100までの偶数の和を求める(for + if)。
		int sum1=0;
		for (int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
				sum1 += i;
			}
		}
		System.out.println("1から100までの偶数の和: " + sum1);
//		回答1：2550
		
	
//		設問2:5の階乗を求める(for)。
		 int a = 1;
		 for (int i = 1; i <= 5; i++) {
			 a *= i;
		 }
		 System.out.println("5の階乗: " + a);
//		 回答2：120
		 
	
		
//		質問3:配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
		 int[] array3 = new int[] {1, 3, 5, 7, 100, 0, 1};
		 int sum3=0;
		 for(int i=0; i<array3.length;i++) {
			 sum3 += i;
			 for(int j=0;j<array3.length;j++) {
				 if(i!=j) {
					 if(array3[i]<array3[j]) {
						 int temp = array3[j];
						 array3[j] = array3[i];
						 array3[i] = temp;
					 }
				 }
			 }
		 }
		 int ave = sum3 / array3.length;
		 System.out.println(Arrays.toString(array3));
		 System.out.println("最大値:" + array3[6] +"		最小値:"+array3[0] + "	和:" + sum3 +"	平均値:"+ave );
//		 回答3：最大値:0		最小値:100	和:21	平均値:3

		 
		 
		 

//		質問4:質問3の配列に重複ある要素を探す(要素の表示次数集計必要なし)。
		 int[] array4 = {1, 2, 6, 7, 9, 6, 2, 1};
		 for (int i = 0; i < array4.length; i++) {
			 for (int j = i + 1; j < array4.length; j++) {
				 if (array4[i] == array4[j]) {
					 System.out.print("重複ある要素: " + array4[i] + "\n");
					 
				 }
			 }
		 }
//		 回答4：重複ある要素: 1
//			   重複ある要素: 2
//			   重複ある要素: 6
		 
		 
//		質問5:質問3の配列に値「7」のインデックスを求む。
		 int[] array5 = {1, 2, 6, 7, 9, 6, 2, 1};
		 for(int i=0;i<array5.length;i++) {
			 if (array5[i]==7) {
				 System.out.println("値「７」のインデックスは"+i);
			 }
		 }
//		 回答5：値「７」のインデックスは3
		 
//		質問6:任意行列(2次元配列)の積を求める。
		 int[][] array6 = {
				 {5,6,7,8},
				 {3,1,4,6,87,8},
				 {5,6,8}
		 }; 
		int pro = 1;
		for(int i=0; i<array6.length;i++) {
			for(int j=0;j<array6.length;j++) {
				pro *= array6[i][j];
			}
		}
		 System.out.println("積: " + pro);
//		 回答6： 積: 604800
		 
		 
//		質問7:配列を昇順でソートする(java.util等メソッド利用禁止)。

		 int[] array7 = new int[] {1, 3, 5, 7, 100, 0,21,45,67,89,77,9,124,11};
		 for(int i=0; i<array7.length;i++) {
			 sum3 += i;
			 for(int j=0;j<array7.length;j++) {
				 if(i!=j) {
					 if(array7[i]<array7[j]) {
						 int temp = array7[j];
						 array7[j] = array7[i];
						 array7[i] = temp;
					 }
				 }
			 }
		 }
		 System.out.println("昇順で" + Arrays.toString(array7));
//		 回答7：昇順で[0, 1, 3, 5, 7, 9, 11, 21, 45, 67, 77, 89, 100, 124]
		 
//		質問8:LV10のパスカルの三角形を出力してください。
//		
		
	}
}