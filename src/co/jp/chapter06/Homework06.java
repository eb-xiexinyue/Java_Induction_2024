package co.jp.chapter06;

public class Homework06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//问题1
		//修飾子 public  static
		//返却型  void
		//関数名  main
		//引数   String[] args
		
		/*问题2
		 * // 配列の和を求める
    public static int sum(int[] data) {
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        return sum;
    }

    // 配列の最大値を求める
    public static int max(int[] data) {
        int max = Integer.MIN_VALUE;
        for (int value : data) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // 配列の最小値を求める
    public static int min(int[] data) {
        int min = Integer.MAX_VALUE;
        for (int value : data) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
		 */
		
		/*问题3
		 null
		 */

		
		 /*问题4
		  value2
		  */
		
		
		/*问题5
		 true
		 */
		
		
		/*问题6—1
		 * ublic class ArrayMerger {
    public static void main(String[] args) {
        int[] leftArray = {1, 3, 5};
        int[] rightArray = {2, 4, 6, 8};

        int[] mergedArray = mergeArray(leftArray, rightArray);

        // 打印合并后的数组
        System.out.print("合并后的数组: ");
        printArray(mergedArray);
    }

        //通过左右两个数组得到一个新数组
         public static int[] mergeArray(int[] left, int[] right) {
        int leftLength = left.length;
        int rightLength = right.length;
        int mergedLength = leftLength + rightLength;

        // 创建一个新数组，长度为两个数组长度之和
        int[] mergedArray = new int[mergedLength];

        // 把左数组的元素复制到新数组
        System.arraycopy(left, 0, mergedArray, 0, leftLength);

        // 把右数组的元素复制到新数组
        System.arraycopy(right, 0, mergedArray, leftLength, rightLength);

        return mergedArray;
    }

    // 打印数组
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
		 */
		
		
		/*问题6——2
		 * public class ArraySubArray {
        public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        int startIndex = 2;
        int length = 4;

        int[] subArray = subArray(array, startIndex, length);

       
    }

         // サブ配列を取得するメソッド
         public static int[] subArray(int[] array, int startIndex, int length) {
        // チェック: 開始インデックスが有効かつ、長さが0以上であることを確認
        if (startIndex < 0 || startIndex >= array.length || length < 0) {
            throw new IllegalArgumentException("引数が無効です");
        }

        // サブ配列を取得
        int[] subArray = new int[length];
        System.arraycopy(array, startIndex, subArray, 0, length);

        return subArray;
    }

		 */
		 /*问题7
		  * public class CharArrayTrimmer {
         public static void main(String[] args) {
        char[] inputArray = {' ', 'a', 'b', 'c', ' '};

        char[] trimmedArray = trim(inputArray);

        // トリムされた配列の出力
        System.out.print("トリムされた配列: ");
        printArray(trimmedArray);
    }

       // 配列をトリムする
        public static char[] trim(char[] array) {
        int start = 0;
        // 先頭の空白文字を削除
        if (array.length > 0 && array[0] == ' ') {
            start++;
        }

        int end = array.length - 1;
        // 末尾の空白文字を削除
        if (end >= 0 && array[end] == ' ') {
            end--;
        }

        // トリムされた配列を作成
        int trimmedLength = end - start + 1;
        char[] trimmedArray = new char[trimmedLength];
        System.arraycopy(array, start, trimmedArray, 0, trimmedLength);

        return trimmedArray;
    }

    // 配列を出力するメソッド
    public static void printArray(char[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
		  */
		
		
		
		
		/*问题8
		 * public class BubbleSort {
         public static void main(String[] args) {
          int[] array = {100, 28, 99, 0, 57, 66};
        
        printArray(array);

        int[] sortedArray = bubbleSort(array);

        printArray(sortedArray);
    }

    // バブルソート
    public static int[] bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) 
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    // 配列打印
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
		 */
		
		
		/*问题9
		 * 
		 */
	}

}
