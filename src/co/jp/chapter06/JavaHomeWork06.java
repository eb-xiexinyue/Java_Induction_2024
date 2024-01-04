package co.jp.chapter06;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		質問１. 以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
//		1 public static void main(String[] args);
//		回答　: 修飾⼦は public (公開) と static (静的)、
//		       返却型は void の為、返却値なし、
//		       関数名は main、
//		       引数（引数の型・名称）は、１つあります。引数名は args , 引数の型は String[] (Stringの配列型)
		
//		質問２. 配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
//		回答　: 
		int[][] array2d = new int[][] {
			
			{6, 2, 3, 0},
			{5, 68, 7, 16},
			
		};
		
		int sum2 = calculateSum(array2d);
		int max2 = calculateMax(array2d);
		int min2 = calculateMin(array2d);
		System.out.println("⾏列（２次元配列）の和は"+sum2);
		System.out.println("最⼤値は"+max2);
		System.out.println("最小値は"+min2);
		
//		質問３. 以下メソッドの実施結果を教えてください。
//		回答　: null
		String x = null;
		sayHello(x);
		System.out.println(x);
		
//		質問４. 以下メソッドの実施結果を教えてください。
//		回答　: value2
		String[] array = new String[]{"value1"};
		fillArray(array);
		System.out.println(array[0]);
		
//		質問５. 以下メソッドの実施結果を教えてください。
//		回答　: true
		String[] array5 = null;
		fillArray5(array5);
		System.out.println(array5 == null);
		
//		質問６-０: 配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintしま す。以下メソッドを呼び出してください。
//		回答　:
		Object[] myArray = {false,1,"one", "nine", 9.4, "0.19"};
		printArray(myArray);
//		System.out.println(Arrays.toString(myArray)); 
		
//		質問６-１: 以下静的なメソッドを定義してください。
		int[] left = new int[] {2, 0, 2, 4}; 
		int[] right = new int[] {0, 1, 0, 4};
		printArray1(megerArray(left, right));
		
//		質問６-２: 以下静的なメソッドを定義してください。
		int[] originalArray = {3, 6, 1, 4, 5};
		
		int startIndex = 3;
		int length = 5;
		int[] resultArray = subArray(originalArray, startIndex, length);
		
		System.out.print("Original Array: ");		
		printArray1(originalArray);
		
		System.out.print("SubArray: ");
		printArray1(resultArray);
		
//		質問７: 以下静的なメソッドを定義してください。
		char[] inputArray = {' ', ' ', '2', ' ', '0', ' ', '2', '4', ' ', ' ', ' '};
		char[] resultArray7 = trim(inputArray);
		printArray2(resultArray7);
		
//		質問８: バブルソート⽤メソッドを作成してください。
		int[] arr = {88, 26, 17, 18, 13, 91, 77}; 
		int[] sortedArr = bubbleSort(arr);
		printArray1(sortedArr);
		
//		質問９: メソッドの呼び出す練習。
		bubbleSort(megerArray(left, right)); //１⾏のコード
		
		printArray1(bubbleSort(megerArray(left, right))); //結果確認
	}
		
		
		
//		8.
		static int[] bubbleSort(int[] arr) {
//		方法１:			
			for (int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					if(i!=j) {
						if(arr[i]<arr[j]) {
							int temp = arr[j];
							arr[j]=arr[i];
							arr[i]=temp;
						}
					}
				}
			}
			
//		方法２:
//			int n = arr.length;
//			for (int i = 0; i < n - 1 ; i++) {
//				for (int j = 0; j < n - i - 1; j++) {
//					if (arr[j] > arr[j + 1]) {
//						// 隣接する要素を交換する
//						int temp = arr[j];
//						arr[j] = arr[j + 1];
//						arr[j + 1] = temp;
//					}
//				}
//			}
			return arr;
		}
	
	
	
