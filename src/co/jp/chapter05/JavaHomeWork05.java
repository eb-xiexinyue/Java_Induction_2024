package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
//設問１︓1から100までの偶数の和を求める(for + if)。
//		int sum = 0;
//
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//
//        System.out.println("1から100までの偶数の和: " + sum);
//回答：1から100までの偶数の和: 2550
	

//設問２︓5の階乗を求める(for)。
//        int a = 5;
//        long b = 1; 
//
//        for (int i = 1; i <= a; i++) {
//            b*= i;
//        }
//
//        System.out.println(a + "の階乗は: " + b);
//回答：5の階乗は: 120
//
//
//質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
			int max=array[0];
			int min=array[0];
			int sum = 0;
     		double average;
		
		for (int i = 0; i < array.length; i++) {
         if (array[i] > max) {
				max = array[i];
          }
          if (array[i] < min) {
           	min = array[i];
         		}
           sum += array[i];
        }

		average = (double) sum / array.length;
		
		System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);
        System.out.println("和: " + sum);
        System.out.println("平均値: " + average);
		
//回答：最大値: 9
//		最小値: 1
//		和: 34
//		平均値: 4.25		
		
		
//質問４︓質問３の配列に重複ある要素を探す（要素の表示次数集計必要なし）。
	
		
//
//
//
//質問５︓質問３の配列に値「７」のインデックスを求む。
		int r_array = 7;

    
        int x = findIndex(array, r_array);

        if (x != -1) {
            System.out.println("値 " + r_array + " は配列のインデックス " + x + " にある。");
        } else {
            System.out.println("値 " + r_array + " は配列内に見つかない。");
        }
    }
		public static int findIndex(int[] array, int r_array) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == r_array) {
					return i; 
            }
        }
					return -1; 
//回答：値 7 は配列のインデックス 3 にある。


//質問６︓任意行列（２次元配列）の積を求める。
//
//
//
//
//
//質問７︓配列を昇順でソートする（java.util等メソッド利用禁止）。
//
//
//
//
//
//
//質問８︓LV10のパスカルの三角形を出力してください。		
//		
//		
//		
//		
//		
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
