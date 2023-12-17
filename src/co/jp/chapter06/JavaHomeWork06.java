package co.jp.chapter06;

public class JavaHomeWork06 {

	
		// TODO 自動生成されたメソッド・スタブ

		
//		質問１  修飾子：public static
//				返却型：void
//				関数名：main
//				引数型：String、引数名:args
		
		//質問２
//		    public static int sum(int[] arr) {
//		        int total = 0;
//		        for (int num : arr) {
//		            total += num;
//		        }
//		        return total;
//		    }
//
//		    public static int findMax(int[] arr) {
//		        int max = arr[0];
//		        for (int i = 1; i < arr.length; i++) {
//		            if (arr[i] > max) {
//		                max = arr[i];
//		            }
//		        }
//		        return max;
//		    }
//
//		    public static int findMin(int[] arr) {
//		        int min = arr[0];
//		        for (int i = 1; i < arr.length; i++) {
//		            if (arr[i] < min) {
//		                min = arr[i];
//		            }
//		        }
//		        return min;
//		    }
//
//		    public static void main(String[] args) {
//		        int[] numbers = {5, 10, 2, 8, 15};
//
//		        // 和を求める
//		        int sumResult = sum(numbers);
//		        System.out.println("配列の和: " + sumResult);
//
//		        // 最大値を求める
//		        int maxResult = findMax(numbers);
//		        System.out.println("最大値: " + maxResult);
//
//		        // 最小値を求める
//		        int minResult = findMin(numbers);
//		        System.out.println("最小値: " + minResult);
//		    }}
		
	
	//質問３   null
		
//			private static void sayHello(String y) {
//				y = "Hello world";
//			}
//			public static void main(String args[]) {
//				String x = null;
//				sayHello(x);
//				System.out.println(x);
//			}}
	
	//質問４　　value2
//			private static void fillArray(String[]array) {
//				array[0] = "value2";
//			}
//			public static void main(String args[]) {
//				String[] array = new String[] {"value1"};
//				fillArray(array);
//				System.out.println(array[0]);
//			}
//}
	
	//質問５　　true
//			private static void fillArray(String[]array) {
//				array = new String[] {"1","2"};
//			}
//			public static void main(String args[]) {
//				String [] array = null;
//				fillArray(array);
//				System.out.println(array==null);
//			}
//}

	//質問６−０　　　
//			public static void printArray(Object[]objs) {
//				if(objs == null) {
//					System.out.println("null");
//					return;
//				}
//				String prefix = "";
//				StringBuilder sb = new StringBuilder();
//				sb.append("[");
//				for (Object obj : objs) {
//					sb.append(prefix);
//					sb.append(String.valueOf(obj));
//					prefix = ",";
//				}
//				sb.append("]");
//				System.out.println(sb.toString());
//				
//			}
//			public static void main(String[] args) {
//		        Object[] myArray = {1, "two", 3.0, true};
//		        printArray(myArray);
//			}
//}			
	
	//質問６−1
//	public static int[] megerArray(int[] left, int[] right) {
//        int leftLength = left.length;
//        int rightLength = right.length;
//        
//        // 新しい配列の長さを計算
//        int mergedLength = leftLength + rightLength;
//        
//        // 新しい配列を作成
//        int[] mergedArray = new int[mergedLength];
//        
//        // 左側の配列を新しい配列にコピー
//        for (int i = 0; i < leftLength; i++) {
//            mergedArray[i] = left[i];
//        }
//        
//        // 右側の配列を新しい配列にコピー
//        for (int i = 0; i < rightLength; i++) {
//            mergedArray[leftLength + i] = right[i];
//        }
//        
//        // マージされた配列を返す
//        return mergedArray;
//    }
//
//    public static void main(String[] args) {
//        int[] left = new int[] {1, 2, 3, 4};
//        int[] right = new int[] {5, 6, 7, 8};
//        
//        int[] result = megerArray(left, right);
//        
//        // 結果を確認
//        System.out.print("結果: [");
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i]);
//            if (i != result.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
//    }
//}
	
	//質問６−2
//	public static int[] subArray(int[] array, int startIndex, int length) {
//        // 戻り値となるサブ配列の長さを計算
//        int subArrayLength = Math.min(length, array.length - startIndex);
//        
//        // サブ配列を作成
//        int[] sub = new int[subArrayLength];
//        
//        // 配列からサブ配列をコピー
//        for (int i = 0; i < subArrayLength; i++) {
//            sub[i] = array[startIndex + i];
//        }
//        
//        // サブ配列を返す
//        return sub;
//    }
//
//    public static void main(String[] args) {
//        int[] array = new int[] {1, 2, 3, 4};
//        int startIndex = 1;
//        int length = 2;
//        
//        int[] result = subArray(array, startIndex, length);
//        
//        // 結果を確認
//        System.out.print("結果: [");
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i]);
//            if (i != result.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
//    }
//}
	//質問7
//	public static char[] trim(char[] input) {
//        int start = 0;
//        int end = input.length - 1;
//        
//        // 先頭から空白を見つける
//        while (start < input.length && input[start] == ' ') {
//            start++;
//        }
//        
//        // 末尾から空白を見つける
//        while (end >= 0 && input[end] == ' ') {
//            end--;
//        }
//        
//        // 空白を取り除いた配列を作成
//        char[] output = new char[end - start + 1];
//        for (int i = start; i <= end; i++) {
//            output[i - start] = input[i];
//        }
//        
//        return output;
//    }
//
//    public static void main(String[] args) {
//        char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; // 入力引数
//        char[] output = trim(input);
//        
//        // 結果を出力
//        System.out.print("結果: [");
//        for (int i = 0; i < output.length; i++) {
//            System.out.print(output[i]);
//            if (i != output.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
//    }
//}
	//質問８
	public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 隣接する要素を交換する
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90}; // 入力引数
        int[] sortedArr = bubbleSort(arr);
        
        // ソート済みの配列を出力
        System.out.print("ソート済みの配列: [");
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i]);
            if (i != sortedArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
