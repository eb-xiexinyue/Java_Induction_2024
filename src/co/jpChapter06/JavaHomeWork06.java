package co.jpChapter06;

public class JavaHomeWork06 {
	
	  public static void main(String[] args) {
		  
		//質問２ 
		  int[] array = {3, 1, 8, 1, 6};

	        // 配列の最大値を求める
	        int maxVal = max(array);
	        System.out.println("Max: " + maxVal);

	        // 配列の最小値を求める
	        int minVal = min(array);
	        System.out.println("Min: " + minVal);

	        // 配列の和を求める
	        int sumVal = sum(array);
	        System.out.println("Sum: " + sumVal);
	       
	     //質問６-０
	        Integer[] integerArray = {1, 2, 3, 4, 5};
	        printArray(integerArray);
	    
	     //質問６-１
	        mergeAndPrint();
	        System.out.println(); 
	        
	     //質問６-２
	        int[] array1 = new int[] {1, 2, 3, 4};
	        int[] result = subArray(array1, 1, 2);
	        System.out.print("Result: ");
	        for (int num : result) {
	        System.out.print(num + " ");
	        }
	        System.out.println(); 
	    
	     // 質問７
	        char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
	        char[] output = trim(input);
	        System.out.print("Output: ");
	        for (char c : output) {
	            System.out.print(c + " ");
	        }
	        System.out.println();

	        // 質問８
	        int[] array2 = {32, 53, 68, 72, 88, 93, 25};
	        int[] sortedArray = bubbleSort(array2);
	        System.out.println("Sorted array:");
	        for (int num : sortedArray) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	        
	        //質問9
	        mergeAndSort();
	        }
	    
      

        //質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
        //public static void main(String[] args);
		//答え：修飾⼦はpublic static、返却型はvoid、関数名はmain、引数はString[] argsで、
		//引数の型はString[]で、名称は argsである。
		
		//質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
		// 例：配列のMax値を求めるメソッド
		//public static int max(int[] datas) {
		// ...処理を記載
		//	}
	    //答え：
		   public static int max(int[] datas) {
		        int max = datas[0];
		        for (int i = 1; i < datas.length; i++) {
		            if (datas[i] > max) {
		                max = datas[i];
		            }
		        }
		        return max;
		    }

		    // 配列の最小値を求めるメソッド
		    public static int min(int[] datas) {
		        int min = datas[0];
		        for (int i = 1; i < datas.length; i++) {
		            if (datas[i] < min) {
		                min = datas[i];
		            }
		        }
		        return min;
		    }

		    // 配列の和を求めるメソッド
		    public static int sum(int[] datas) {
		        int sum = 0;
		        for (int data : datas) {
		            sum += data;
		        }
		        return sum;
		    }

		  
		    
		 //質問３．以下メソッドの実施結果を教えてください。
		 // public class Kicker {
		 // private static void sayHello(String y) {
		 // y = "Hello world";
		 //}
		 // public static void main(String args[]) {
		 //String x = null;
		 //sayHello(x);
		 //System.out.println(x);
         //}
         //}
		 //答え：null
		    
		 //質問４︓以下メソッドの実施結果を教えてください。
		 //public class Kicker {
		 //private static void fillArray(String[] array) {
		 // array[0] = "value2";
		 // }
		 // public static void main(String args[]) {
		 // String[] array = new String[]{"value1"};
		 // fillArray(array);
		 // System.out.println(array[0]);
		 // }
		 //}
		 //答え：value2
		    
		 //質問５︓以下メソッドの実施結果を教えてください。
		 //public class Kicker {
		 // private static void fillArray(String[] array) {
		 //array = new String[]{"1", "2"};
		 //}
		 // public static void main(String args[]) {
		 //String[] array = null;
		 // fillArray(array);
		 //System.out.println(array == null);
		 // }
		 //}
		 //答え：true
		    
