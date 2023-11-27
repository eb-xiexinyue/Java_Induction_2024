package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//	質問1
//		
//	
//		int a = 56;
//		System.out.println("成績ランキング判断。入力値=" + a);
//		// 以下コードを完成してください。
//		if(a>90) {
//		System.out.println("A");
//		} else if(a>80) {
//		System.out.println("B");
//		} else if(a>70) {
//		System.out.println("C");
//		} else if(a>60) {
//		System.out.println("D");
//		} else {
//		System.out.println("E");
//		}
//		
		

		int a=3340;
		int b=500;
		int c =a % b;
		int d=a-c;
		int e=d/b;
		System.out.println("500円玉枚数"+e);
		int f=100;
		int g=c/f;
		System.out.println("100円玉枚数"+g);
		int i=10;
		int h=c%f;
		int j=h/i;
		System.out.println("10円玉枚数"+j);
		int k=e+g+j;
		System.out.println("コイン枚数"+k);


}}