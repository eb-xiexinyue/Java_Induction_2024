package co.jp.chapter06;

public class JavaHomeWork06 {
	//質問１
	//修饰子是public，返却型是static，函数名是viod，引数型是string，引数是args
	
	//質問２
	int[] dataArray = {5, 3, 8, 1, 7, 2, 6, 4};{
		
	System.out.println("Sum: " + calculateSum(dataArray));
    System.out.println("Max Value: " + findMaxValue(dataArray));
    System.out.println("Min Value: " + findMinValue(dataArray));
}

	private String calculateSum(int[] dataArray2) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	private String findMinValue(int[] dataArray2) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	private String findMaxValue(int[] dataArray2) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}

	//質問３
    //null

    //質問４
    //value2

    //質問５
    //true

    //質問６-0
public static void printArray(Object[] objs) {
    if (objs == null) {
        System.out.println("null");
        return;
    }

    String prefix = "";
    StringBuilder sb = new StringBuilder();
    sb.append("[");

    
    for (Object obj : objs) {
        sb.append(prefix);  
        sb.append(String.valueOf(obj));  
        prefix = ", ";  
    }

    sb.append("]");  
    System.out.println(sb.toString());  
}
}
	//質問６−1
public class ArrayMerger {
    public static void main(String[] args) {
        int[] leftArray = {1,2,3,4};
        int[] rightArray = {5,6,7,8};

        int[] mergedArray = mergeArray(leftArray, rightArray);

        
        for (int value : mergedArray) {
            System.out.print(value + " ");
        }
       
    }

    
    public static int[] mergeArray(int[] left, int[] right) {
        
        int[] merged = new int[left.length + right.length];

 
        System.arraycopy(left, 0, merged, 0, left.length);

        
        System.arraycopy(right, 0, merged, left.length, right.length);

        return merged;  
    }
}

//質問６−2
public class ArraySubArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4};
        int startIndex = 1;
        int length = 2;

        int[] subArray = subArray(originalArray, startIndex, length);

        // サブ配列を出力
        for (int value : subArray) {
            System.out.print(value + " ");
        }

    }

   
    public static int[] subArray(int[] array, int startIndex, int length) {
    
        if (startIndex < 0 || startIndex + length > array.length) {
            throw new IllegalArgumentException("Invalid startIndex or length.");
        }
        int[] subArray = new int[length];
        System.arraycopy(array, startIndex, subArray, 0, length);

        return subArray;
    }
}

//質問７
public class CharArrayTrimmer {
    public static void main(String[] args) {
        char[] inputArray = {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};

        char[] outputArray = trim(inputArray);

 
        for (char value : outputArray) {
            System.out.print(value + " ");
        }
    
    }

 
    public static char[] trim(char[] array) {
       
        int startIndex = 0;
        while (startIndex < array.length && array[startIndex] == ' ') {
            startIndex++;
        }

       
        int endIndex = array.length - 1;
        while (endIndex >= 0 && array[endIndex] == ' ') {
            endIndex--;
        }

      
        int length = endIndex - startIndex + 1;
        char[] trimmedArray = new char[length];
        System.arraycopy(array, startIndex, trimmedArray, 0, length);

        return trimmedArray;
    }
}
//質問８
public class BubbleSort {
    public static void main(String[] args) {
        int[] unsortedArray = {5, 2, 9, 1, 5, 6};

        int[] sortedArray = bubbleSort(unsortedArray);

       
        for (int value : sortedArray) {
            System.out.print(value + " ");
        }
       
    }

    
    public static int[] bubbleSort(int[] array) {
        int n = array.length;

       
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // 交换 array[j] 和 array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
//質問９
//不解
