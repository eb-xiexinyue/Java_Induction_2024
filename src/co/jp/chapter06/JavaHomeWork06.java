package co.jp.chapter06;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//	第５回の第8問：LV10のパスカルの三角形を出力してください。	
		int t[][]=new int[10][];
			for(int a=0;a<t.length;a++) {
				t[a]=new int[a+1];
				for(int b=0;b<=a;b++) {
					if(a==0||b==0||b==a) {
						t[a][b]=1;
					}else {
						t[a][b]=t[a-1][b]+t[a-1][b-1];
					}
					System.out.print(t[a][b]+"\t");
				}
					System.out.println();
			}
	}
	
//	第6回
//	質問１．以下関数の修飾子、返却型、関数名、引数（引数の型・名称）を回答してください。
//public static void main(String[] args);
//回答：関数の修飾子: public, static
//		返却型: void
//		関数名: main
//		引数名： args , 引数の型： String[]
			
			
//　質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。		
//例：配列のMax値を求めるメソッド
//public static int max(int[] datas) {
// ...処理を記載
//}	
     // 配列の和を求める
    public static int sum(int[] datas) {
        int sum = 0;
        for (int num : datas) {
            sum += num;
        }
        return sum;
    }


    // 配列の最大値を求める
    public static int max1(int[] arr) {
		 int max = arr[0];
		 for (int i = 1; i < arr.length; i++) {
		     if (arr[i] > max) {
		           max = arr[i];
		     }
		 }
		   return max;
	}
   // 配列の最小値を求める
	public static int min1(int[] arr) {
		   int min = arr[0];
		    for (int i = 1; i < arr.length; i++) {
		         if (arr[i] < min) {
		            min = arr[i];
		         }
		     }
		        return min;
		    }
    		
			
//	質問３．以下メソッドの実施結果を教えてください。
//		public class Kicker {
//		private static void sayHello(String y) {
//			y = "Hello world";
//		}
//		public static void main(String args[]) {
//			String x = null;
//			sayHello(x);
//			System.out.println(x);
//		}
//	}
//回答：null	
		
//	質問４︓以下メソッドの実施結果を教えてください。
//		public class Kicker {
//			private static void fillArray(String[] array) {
//				array[0] = "value2";
//			}
//			public static void main(String args[]) {
//				String[] array = new String[]{"value1"};
//				fillArray(array);
//				System.out.println(array[0]);
//			}
//		}
//回答：value2		
		
//	質問５︓以下メソッドの実施結果を教えてください。
//		public class Kicker {
//			private static void fillArray(String[] array) {
//				array = new String[]{"1", "2"};
//}
//			public static void main(String args[]) {
//				String[] array = null;
//				fillArray(array);
//				System.out.println(array == null);
//			}
//		}
//回答：true	
		
//	質問６-０︓配列は直接に印刷できません。下記メソッドを利用して、配列をprintします。以下メソッドを呼び出してください。	
	public class ArrayPrinter {
		public static void main(String[] args) {
       
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
		}		

		

//質問６-１︓以下静的なメソッドを定義してください。
//1. メソッド名: megerArray
//2. 引数１︓intの配列 left
//3. 引数２︓intの配列 right
//4. 戻り値︓intの配列
//5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
		public static void main1(String[] args) {
       
	        int[] left = {1, 2, 3, 4};
	        int[] right = {5, 6, 7, 8};
	
	        int[] result = mergeArray(left, right);
	
	        printArray1(result);
		}
			
    public static int[] mergeArray(int[] left, int[] right) {
        int leftLength = left.length;
        int rightLength = right.length;
        int resultLength = leftLength + rightLength;

        int[] result = new int[resultLength];

        
        System.arraycopy(left, 0, result, 0, leftLength);

       
        System.arraycopy(right, 0, result, leftLength, rightLength);

        return result;
    }

   
    public static void printArray1(int[] arr) {
        if (arr == null) {
            System.out.println("null");
            return;
        }
        String prefix = "";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int num : arr) {
            sb.append(prefix);
            sb.append(num);
            prefix = ", ";
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
		
		
//質問６-２︓以下静的なメソッドを定義してください。
//1. メソッド名: subArray
//2. 引数１︓intの配列 array
//3. 引数２︓開始のstartIndex
//4. 引数３︓⻑さlength
//5. 戻り値︓intの配列
//6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する	
	public static void main2(String[] args) {
    int[] array = {1, 2, 3, 4};
        int start = 1;
        int length = 2;

        int[] result = subArray(array, start, length);

        printArray(result);
	}

    public static int[] subArray(int[] array, int startIndex, int length) {
        // 開始位置が負の場合、またはlengthが0以下の場合は空の配列を返す
        if (startIndex < 0 || length <= 0) {
            return new int[0];
        }

        // 開始位置が配列の長さを超える場合は、開始位置を配列の最後に設定
        if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }

        // 実際のコピーする長さを計算
        int actualLength = Math.min(length, array.length - startIndex);

        // サブ配列を取得
        int[] result = new int[actualLength];
        System.arraycopy(array, startIndex, result, 0, actualLength);

        return result;
    }

    // 配列を出力するメソッド
    public static void printArray(int[] arr) {
        if (arr == null) {
            System.out.println("null");
            return;
        }
        String prefix = "";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int num : arr) {
            sb.append(prefix);
            sb.append(num);
            prefix = ", ";
        }
        sb.append("]");
        System.out.println(sb.toString());	
    }
		
//	質問７︓以下静的なメソッドを定義してください
//1. メソッド名︓trim
//2. 引数１︓charの配列
//3. 戻り値︓charの配列
//4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
//以下メソッドの実施例︓
		char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; // 入力引数
		// メソッドを実施後
		char[] output = new char[] {'A', 'b', ' ', ' ', 'C'}; // 入力引数		
//不太懂,我再想想
		
//	質問８︓バブルソート⽤メソッドを作成してください。
//1. メソッド名︓bubbleSort
//2. 引数１︓intの配列
//3. 戻り値︓ソート済みの配列
//4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてくださ
//い。
//不太懂,我再想想		
		
		
		
		
		
//質問９︓メソッドの呼び出す練習。
//1. 質問６-１を⽤い、２つ配列をマージします。
//2. 質問８を⽤い、ステップ１のマージした配列をソートする。
//3. 注意︓コードを１⾏にしてください。	
//不太懂,我再想想		
		
		
		
			
	}

}
