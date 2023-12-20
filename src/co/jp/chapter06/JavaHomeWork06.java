package co.jp.chapter06;

public class JavaHomeWork06 {

/*問題１
public static void main(String[] args);

修飾子 public static
関数名 main
引数（引数の型・名称） String[] args
返却型 void */
	
	
	
/*問題２
 
 配列の和を計算する
 public static itn sum(int[] data){
 int sum = 0;
 for(int value : data){
 sum += value;
 }
 return sum;
 }
 
 配列の最大値を計算する
 public static int max(int[] data){
 int max = Integer.MIN_VALUE;
 for(int value : data){
 if(value > max){
 max = value;
 }
 }
 return max;
 }
 
 配列の最小値を計算する
 public static int min(int[] data){
 int min = Integer.MAX_VALUE;
 for(itn value : data){
 if(value < min){
 min = value;
 }
 }
 return min;
 }  */


	
// 質問３
// 結果 null
	
// 質問４
// 結果 value2]
	
// 質問５
// 結果 ture
	
	
	
/* 質問６－０　
 配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintします。
 以下メソッドを呼び出してください。
 
 String[] array = {"value1", "value2", "value3"};
 printArray(array);
 }
 
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
*/
	
	
	
/* 質問６－１
静的なメソッドを定義してください
以下はメソッド実施例
int[] left = new int[] {1, 2, 3, 4};
int[] right = new int[] {5, 6, 7, 8};
// メソッドを実施後
int[] result = new int[] {1, 2, 3, 4, 5, 6, 7, 8};


メソッドの定義
 public static int[] mergeArray(int[] left, int[] right) {
 int leftLength = left.length;
 int rightLength = right.length;
 int[] result = new int[leftLength + rightLength];

 左側の配列をコピー
 for (int i = 0; i < leftLength; i++) {
     result[i] = left[i];
 }

 右側の配列をコピー
  for (int i = 0; i < rightLength; i++) {
      result[leftLength + i] = right[i];
  }
  return result;   
 }
 
 出力するためのメソッド
 public static void main(String[] args) {
  int[] left = new int[] {1, 2, 3, 4};
  int[] right = new int[] {5, 6, 7, 8};

  int[] result = mergeArray(left, right);

  結果の表示
   System.out.print("結果配列: ");
   for (int num : result) {
   System.out.print(num + " ");
   }
   }
}
 */
	
	
	
/*質問６－２
  public static void main(String[] args) {
   int[] array = {1, 2, 3, 4};
   int start = 1;
   int length = 2;

   int[] result = subArray(array, start, length);
       
   for (int i = 0; i < result.length; i++) {
    System.out.print(result[i] + (i < result.length - 1 ? ", " : "\n"));
   }
  }

  public static int[] subArray(int[] array, int startIndex, int length) {
   int[] subArray = new int[length];
    for (int i = 0; i < length; i++) {
      subArray[i] = array[startIndex + i];
   }
        return subArray;
    }
 */
	
	
	
// 質問７
	
/*質問８
	 public static void main(String[] args) {
	        int[] array = {11, 22, 33, 44, 55, 66};

	        int[] sortedArray = bubbleSort(array);

	        for (int value : sortedArray) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }

	    public static int[] bubbleSort(int[] array) {
	       
	        int n = array.length;
	        int[] sortedArray = array.clone(); 

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (sortedArray[j] > sortedArray[j + 1]) {
	                   
	                    int temp = sortedArray[j];
	                    sortedArray[j] = sortedArray[j + 1];
	                    sortedArray[j + 1] = temp;
	                }
	            }
	        }

	        return sortedArray;
	    }
}
*/
	
	
 
/*質問９
６-１を⽤い、２つ配列をマージします。

     int[] array1 = {1, 2, 3, 4};
	 int[] array2 = {5, 6, 7, 8};

	int[] mergedArray = mergeArray(array1, array2);

	 for (int value : mergedArray) {
		  System.out.print(value + " ");
	 }
		System.out.println();
	}
	
     public static int[] mergeArray(int[] left, int[] right) {
     
		int[] merged = new int[left.length + right.length];
		int index = 0;

		for (int element : left) {
		   merged[index++] = element;
	    }

		for (int element : right) {
		      merged[index++] = element;
		 }

		 return merged;
		  }
		}	
	}
 */
 

	


		
		

	
	

	
	
		
