package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
//問題１︓int[] array = new int[4]; 各要素の値を記載してください。
//回答：array[0] = 0;
//		array[1] = 0;
//		array[2] = 0;
//		array[3] = 0;		
	
//問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
//回答：array[0] = 5;
//		array[1] = 6;		
		
//問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
//回答：array[0][0] = 0;
//		array[0][1] = 0;
//		array[0][2] = 0;
//		array[1][0] = 0;
//		array[1][1] = 0;
//		array[1][2] = 0;	
		
//問題４︓以下２重Foreachを理解してください。
//	int[][] array2d = new int[4][2];
//	for (int[] out : array2d) {
//	for (int inner : out) {
//	System.out.println(inner);
//	}
//}		
//回答：for (int[] out : array2d)は、array2dの各行に対して拡張for文を実行する。outは各行を表す一次元の配列だ。
//		for (int inner : out)は、内側の拡張for文で、各行"out"内の各要素に対して拡張for文を実行する。innerは各要素の値を表示する。
								
		
//問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最大値と最小桁値をSystem.out.println()。
//		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
//		
//		int max = array[0];
//		int min = array[0];
//
//		for (int i = 1; i < array.length; i++) {
//			if (array[i] > max) {
//				max = array[i];
//			}
//			if (array[i] < min) {
//				min = array[i];
//			}
//		}
//
//		System.out.println("最大値: " + max);
//		System.out.println("最小値: " + min);
		
//回答：最大値: 100　
//		最小値: 0
//
//問題６︓問題１の配列のSUMを求める。
//		int[] array = new int[4] ; 
//
//		int sum = 0; 
//
//		for (int i = 0; i < array.length; i++) {
//			sum += array[i];
//		}
//
//		System.out.println("SUM: " + sum);
//回答：SUM: 0


//問題７︓行列（２次元配列）の和と積を計算してください。		
		int[][] multi_array ={
				{2},
				{2,3},
				{2,3,5},
				{2,3,5,6}
		};
		
		 int sum = 0;
        for (int i = 0; i < multi_array.length; i++) {
            for (int j = 0; j < multi_array[i].length; j++) {
                sum += multi_array[i][j];
            }
        }
		System.out.println("和: " + sum);//和: 33
		
		int product = 1;
        for (int i = 0; i < multi_array.length; i++) {
            for (int j = 0; j < multi_array[i].length; j++) {
                product *= multi_array[i][j];
            }
        }
        System.out.println("積: " + product);//積: 64800
		
	}
}