package co.jp.chapter06;

public class JavaHomeWork06 {

//	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

 
//	}	

	
	
	
	//質問1.以下関数の修飾子、返却型、関数名、引数(引数の型・名称)を回答してください。
	/*回答1：	 修飾子：public static
			 返却型：void
			 関数名：main
			 引数(引数型：String、引数名:args)
			*/
	
	
	//質問2.配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
	
	
//回答２：
//	public static void main(String[] args) {
//
//		
//		//回答２の出力コードに関する
//		int[] numbers = {10, 20, 5, 6, 15};
//		// 和を求める
//		 int sumResult = sum(numbers);
//		 System.out.println("配列の和: " + sumResult);
//		 // 最大値を求める
//		 int maxResult = findMax(numbers);
//		 System.out.println("最大値: " + maxResult);
//		 // 最小値を求める
//		 int minResult = findMin(numbers);
//		 System.out.println("最小値: " + minResult);
//		 
//		 
//		 
//		
//		 
//	}	
//   public static int sum(int[] arr) {
//			 int total = 0;
//			 for (int num : arr) {
//				 total += num;
//			 }
//			 return total;
//		 }
//		 public static int findMax(int[] arr) {
//			 int max = arr[0];
//			 for (int i = 1; i < arr.length; i++) {
//				 if (arr[i] > max) {
//					 max = arr[i];
//				 }
//			 }
//			 return max;
//		 }
//		 public static int findMin(int[] arr) {
//			 int min = arr[0];
//			 for (int i = 1; i < arr.length; i++) {
//				 if (arr[i] < min) {
//					 min = arr[i];
//				 }
//			 }
//			 return min;
//		 }

	//回答２以上　
	
	
	
	//質問3.以下メソッドの実施結果を教えてください
//public class Kicker{
//	private static void sayHello(String y) {
//		 y = "Hello world";
//		 
//	}
//	public static void main(String args[]) {
//	 String x = null ;
//	 sayHello(x);
//	 System.out.println(x);
//	} 	
//}

	//回答3:null
	
	
	
	//質問4:以下メソッドの実施結果を教えてください。	
//public class Kicker{	
//	private static void fillArray(String[]array) {
//		array[0] = "value2";	
//	}
//	public static void main(String args[]) {
//		String[] array = new String[] {"value1"};
//		fillArray(array);
//		System.out.println(array[0]);
//	}
//	
//}	
	//回答４:value2
	
	
	//質問5:以下メソッドの実施結果を教えてください。	
//public class Kicker{	
//	private static void fillArray(String[]array) {
//		array = new String[] {"1","2"};
//	}
//	public static void main(String args[]) {
//		String [] array = null;
//		fillArray(array);
//		System.out.println(array==null);
//	}
//}	
	//回答5:true
	
	
	//質問6-0:配列は直接に印刷できません。下記メソッドを利用して、配列をprintしま す。以下メソッドを呼び出してください。
//	public static void printArray(Object[]objs) {
//		if(objs == null) {
//			System.out.println("null");
//			return;
//		}
//		String prefix = "";
//		StringBuilder sb = new StringBuilder();
//		sb.append("[");
//		for (Object obj : objs) {
//			sb.append(prefix);
//			sb.append(String.valueOf(obj));
//			prefix = ",";
//		}
//		sb.append("]");
//		System.out.println(sb.toString());
//		
//	}
//
//	public static void main(String[] args) {
//        Object[] myArray = {1, "one", 1.0, true};
//        printArray(myArray);
//	}	
//	質問6-0の回答以上
	


	//質問６−2
//	public static int[] subArray(int[] array, int startIndex, int length) {
//		  
//		 int subArrayLength = Math.min(length, array.length - startIndex);
//		 
//		 int[] sub = new int[subArrayLength];
//		 
//		 for (int i = 0; i < subArrayLength; i++) {
//			 sub[i] = array[startIndex + i];
//		 }
//	
//		 return sub;
//	}
//	
//	 public static void main(String[] args) {
//		 int[] array = new int[] {1, 2, 3, 4};
//		 int startIndex = 1;
//		 int length = 2;
//		 
//		 int[] result = subArray(array, startIndex, length);
//		
//		 System.out.print("結果: [");
//		 for (int i = 0; i < result.length; i++) {
//			 System.out.print(result[i]);
//			 if (i != result.length - 1) {
//				 System.out.print(", ");
//			 }
//			 
//		 }
//		 System.out.println("]");
//	 }
	
	//質問7
//	public static char[] trim(char[] input) {
//		 int start = 0;
//		 int end = input.length - 1;
//		
//		 while (start < input.length && input[start] == ' ') {
//			 start++;
//		 }
//		
//		 while (end >= 0 && input[end] == ' ') {
//			 end--;
//			 
//		 }
//		
//		 char[] output = new char[end - start + 1];
//		 for (int i = start; i <= end; i++) {
//			 output[i - start] = input[i];
//		 }
//		 return output;
//		 
//	}
//	
//	 public static void main(String[] args) {
//		 char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; 
//		 char[] output = trim(input);
//		 
//	
//		 System.out.print("結果: [");
//		 for (int i = 0; i < output.length; i++) {
//			 System.out.print(output[i]);
//			 if (i != output.length - 1) {
//				 System.out.print(", ");
//				 
//			 }
//		 }
//		 System.out.println("]");
//		 
//	 }
	

	
	//質問８
//	public static int[] bubbleSort(int[] arr) {
//		int n = arr.length;
//		 for (int i = 0; i < n - 1; i++) {
//			 for (int j = 0; j < n - i - 1; j++) {
//				 if (arr[j] > arr[j + 1]) {
//					 int temp = arr[j];
//					 arr[j] = arr[j + 1];
//					 arr[j + 1] = temp;
//					 
//				 }
//			 }
//		 }
//		 return arr;
//	}
//	public static void main(String[] args) {
//		 int[] arr = {64, 34, 25, 12, 22, 11, 90};
//		 int[] sortedArr = bubbleSort(arr);
//		 
//		 System.out.print("ソート済みの配列: [");
//		 for (int i = 0; i < sortedArr.length; i++) {
//			 System.out.print(sortedArr[i]);
//			 if (i != sortedArr.length - 1) {
//				 System.out.print(", "); 
//			 }
//		 }
//		 System.out.println("]");
//	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	

}
