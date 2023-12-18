package co.jp.chapter06;

public class JavaHomeWork06 {

}
//質問1
//修飾子: `public static`
//返却型: `void`
// 関数名: `main`
// 引数（引数の型・名称）: `String[] args`

//質問2
public class ArrayOperations {

    public static int sum(int[] datas) {
        int result = 0;
        for (int data : datas) {
            result += data;
        }
        return result;
    }

    public static int max(int[] datas) {
        int max = datas[0]; 
        for (int data : datas) {
            if (data > max) {
                max = data;
            }
        }
        return max;
    }

    public static int min(int[] datas) {
        int min = datas[0]; 
        for (int data : datas) {
            if (data < min) {
                min = data;
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] dataArray = {1, 5, 3, 7, 2, 8};


        int sumResult = sum(dataArray);
        System.out.println("配列の和: " + sumResult);


        int maxResult = max(dataArray);
        System.out.println("配列の最大値: " + maxResult);
        
        int minResult = min(dataArray);
        System.out.println("配列の最小値: " + minResult);
    }
}

//質問3
//null

//質問4
//value2

//質問5
//true

//質問6-0
public class Kicker {

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

    public static void main(String[] args) {

        String[] stringArray = {"apple", "orange", "banana"};
        

        printArray(stringArray);
    }
}

//質問6-1
public class ArrayMerger {

    public static int[] mergeArray(int[] left, int[] right) {
        if (left == null && right == null) {
            return null; 
        } else if (left == null) {
            return right.clone();
        } else if (right == null) {
            return left.clone(); 
        }

        int totalLength = left.length + right.length;
        int[] mergedArray = new int[totalLength];

        
        System.arraycopy(left, 0, mergedArray, 0, left.length);

       
        System.arraycopy(right, 0, mergedArray, left.length, right.length);

        return mergedArray;
    }

    public static void main(String[] args) {
  
        int[] leftArray = {1, 2, 3};
        int[] rightArray = {4, 5, 6};

  
        int[] mergedArray = mergeArray(leftArray, rightArray);

        System.out.print("Merged Array: [");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i]);
            if (i < mergedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

//質問6-2
public class ArraySubArray {

    public static int[] subArray(int[] array, int startIndex, int length) {

        if (array == null || startIndex < 0 || startIndex >= array.length || length < 0) {
            return null;
        }

        int actualLength = Math.min(length, array.length - startIndex);

        int[] subArray = new int[actualLength];

        System.arraycopy(array, startIndex, subArray, 0, actualLength);

        return subArray;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        int startIndex = 1;
        int length = 3;
        int[] resultArray = subArray(originalArray, startIndex, length);

        System.out.print("Original Array: [");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i]);
            if (i < originalArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("SubArray: [");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
            if (i < resultArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

//質問7
public class CharArrayTrimmer {

    public static char[] trim(char[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return inputArray; // nullまたは空の場合はそのまま返す
        }

        int startIndex = 0;
        int endIndex = inputArray.length - 1;

        while (startIndex <= endIndex && Character.isWhitespace(inputArray[startIndex])) {
            startIndex++;
        }

        while (endIndex >= startIndex && Character.isWhitespace(inputArray[endIndex])) {
            endIndex--;
        }
        
        int trimmedLength = endIndex - startIndex + 1;
        char[] trimmedArray = new char[trimmedLength];
        System.arraycopy(inputArray, startIndex, trimmedArray, 0, trimmedLength);

        return trimmedArray;
    }

    public static void main(String[] args) {

        char[] originalArray = {' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', ' '};

        char[] resultArray = trim(originalArray)
        		
        System.out.print("Original Array: [");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i]);
            if (i < originalArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Trimmed Array: [");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
            if (i < resultArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

//質問8
public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        if (array == null || array.length <= 1) {
            return array; 
        }

        int n = array.length;
        boolean swapped;

        do {
            swapped = false;

            for (int i = 1; i < n; i++) {

                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }


            n--;
        } while (swapped);

        return array;
    }

    public static void main(String[] args) {

        int[] unsortedArray = {5, 2, 9, 1, 5, 6};


        int[] sortedArray = bubbleSort(unsortedArray);


        System.out.print("Unsorted Array: [");
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.print(unsortedArray[i]);
            if (i < unsortedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Sorted Array: [");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i]);
            if (i < sortedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    
}

//質問9
1、Merged Array: [1, 2, 3, 4, 5, 6]
//2、Sorted Array: [1, 2, 5, 5, 6, 9]





