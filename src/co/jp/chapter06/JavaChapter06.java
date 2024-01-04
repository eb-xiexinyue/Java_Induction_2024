package co.jp.chapter06;

public class JavaChapter06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		checkNum(30);
		
		int sum = sum(2,3);
		
		System.out.println(sum);
		
		System.out.println(out10());
		
		System.out.println(combine("文字列",36,'S'));
		
		System.out.println(sumOverload("3","7","10"));
		
		System.out.println("-------------------------");
		
		count(10);
		
		fact(5);
		
		System.out.println(fact(5));//直接输出结果
	
	}
	
	static int fact(int n) {

//		System.out.println(n); //每一步的n的值打印出来
		if(n==0)
			return 1;
		else
			return fact(n-1)*n;
					
	}
	
	
	static int count(int in) {
		System.out.println(in);
		if(in<1) {
			return 0;
		}
		return count(in-1);
	}
	
	static int sumOverload(String a, String b, String c) {
		return Integer.valueOf(a) + Integer.valueOf(b)+ Integer.valueOf(c);
		
	}
	
	
	static int sum(int i, int j) {
		// TODO 自動生成されたメソッド・スタブ
		return i+j;
	}

	static void checkNum(int a) {
		if(a<10) {
			return;
		}
		else {
			System.out.println("a>=10");
		}
	}
	
	static int out10() {
		return 10;
	}
	
	static String combine(String str, int num, char chr) {
		
		String outStr = "string value is "+str+"\n";
		
		outStr += "int value is "+num+"\n";
		outStr += "char value is "+chr+"\n";
		
		
		return outStr;
		
	}

}
