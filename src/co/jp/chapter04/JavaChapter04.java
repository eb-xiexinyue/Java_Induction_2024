package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		int[][] array = new int[5][3];
	/*	array[0] = new int[] {1, 2, 3, 4, 5};
		array[1] = new int[] {1, 2, 3, 4};
		array[2] = new int[] {1, 2, 3, 4, 5};
		array[3] = new int[] {1, 2, 3, 4, 5};
*/
		// 2次元配列の内容を出力する
		for (int i = 0; i < array.length; i++) {
		    for (int j = 0; j < array[i].length; j++) {
		        System.out.print(array[i][j] + " ");
		    }
		    System.out.println(); // 改行
		}

		
}
	}



