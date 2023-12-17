package co.jp.chapter06;

public class JavaChapter06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
System.out.println(sumOverload(3,7));
		
		System.out.println(sumOverload("3","7"));
		
		System.out.println(sumOverload("3","7","10"));
	}
	
	//a=1,b=2    return 3
	static int sumOverload(int a, int b) {
		return a+b;
	}	
	
	//a="1",b="2"  return 3
	static int sumOverload(String a, String b) {
		return Integer.valueOf(a) + Integer.valueOf(b);
	}
	
	static int sumOverload(int d, int c, int e) {
		return d+c+e;
	}
	static int sumOverload(String d, String c, String e) {
		return Integer.valueOf(d) + Integer.valueOf(c) + Integer.valueOf(e);
	}
	}