		 //質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintします。
		 //以下メソッドを呼び出してください。
		    	
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
		 //質問６-１︓以下静的なメソッドを定義してください。
		 //1. メソッド名: megerArray
		 //2. 引数１︓intの配列 left
		 //3. 引数２︓intの配列 right
		 //4. 戻り値︓intの配列
		 //5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
		 //以下メソッドの実施例︓
		 //int[] left = new int[] {1, 2, 3, 4};
		 //int[] right = new int[] {5, 6, 7, 8};
		 // メソッドを実施後
		 //int[] result = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
		    	public static void mergeAndPrint() {
		            int[] left = new int[] {1, 2, 3, 4};
		            int[] right = new int[] {5, 6, 7, 8};
                    int[] mergedArray = mergeArray(left, right);
                   
                    System.out.print("Merged Array: ");
                    for (int num : mergedArray) {
                        System.out.print(num + " ");
                    }
                }
		    	public static int[] mergeArray(int[] left, int[] right) {
		            int[] result = new int[left.length + right.length];

		            int leftIndex = 0;
		            int rightIndex = 0;
		            int resultIndex = 0;

		            while (leftIndex < left.length && rightIndex < right.length) {
		                if (left[leftIndex] < right[rightIndex]) {
		                    result[resultIndex] = left[leftIndex];
		                    leftIndex++;
		                } else {
		                    result[resultIndex] = right[rightIndex];
		                    rightIndex++;
		                }
		                resultIndex++;
		            }

		            while (leftIndex < left.length) {
		                result[resultIndex] = left[leftIndex];
		                leftIndex++;
		                resultIndex++;
		            }

		            while (rightIndex < right.length) {
		                result[resultIndex] = right[rightIndex];
		                rightIndex++;
		                resultIndex++;
		            }

		            return result;
		        }
		 //質問６-２︓以下静的なメソッドを定義してください。
		 //1. メソッド名: subArray
		 //2. 引数１︓intの配列 array
		 //3. 引数２︓開始のstartIndex
		 //4. 引数３︓⻑さlength
		 //5. 戻り値︓intの配列
		 //6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
		 //int[] array = new int[] {1, 2, 3, 4};
		 // start = 1, length = 2
		 //int[] result = new int[] {2, 3}
		    public static int[] subArray(int[] array1, int startIndex, int length) {
		    int[] result = new int[length];
		    for (int i = 0; i < length; i++) {
		    result[i] = array1[startIndex + i];
		      }
		    return result;
		     }
		 //質問７︓以下静的なメソッドを定義してください。
		 //1. メソッド名︓trim
		 //2. 引数１︓charの配列
		 //3. 戻り値︓charの配列
		 //4. 処理内容︓引数１のcharの配列先頭と末尾の空白文字列を削除してください。
		 //以下メソッドの実施例︓
		 //char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; // 入力引数
		 // メソッドを実施後
		 //char[] output = new char[] {'A', 'b', ' ', ' ', 'C'}; // 入力引数
		    public static char[] trim(char[] input) {
		        int startIndex = 0;
		        while (startIndex < input.length && input[startIndex] == ' ') {
		            startIndex++;
		        }
		        int endIndex = input.length - 1;
		        while (endIndex >= 0 && input[endIndex] == ' ') {
		            endIndex--;
		        }

		        char[] result = new char[endIndex - startIndex + 1];
		        for (int i = startIndex; i <= endIndex; i++) {
		            result[i - startIndex] = input[i];
		        }

		        return result;
		    }
		    
			 //質問８︓バブルソート⽤メソッドを作成してください。
		     //1. メソッド名︓bubbleSort
			 //2. 引数１︓intの配列
			 //3. 戻り値︓ソート済みの配列
			 //4. 処理内容︓bubbleSortアルゴリズムを用い、入力した引数の配列をソートしてください。
			    	 public static int[] bubbleSort(int[] array2) {
			    	 int n = array2.length;
			    	 for (int i = 0; i < n-1; i++) {
			             for (int j = 0; j < n-i-1; j++) {
			                 if (array2[j] > array2[j+1]) {
			                	 int temp = array2[j];
			                     array2[j] = array2[j+1];
			                     array2[j+1] = temp;
			                 }
			             }
			         }
			         return array2;
			    	 }
			    	 
			 //質問９
			    	 public static void mergeAndSort() {
			    		    int[] left = new int[] {2, 4, 11, 5};
			    		    int[] right = new int[] {0, 9, 1, 3};
			    		    
			    		    int[] mergedArray = mergeArray(left, right);
			    		    int[] sortedArray = bubbleSort(mergedArray);
			    		    
			    		    System.out.print("Sorted Merged Array: ");
			    		    for (int num : sortedArray) {
			    		        System.out.print(num + " ");
			    		    }
			    		}

			    	 public static int[] bubbleSort1(int[] array) {
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
			    		    return array;
			    		}
	}



		    

