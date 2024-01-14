package co.jp.chapter06;

public class JavaChapter06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		checkNum(2);
		
		int sum = sum(3,4,7);
		System.out.println(sum);
		
		System.out.println(sumOverload(3,4));
		System.out.println(sumOverload("3","7"));
		System.out.println(sumOverload("3","7","10"));
	}

	static int sumOverload(int a, int b) {
		return a+b;
	}
	static int sumOverload(String a, String b) {
		return Integer.valueOf(a) + Integer.valueOf(b);
	}
	static int sumOverload(int d, int c, int e) {
		return d+c+e;
	}
	static int sumOverload(String d, String c, String e) {
		return Integer.valueOf(d) + Integer.valueOf(c)+Integer.valueOf(e);
	}
	
	
	private static void checkNum(int a) {
		// TODO 自動生成されたメソッド・スタブ
		if(a<10) {
			return;
			
		}else {
			System.out.println("a>=10");
		}
			
	}

	static int sum (int a,int b,int c) {
		return a+b+c;
	}
	
}
