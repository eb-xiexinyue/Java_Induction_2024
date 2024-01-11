package co.jp.chapter07;

public class JavaHomeWork07 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6};
		max(a);
		min(a);
		average(a);
		// TODO 自動生成されたメソッド・スタブ
//		質問１
//		問題は12行から13行のところで、Petの方法を使って setAge するつもりですが、Petの
//		方法では　setName しか出来ないことです。
		

	}

//	質問２
//public class Math{
	
	
		//最大値
	public static int max(int [] arr) {
		if(arr.length == 0) {
			System.out.println("配列は空です");
		}
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("最大値："+max);
		return max;
		
	}
	
	//最小値
	public static int min(int [] arr) {
		if(arr.length == 0) {
			System.out.println("配列は空です");
		}
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("最小値："+min);
		return min;
	}
	
	//平均値
	public static void average(int [] arr) {
		if(arr.length == 0) {
			System.out.println("配列は空です");
		}
		double sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("平均値：" + sum/arr.length);
		
	}
	
}

