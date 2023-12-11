package co.jp.chapter04;

public class JavaHomeWork04 {

/*	04 配列の問題
 
    問題１︓int[] array = new int[4]; 各要素の値を記載してください。
	array[0] = 0;
	array[1] = 0;
	array[2] = 0;
	array[3] = 0;
	
	
	問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
	array[0] = 5;
	array[1] = 6;
	
	
	問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
	array[0][0] = 0;
	array[0][1] = 0;
	array[0][2] = 0;
	
	array[1][0] = 0;
	array[1][1] = 0;
	array[1][2] = 0;
	
	
	問題４︓以下２重Foreachを理解してください。
	int[][] array2d = new int[4][2];
	array2dは、4行2列の次元配列が作成される。
	
	for (int[] out : array2d) {
    forループを使用して、array2dの各行をoutとして取り出す。
    
	 for (int inner : out) {
	forループを使用して、outの各行要素をinnerとして取り出す。
	
	 System.out.println(inner);
	各要素innerを出力する。
	 }
	 }

	
	問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値を
	System.out.println()。
	
	最大値を求める
	int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 
	int max = array[0];
	for(int i = 1; i < array.length; i++){
	 if(array[i] max> ){
	  max = array[i]
	 }
	}
	
	最小値を求める
	int min = array[0];
	for(int i = 1; i < array.length; i++){
	 if (array[i] < min){
	  min = array[i]
	 }
	}
	
	
	問題６︓問題１の配列のSUMを求める。
    int[] array = new int[4];
    array[0] = 1;
	array[1] = 2;
	array[2] = 3;
	array[3] = 4;
	
	和を求める
	int sum = 0;
	for(int i = 0; i < array.length; i++){
	 sum += array[i];
	}
	System.out.println(sum);
	
 
	問題7︓行列（２次元配列）の和と積を計算してください。
    public static void main(String[] args) {
	int[][] array2d = {{1, 2, 3}, {4, 5, 6}};

	2次元配列の和を計算
    int sum = calculateSum(array2d);

	結果を出力
    System.out.println("2次元配列の要素の和: " + sum);
	    }

	2次元配列の要素の和を計算するメソッド
	private static int calculateSum(int[][] array) {
	int sum = 0;
	for(int i = 0; i < array.length; i++) {
	  for(int j = 0; j < array[i].length; j++) {
	     sum += array[i][j];
	   }
	  }
	  return sum;
}
   積の求めは分かりません
*/
	
	
/*  05 新米の問題
	
	設問１︓1から100までの偶数の和を求める(for + if)。
	public static void main(String [] args){
	 int sum = 0;
	 
	 for (int i = 1; i <=100; i++)
	  if (i % 2 == 0){
	  sum += i  
	  }
	}
	System.out.println("1から100までの偶数の和は"　+ sum);
	
	
	
	設問２︓5の階乗を求める(for)。
	public static void main(String [] args){
	int number = 5;
	long factorial = 1;
	
	for (int i = 1; i <= number; i++){
	factirial *=i;
	 }
	}
	System.out.println(number + "の階乗は" + factorial);
	
	
	設問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
	public static void main(String [] args){
	int [] array ={1, 2, 6, 7, 9, 6, 2, 1};
	
	最大値を求める
	int max = 0;
	for(int i =1; i < array.length; i++){
	  if(array[i] > max){
	  max = array[i]
	  }
	}
	
	最小値を求める
	int min = 0;
	for(int i = 1; i < array.length; i++){
	 if(array[i] < min){
	 min = array[i];
	 }
	}
	
	和を求める
	int sum = 0;
	for(int i = 0; i <array.length; i++){
	 sum += array[i];
	}
	
	平均値を求める
	double average = (double) sum / array.length;
	
	System.out.println("配列の最大値は" + max);
	System.out.println("配列の最小値は" + min);
	System.out.println("配列の和は" + sum);
	System.out.println("配列の平均値は" + average);
	}
	
	
	設問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
	public static void main(String[] args) {
	int[] array = {1, 2, 6, 7, 9, 6, 2, 1};

	for(int i = 0; i < array.length; i++) {
	 for(int j = i + 1; j < array.length; j++) {
	  if(array[i] == array[j]) {
	  
	  System.out.println("重複した要素は " + array[i]);
	    }
	   }
	  }
	 }
	
	
	設問５︓質問３の配列に値「７」のインデックスを求む。
	public static void main(String[] args) {
    int[] array = {1, 2, 6, 7, 9, 6, 2, 1};

    int targetValue = 7;
    int index = -1; 

    for(int i = 0; i < array.length; i++) {
     if(array[i] == targetValue) {
        index = i;
        break; 
       }
    }
	
	if(index != -1){
	  System.out.println(targetValue + "のインデックスは" + index);
	}else{
	  System.out.println(targetValue + "は配列に存在しません");
	 }
	}
	
	
	設問６︓任意⾏列（２次元配列）の積を求める。
	分かりません
	
	設問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
	分かりません
	
	設問８︓LV10のパスカルの三⾓形を出⼒してください。
	分かりません
	
	分からない問題に関しては、ネットを検索し解決して、理解していきます。

*/
}
