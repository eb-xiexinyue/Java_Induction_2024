package co.jp.chapter04;
import java.util.Arrays;
public class JavaHomeWork04 {

	public static void main(String[] args) {
		
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * 問題１︓int[] array = new int[4]; 各要素の値を記載してください
		 * array[0] = 0 ；array[1] = 0；array[2] = 0；array[3] = 0
		 * 
		 * 問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		 * array[0] = 5；array[1] = 6
		 * 
		 * 問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
		 * array[0][0] = 0；array[0][1] = 0；array[0][2] = 0；array[1][0] = 0；array[1][1] = 0；array[1][2] = 0
		 * 
		 * 問題４︓以下２重Foreachを理解してください。
		        // 4行2列の二次元整数配列を作成
		        int[][] array2d = new int[4][2];
		
		        // Foreachループを使って配列の各行を巡り
		        for (int[] out : array2d) {
		            // もう一度 Foreachループを使って現在の行の各要素を巡り
		            for (int inner : out) {
		                // 現在の要素の値を出力
		                System.out.println(inner);
          * 質問５：int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値をSystem.out.println()。
      */

		        int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		        int max = array[0];
		        int min = array[0];
		
		        for (int i = 1; i < array.length; i++) {
		            if (array[i] > max) {
		                max = array[i];
		            }
		            if (array[i] < min) {
		                min = array[i];
		            }
		        }
		
		        System.out.println("最大値: " + max);
		        System.out.println("最小値: " + min);
    
   

				//質問6：問題１の配列のSUMを求める。
				
				int[] arraySum = new int[4];
			    int sum = 0;
			
			    for (int i = 0; i < arraySum.length; i++) {
			        sum += arraySum[i];
			    }
			
			    System.out.println("問題１の和は " + sum);
			
			  //質問7：⾏列（２次元配列）の和と積を計算してください。
			
			            int[][] array2d = {
			                {1, 2, 3, 4},
			                {21, 22, 23, 24}
			            };

			            int sum1 = 0;
			            int pro = 1;

			            for (int i = 0; i < array2d.length; i++) {
			                for (int j = 0; j < array2d[i].length; j++) {
			                    sum += array2d[i][j];
			                    pro *= array2d[i][j];
			                }
			            }

			            System.out.println(" ２次元配列の和" + sum);
			            System.out.println("２次元配列積" + pro);
			            
			            
			 //1から100までの偶数の和
			            
			                int sum2 = 0;
			                for (int i = 1; i <= 100; i++) {
			                    if (i % 2 == 0) {
			                        sum2 += i;
			                    }
			                }
			                System.out.println("1から100までの偶数の和: " + sum2);
			  //　5の階乗              
			                int kaijyo = 1;
			                for (int i = 1; i <= 5; i++) {
			                    kaijyo *= i;
			                }
			                System.out.println("5の階乗: " + kaijyo);
			    
			                
			  // 配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
			                int[] array3 = {1, 2, 6, 7, 9, 6, 2, 1};
			                int max3 = array3[0];
			                int min3 = array3[0];
			                int sum3 = 0;

			                for (int value : array3) {
			                    if (value > max3) {
			                        max3 = value;
			                    }
			                    if (value < min3) {
			                        min3 = value;
			                    }
			                    sum3 += value;
			                }

			                double ave = (double) sum3 / array3.length;

			                System.out.println("最大値: " + max3);
			                System.out.println("最小値: " + min3);
			                System.out.println("合計: " + sum3);
			                System.out.println("平均値: " + ave);
			                
			    //質問３の配列に重複ある要素を探す
			                int[] array4 = {1, 2, 6, 7, 9, 6, 2, 1};
			                System.out.print("重複ある要素: ");

			                for (int i = 0; i < array4.length; i++) {
			                    for (int j = i + 1; j < array4.length; j++) {
			                        if (array4[i] == array4[j]) {
			                            System.out.print(array4[i] + " ");
			                            break;
			                        }
			                    }
			                }           

			                
			    //配列 {1, 2, 6, 7, 9, 6, 2, 1}に値「７」のインデックスを求む
			                
			                        int[] array5 = {1, 2, 6, 7, 9, 6, 2, 1};
			                        int valueToFind = 7;

			                        for (int i = 0; i < array5.length; i++) {
			                            if (array5[i] == valueToFind) {
			                                System.out.println("値「" + valueToFind + "」のインデックス: " + i);
			                                break; 
			                            }
			                        }
			                        
			                        
			                        int[][] array6 = {
			    			                {1, 2, 3, 4},
			    			                {21, 22, 23, 24}
			    			            };

			      //任意⾏列（２次元配列）の積を求める    
			    			            int pro6 = 1;

			    			            for (int i = 0; i < array6.length; i++) {
			    			                for (int j = 0; j < array6[i].length; j++) {
			    			                    
			    			                    pro6 *= array6[i][j];
			    			                }
			    			            }

			    			            
			    			            System.out.println("２次元配列積" + pro6);
			    			            
			    //配列を昇順でソートする
			    			            
			    			            int[] raw_array2 = {45, 2, 12, 8, 9};

			    			            
			    			            for (int i = 0; i < raw_array2.length; i++) {
			    			                for (int j = i + 1; j < raw_array2.length; j++) {
			    			                    if (raw_array2[i] > raw_array2[j]) {
			    			                        
			    			                        int temp = raw_array2[j];
			    			                        raw_array2[j] = raw_array2[i];
			    			                        raw_array2[i] = temp;

			    			                       
			    			                    }
			    			                }
			    			            }

			    			            System.out.println("配列を昇順で: " + Arrays.toString(raw_array2));
			    			            
			    //LV10のパスカルの三⾓形を出⼒してください。
			    //この質問がわかりません
				}
			}




				 

