package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// int[] arr = {12,13,14,15,16,17,18};
		  
		// for(int i=0;i<arr.length;i++) {
		// System.out.println(arr[i]);
		 
		// int[] raw_array = {45,67,12,3,50,29};
		// System.out.println(Arrays.toString(raw_array));
		 
		// for(int i=0;i<raw_array.length;i++){
		//	 for(int j=0;j<raw_array.length;j++) {
		//		 if(i!=j) {
		//			 if(raw_array[i]<raw_array[j]) {
		//				 int temp = raw_array[j];
		//				 raw_array[j]=raw_array[i];
		//				 raw_array[i]=temp;	 
		//			 }
		//			 
		//		 }
		//		 
		//	 }
		 //}
	 //System.out.println(Arrays.toString(raw_array));
	//}
//}
		//質問１：0,0,0,0
		//質問２：5,6
		//質問３：[[I@7ad041f3, [I@251a69d7]
//		int[][] array = new int [2][3];
//		System.out.println(Arrays.toString(array));
//	}
//}		
		//質問４：
//		int [][] array2d =  new int [4][2];
//		for (int [] out: array2d) {
//			for (int inner :out) {
//		System.out.println(inner);
//		}
//	}
//}      输出一个4行2列的二维数组，for (int[] out : array2d) 表示外层循环，其中 out 是数组 array2d 中的每一行
//       内层循环 for (int inner : out) 中，inner 表示二维数组中的每个具体值。

		//質問５：

//        int[] arr = new int[]{1,3,5,7,100,0,1};
        
 //       Arrays.sort(arr);
        
  //      System.out.println("最大值为：" + arr[arr.length - 1]); // 输出最大值
  //      System.out.println("最小值为：" + arr[0]); // 输出最小值
 //   }
//}
//}
		//質問６：
//		int[] array = new int [4];
//		int sum = 0;
//		for (int i = 0; i < array.length; i++) {
//		    sum += array[i];
//		}
//		System.out.println("数组的总和为：" + sum);
//	}
//}		
		//質問７
//		int [][]a = {{2, 40}, {1, 23}};
//		int [][]b = {{1, 46}, {16, 81}};
//		int [][]sum = new int[2][2];
//		for (int i = 0; i < 2; i++) {
//		for (int j = 0; j < 2; j++) {
//		sum[i][j] = a[i][j] + b[i][j];
//		}
//		}
//		for (int i = 0; i < 2; i++) {
//		for (int j = 0; j < 2; j++) {
//		System.out.println(sum[i][j]);
//		}
//		}
//}	
//		int [][]a = {{2, 40}, {1, 23}};
//		int [][]b = {{1, 46}, {16, 81}};
//		int [][]sum = new int[2][2];
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				sum[i][j] = a[i][j] * b[i][j];
//			}
//		}
//		for (int i = 0; i < 2; i++) {
//		for (int j = 0; j < 2; j++) {
//				System.out.println(sum[i][j]);
//			}
//		}
//}
//}
		//新米八問
		//質問１
//		int sum = 0;
//		for(int i=1;i<=100;i++) {
//			if (i%2==0){
//			sum += i;
//			}
//		}
//			System.out.println(sum);	

//	}
//}
		//質問２
//		int result = 1;
//		for(int i=1;i<=5;i++) {
//		System.out.println(i);
//		result *= i;
//		}
//	System.out.println(result);
//}
//}
		//質問３
//		int[] array = new int[]{1,2,6,7,9,6,2,1};
//		Arrays.sort(array);
//		System.out.println("最大值为"+ array[array.length-1]);
//		System.out.println("最小值为"+ (array[0]));

//	int[] array = new int[]{1,2,6,7,9,6,2,1};
//	int sum = 0;{
//	for (int i = 0; i < array.length; i++) {
  //  sum += array[i];
//	}
//	System.out.println("数组的总和为：" + sum);
//	}
//	int b = sum/array.length;
//	System.out.println("数组的平均数为："+ b);
//	}
//	}
	//質問４
//	int[] array = new int[]{1,2,6,7,9,6,2,1};
//	System.out.println();
//	for(int i=0;i<array.length-1;i++){
//		for(int j=i+1;j<array.length;j++) {
//	if(array[i]==array[j]) {
//	
//	System.out.println(array[i]);
//	break;
//		}
//	}	
//}
		//質問５
/*		int[] array = new int[]{1,2,6,7,9,6,2,1};
		int targetValue=7;
		int targetIndex=-1;
		for(int i=0;i<array.length;i++) {
			if(array[i]==targetValue) {
		targetIndex=i;
				break;
	}
		}
			System.out.println(targetIndex);
} 
}
*/
		//質問６
/*		int[][] a = {{2,3},{7,8}};
		int[][] b = {{13,2},{87,4}};
		int[][] sum = new int [2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;i<2;i++) {
				sum[i][j]= a[i][j]*b[i][j];
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
		
		System.out.println(sum[i][j]);
			}
		}
		}
}
*/
		//質問７
/*		int[] array = {1,3,67,943,24,34};
		for(int i=0;i<array.length;i++) {; 
			for(int j=0;j<array.length;j++) {
				if(i!=j) {
				if(array[i]<array[j]){
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				}
			}
		}
	}
		System.out.println(Arrays.toString(array));
}
}
*/
		//質問８
/*		 int rows = 10;
	        for (int i = 0; i < rows; i++) {
	            int number = 1;
	            System.out.format("%" + (rows - i) * 2 + "s", ""); 
	            for (int j = 0; j <= i; j++) {
	                System.out.format("%4d", number); 
	                number = number * (i - j) / (j + 1);
	            }
	            System.out.println();
	        }
	    }
	}
		*/