//		7.
		static char[] trim(char[] inputarray) {
			 if (inputarray == null || inputarray.length == 0) {
				 return inputarray; // nullまたは空の場合はそのまま返す.
			 }
			 int startIndex = 0;
			 int endIndex = inputarray.length - 1;
		        
			 while (startIndex <= endIndex && Character.isWhitespace(inputarray[startIndex])) {	
				 startIndex++;
			 }
		        
			 while (endIndex >= startIndex && Character.isWhitespace(inputarray[endIndex])) {
				 endIndex--;
			 }
			 int trimmedLength = endIndex - startIndex + 1;
			 char[] trimmedArray = new char[trimmedLength];	
			 System.arraycopy(inputarray, startIndex, trimmedArray, 0, trimmedLength);	
			 
			 return trimmedArray;
			 
		}
		
		public static void printArray2(char[] objs) {
			 if(objs == null) {
			 System.out.println("null");
			 return;
			 }
			 String prefix = "";
			 StringBuilder sb = new StringBuilder();
			 sb.append("[");
			 for(char obj : objs) {
			 sb.append(prefix);
			 sb.append(String.valueOf(obj));
			 prefix = ", ";
			 }
			 sb.append("]");
			 System.out.println(sb.toString()); 
			 }
		
//		6.2
		static int[] subArray(int[] array, int startIndex, int length) {
    		if (array == null || startIndex < 0 || startIndex >= array.length || length < 0) {
    		return null;
    	
    		}
    		int actualLength = Math.min(length, array.length - startIndex);
    		int[] subArray = new int[actualLength];
    		System.arraycopy(array, startIndex, subArray, 0, actualLength);
    		return subArray;
    		
    	}
		
//		6.1
		static int[] megerArray(int[] left, int[] right) {
			int leftlength = left.length;
			int rightlength = right.length;
			int megerlength = leftlength + rightlength;
			
			int[] megerArray = new int[megerlength];
			
			for (int i = 0; i < leftlength; i++) {
				megerArray[i] = left[i];
			}
			
			for (int i = 0; i < rightlength; i++) {
				megerArray[leftlength + i] = right[i];	
			}
			
			return megerArray;
			
		}
		
		public static void printArray1(int[] objs) {
			 if(objs == null) {
			 System.out.println("null");
			 return;
			 }
			 String prefix = "";
			 StringBuilder sb = new StringBuilder();
			 sb.append("[");
			 for(int obj : objs) {
			 sb.append(prefix);
			 sb.append(String.valueOf(obj));
			 prefix = ", ";
			 }
			 sb.append("]");
			 System.out.println(sb.toString()); 
			 }
		
//		6.0		
		public static void printArray(Object[] objs) {
		 if(objs == null) {
		 System.out.println("null");
		 return;
		 }
		 String prefix = "";
		 StringBuilder sb = new StringBuilder();
		 sb.append("[");
		 for(Object obj : objs) {
		 sb.append(prefix);
		 sb.append(String.valueOf(obj));
		 prefix = ", ";
		 }
		 sb.append("]");
		 System.out.println(sb.toString()); 
		 }
		
//		5.
		private static void fillArray5(String[] array5) {
		 array5 = new String[]{"1", "2"};
		 }
		
//		4.
		private static void sayHello(String y) {
		 y = "Hello world";
		 }
		
//		3.
		private static void fillArray(String[] array) {
		 array[0] = "value2";
		 }

//		2.3 最小值
		static int calculateMin(int[][]array2d) {
			int min = array2d[0][0];
			
			for(int[] row :array2d) {
				for(int num : row) {
//					for(int i=1;i<array2d.length;i++) {
						if(num<min) {
							min = num;
						}
					}
				}
//			}
			return min;	
			
		}
		
//		2.2 最大值
		static int calculateMax(int[][]array2d) {
			int max = array2d[0][0];
			
			for(int[] row : array2d) {
				for(int num : row) {
//					for(int i=1;i<array2d.length;i++) {
						if(num>max) {
							max = num;
						}
					}
				}
//			}
			return max;	
			
		}
		
//		2.1 和
		static int calculateSum(int[][] array2d) {
			int sum = 0;
			
			for(int[] row : array2d) {
				for(int num : row) {
					sum += num;
				}
			}			
			return sum;	
			
		}
		
	
}







