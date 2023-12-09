package co.jp.chapter05;

import java.util.Arrays;

public class JavaHomeWork05 {


	public static void main(String[] args) {

		//設問１:1から100までの偶数の和を求める(for + if)。	
		//回答　:
		int sum = 0;
		
		for(int a=1;a<=100;a++) {
			if(a%2==0) {
				
				sum = sum + a;
				
			}
		}
		System.out.println(sum); 
		
		
		//設問２︓5の階乗を求める(for)。
		//回答　：
		int m = 1;
		
		for(int b=1;b<=5;b++) {
			
			m = m*b;
			
		}
		System.out.println(m); 
		
		
		//質問３:配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
		//回答　:
		int[] array3 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		//最⼤値:
		int max = array3[0];
		
		for(int i=1;i<array3.length;i++) {
			if(array3[i]>max) {
				max = array3[i];
			}
		}
		System.out.println("最⼤値は"+max);
		
		//最⼩値:
		int min = array3[0];
		
		for(int j=1;j<array3.length;j++) {
			if(array3[j]<min) {
				min = array3[j];
			}
		}
		System.out.println("最小値は"+min);
		
		//和:
		int sum3 = array3[0];
		
		for (int z=1;z<array3.length;z++) {
			
			sum3 = sum3+array3[z];
		}
		System.out.println("和は"+sum3);
		
		//平均値:
		double mean;
		double sum3_1 = array3[0];
		
		for (int z=1;z<array3.length;z++) {
			
			sum3_1 = sum3_1+array3[z];
		}
		mean = sum3_1/array3.length;
		
		System.out.println("平均値は"+mean);
		
		
		//質問４:質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
		//回答　:
		for(int i=0;i<array3.length;i++) {
			for(int j=i+1;j<array3.length;j++) {
				int c = array3[i];
				int d = array3[j];
				
				if(c == d) {
					System.out.println(c);	
				}
			
			}
		}
		
		
		//質問５:質問３の配列に値「７」のインデックスを求む。
		//回答　:
		for(int i=0;i<array3.length;i++) {
			if (array3[i]==7) {
				
				System.out.println("値「７」のインデックスは"+i);	
			}
		}
		
		
		//質問６:任意⾏列（２次元配列）の積を求める。
		//回答　:
		int[][] array2d = new int[][] {
			
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			
		};
		
		
		int multiply6 = calculateMultiply(array2d);
		
		System.out.println("⾏列（２次元配列）の積は"+multiply6);
		
		
		//質問７:配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
		//回答　:	
		int[] temp_array = {56,89,99,34,76,23,11,8};{
		
		System.out.println(Arrays.toString(temp_array));
		
		for (int i=0;i<temp_array.length;i++) {
			for(int j=0;j<temp_array.length;j++) {
				if(i!=j) {
					if(temp_array[i]<temp_array[j]) {
		//				System.out.println(Arrays.toString(temp_array));
						int temp = temp_array[j];
						temp_array[j]=temp_array[i];
						temp_array[i]=temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(temp_array));
		
		
		//質問８:LV10のパスカルの三⾓形を出⼒してください。
		//回答　:	
		int numRows = 10; // パスカルの三角形の行数
		
		// パスカルの三角形を生成して表示
		for (int i = 0; i < numRows; i++) {
		    for (int j = 0; j <= i; j++) {
		        System.out.print(binomialCoefficient(i, j) + " ");
		    }
		    System.out.println();
		}
		
		
		}
	}
		        

		// 二項係数を計算するメソッド
	private static int binomialCoefficient(int n, int k) {
		if (k == 0 || k == n) {
		    return 1;
		} else {
		    return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
		}
		    

	}

	public static int calculateMultiply(int[][] array2d) {
		int multiply = 1;
		
		for(int[] row : array2d) {
			for(int num : row) {
				multiply *= num;
			}
		}
		
		return multiply;
		}
		
	}