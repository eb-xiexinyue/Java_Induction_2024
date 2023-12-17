package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * 質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してくださ 
		い。
		public static void main(String[] args);
		修飾子: public static
		返却型: void
		関数名: main
		引数 :型: String[] 名称: args
		
		質問２
    public static void main(String[] args) {
        int[] datas = {1, 2, 3, 4}; 

        int sum = sum(datas);
        int max = max(datas);
        int min = min(datas);

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static int sum(int[] datas) {
        int total = 0;
        for (int data : datas) {
            total += data;
        }
        return total;
    }

    public static int max(int[] datas) {
        int maxValue = datas[0];
        for (int data : datas) {
            if (data > maxValue) {
                maxValue = data;
            }
        }
        return maxValue;
    }

    public static int min(int[] datas) {
        int minValue = datas[0];
        for (int data : datas) {
            if (data < minValue) {
                minValue = data;
            }
        }
        return minValue;
    }
}

		質問３．
		答え：null
		
		質問４︓
		答え：value2
		
		質問５︓
		答え：true
		
		質問６：
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4}; 

        printArray(numbers); 
    }

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

	質問６-１
    public static void main(String[] args) {
        int[] left = {1, 2, 3, 4};
        int[] right = {5, 6, 7, 8};

        int[] result = mergeArray(left, right);

       
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i < result.length - 1 ? ", " : "\n"));
        }
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

	質問６-２

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

		質問７
		
		public static void main(String[] args) {
        char[] input = {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};

        char[] output = trim(input);

        for (char c : output) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static char[] trim(char[] chars) {
       
        int start = 0, end = chars.length - 1;

        
        while (start <= end && chars[start] == ' ') {
            start++;
        }

       
        while (end >= start && chars[end] == ' ') {
            end--;
        }

       
        return subArray(chars, start, end - start + 1);
    }

    private static char[] subArray(char[] array, int startIndex, int length) {
        char[] subArray = new char[length];
        for (int i = 0; i < length; i++) {
            subArray[i] = array[startIndex + i];
        }
        return subArray;
    }
}

		質問８
		 public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70};

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

			質問９︓
			質問６-１を⽤い、２つ配列をマージします。
			
		    public static void main(String[] args) {
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
	
	2. 質問８を⽤い、ステップ１のマージした配列をソートする
    public static void main(String[] args) {
        int[] array1 = {3, 1, 4, 2};
        int[] array2 = {8, 6, 7, 5};

        int[] mergedArray = mergeArray(array1, array2);

        bubbleSort(mergedArray);

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

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

				

		 */