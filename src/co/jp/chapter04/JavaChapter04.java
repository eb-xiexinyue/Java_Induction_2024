package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {

	     int[] array = {1, 2, 6, 7, 9, 6, 2, 1};

        // 最大値、最小値、和、平均値を初期化
        int max = array[0];
        int min = array[0];
        int sum = 0;
        double average;

        // 配列を走査して最大値、最小値、和を計算
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            sum += array[i];
        }

        // 平均値を計算
        average = (double) sum / array.length;

        // 結果を表示
        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);
        System.out.println("和: " + sum);
        System.out.println("平均値: " + average);	
		
		
		
		
		
//       int[][] array = new int[2][3];
//       System.out.println(Arrays.toString(array));
//		//		int[] arr = {123,543,68,581,99,67,56};
////		for(int i=0;i<arr.length;i++) {
////			System.out.println(arr[i]);		
////		
//		int[] raw_array= {12,54,68,81,99,67,56};
//		System.out.println(Arrays.toString(raw_array));
//		
//		for(int i=0;i<raw_array.length;i++) {
//			for(int j=0;j<raw_array.length;j++) {
//				if(i!=j) {
//					if(raw_array[i]<raw_array[j]) {
//						int temp = raw_array[j];
//						raw_array[j] = raw_array[i];
//						raw_array[i] = temp;
//					}
//				}
//			}
//		}
//
//		System.out.println(Arrays.toString(raw_array));
		
	}

}
