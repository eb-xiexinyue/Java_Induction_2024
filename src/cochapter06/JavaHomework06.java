package cochapter06;

public class JavaHomework06 {
public static void main(String[] args) {
	
	//質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してくださ
    //	い。
	//1 public static void main(String[] args); 
	//修飾子: public static
    //	返却型: void
   //	関数名: main
    //	引数: String[] args
	//質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼
	//び出してください。
	// 例：配列のMax値を求めるメソッド 
	//public static int max(int[] datas) { 
	// ...処理を記載 
	//} 
//	       // 示例数组
//	        int[] dataArray = {3, 7, 2, 8, 5};
//	     // 调用函数并存储结果
//
//	        int sumResult = sum(dataArray);
//	        int maxResult = max(dataArray);
//	        int minResult = min(dataArray);
//	     // 显示结果
//	        System.out.println("Sum: " + sumResult);
//	        System.out.println("Max: " + maxResult);
//	        System.out.println("Min: " + minResult);
//	    }
//          //计算数组元素之和的函数
//
//	    public static int sum(int[] datas) {
//	        int sum = 0;
//	        for (int data : datas) {
//	            sum += data;
//	        }
//	        return sum;
//	    }
//	       //最大值
//
//	    public static int max(int[] datas) {
//	        int max = datas[0];
//	        for (int data : datas) {
//	            if (data > max) {
//	                max = data;
//	            }
//	        }
//	        return max;
//	    }
//            //最小值
//	    public static int min(int[] datas) {
//	        int min = datas[0];
//	        for (int data : datas) {
//	            if (data < min) {
//	                min = data;
//	            }
//	        }
//	        return min;
	        
	      //  質問３．以下メソッドの実施結果を教えてください。
	        
	       //回答：这段代码执行后，x的值仍然是null。
	//在sayHello方法中，虽然将参数y赋值为"Hello world"，但这不会影响到x。
	//在Java中，即使在方法内改变了参数的值，也不会影响到调用该方法的变量
	//因此，System.out.println(x)将输出null。
	        
//	質問４︓以下メソッドの実施結果を教えてください。
//	public class Kicker {
//	 private static void fillArray(String[] array) {
//	 array[0] = "value2";
//	 }
//	 public static void main(String args[]) {
//	 String[] array = new String[]{"value1"};
//	 fillArray(array);
//	 System.out.println(array[0]);
//	 }
//	}   
	//回答：输出"value2"。
//	
//	質問５︓以下メソッドの実施結果を教えてください。
//	public class Kicker {
//	 private static void fillArray(String[] array) {
//	 array = new String[]{"1", "2"};
//	 }
//	 public static void main(String args[]) {
//	 String[] array = null;
//	 fillArray(array);
//	 System.out.println(array == null);
//	 }
//	}
//回答：将输出true
	
//	質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintしま
//	す。以下メソッドを呼び出してください。
//回答：
//	
//	        String[] array = {"value1", "value2", "value3"};
//	        printArray(array);
//	    }
//
//	    public static void printArray(Object[] objs) {
//	        if (objs == null) {
//	            System.out.println("null");
//	            return;
//	        }
//	        String prefix = "";
//	        StringBuilder sb = new StringBuilder();
//	        sb.append("[");
//	        for (Object obj : objs) {
//	            sb.append(prefix);
//	            sb.append(String.valueOf(obj));
//	            prefix = ", ";
//	        }
//	        sb.append("]");
//	        System.out.println(sb.toString());
//	    }
////	
//	質問６-１︓以下静的なメソッドを定義してください。
//	1. メソッド名: megerArray
//	2. 引数１︓intの配列 left
//	3. 引数２︓intの配列 right
//	4. 戻り値︓intの配列
//	5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
//	以下メソッドの実施例
//	int[] left = new int[] {1, 2, 3, 4};
//	int[] right = new int[] {5, 6, 7, 8};
//	// メソッドを実施後
//	int[] result = new int[] {1, 2, 3, 4, 5, 6, 7, 8};

	
//	        int[] left = new int[] {1, 2, 3, 4};
//	        int[] right = new int[] {5, 6, 7, 8};
//
//	        // メソッドの呼び出し
//	        int[] result = mergeArray(left, right);
//
//	        // 結果の出力
//	        printArray(result);
//	    }
//
//	    // メソッドの定義
//	    public static int[] mergeArray(int[] left, int[] right) {
//	        int leftLength = left.length;
//	        int rightLength = right.length;
//	        int[] result = new int[leftLength + rightLength];
//
//	        // leftの要素をコピー
//	        for (int i = 0; i < leftLength; i++) {
//	            result[i] = left[i];
//	        }
//
//	        // rightの要素をコピー
//	        for (int i = 0; i < rightLength; i++) {
//	            result[leftLength + i] = right[i];
//	        }
//
//	        return result;
//	    }
//
//	    // 配列を出力するメソッド
//	    public static void printArray(int[] array) {
//	        if (array == null) {
//	            System.out.println("null");
//	            return;
//	        }
//	        String prefix = "";
//	        StringBuilder sb = new StringBuilder();
//	        sb.append("[");
//	        for (int value : array) {
//	            sb.append(prefix);
//	            sb.append(value);
//	            prefix = ", ";
//	        }
//	        sb.append("]");
//	        System.out.println(sb.toString());
	    
//	
//	        質問６-２︓以下静的なメソッドを定義してください。
//	        1. メソッド名: subArray
//	        2. 引数１︓intの配列 array
//	        3. 引数２︓開始のstartIndex
//	        4. 引数３︓⻑さlength
//	        5. 戻り値︓intの配列
//	        6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
//	        以下メソッドの実施例
//	        int[] array = new int[] {1, 2, 3, 4};
//	        // start = 1, length = 2
//	        int[] result = new int[] {2, 3}


//	        int[] array = new int[] {1, 2, 3, 4};
//	        
//	        // メソッドの呼び出し
//	        int[] result = subArray(array, 1, 2);
//
//	        // 結果の出力
//	        printArray(result);
//	    }
//
//	    // メソッドの定義
//	    public static int[] subArray(int[] array, int startIndex, int length) {
//	        if (array == null || startIndex < 0 || startIndex >= array.length || length <= 0) {
//	            return new int[0]; // 空の配列を返すか、エラー処理を行うか、要件によります
//	        }
//
//	        int[] result = new int[length];
//	        for (int i = 0; i < length; i++) {
//	            if (startIndex + i < array.length) {
//	                result[i] = array[startIndex + i];
//	            } else {
//	                // 配列の範囲外にアクセスする場合、0や適切なデフォルト値を設定するか、エラー処理を行います。
//	                result[i] = 0; // ここでは0を設定していますが、要件により適切な処理を行ってください。
//	            }
//	        }
//
//	        return result;
//	    }
//
//	    // 配列を出力するメソッド
//	    public static void printArray(int[] array) {
//	        if (array == null) {
//	            System.out.println("null");
//	            return;
//	        }
//	        String prefix = "";
//	        StringBuilder sb = new StringBuilder();
//	        sb.append("[");
//	        for (int value : array) {
//	            sb.append(prefix);
//	            sb.append(value);
//	            prefix = ", ";
//	        }
//	        sb.append("]");
//	        System.out.println(sb.toString());
//	    
//	質問７︓以下静的なメソッドを定義してください。
//	1. メソッド名︓trim
//	2. 引数１︓charの配列
//	3. 戻り値︓charの配列
//	4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
//	以下メソッドの実施例︓
//	char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; // 入力引数
//	// メソッドを実施後
//	char[] output = new char[] {'A', 'b', ' ', ' ', 'C'}; // 入力引数
//	
	
	        char[] inputArray = {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};

	        // メソッドの呼び出し
	        char[] output = trim(inputArray);

	        // 結果の出力
	        printCharArray(output);
	    }

	    // メソッドの定義
	    public static char[] trim(char[] inputArray) {
	        if (inputArray == null) {
	            return new char[0]; // 空の配列を返すか、エラー処理を行うか、要件によります
	        }

	        int startIndex = 0;
	        int endIndex = inputArray.length - 1;

	        // 開始位置の計算
	        while (startIndex < inputArray.length && inputArray[startIndex] == ' ') {
	            startIndex++;
	        }

	        // 終了位置の計算
	        while (endIndex >= 0 && inputArray[endIndex] == ' ') {
	            endIndex--;
	        }

	        // 起点と終点を引数として、サブ配列メソッドを呼び出して結果を求める
	        return subArray(inputArray, startIndex, endIndex - startIndex + 1);
	    }

	    // char配列を出力するメソッド
	    public static void printCharArray(char[] array) {
	        if (array == null) {
	            System.out.println("null");
	            return;
	        }
	        StringBuilder sb = new StringBuilder();
	        for (char value : array) {
	            sb.append(value);
	        }
	        System.out.println(sb.toString());
	    }

	    // サブ配列を取得するメソッド（質問６-２のメソッドを再利用）
	    public static char[] subArray(char[] array, int startIndex, int length) {
	        if (array == null || startIndex < 0 || startIndex >= array.length || length <= 0) {
	            return new char[0]; // 空の配列を返すか、エラー処理を行うか、要件によります
	        }

	        char[] result = new char[length];
	        for (int i = 0; i < length; i++) {
	            if (startIndex + i < array.length) {
	                result[i] = array[startIndex + i];
	            } else {
	                // 配列の範囲外にアクセスする場合、0や適切なデフォルト値を設定するか、エラー処理を行います。
	                result[i] = 0; // ここでは0を設定していますが、要件により適切な処理を行ってください。
	                break; // もし範囲外になったら抜ける
	            }
	        }

	        return result;
	    



	
	
	
	        
	    
	    }
	
}
