package co.jp.chapter06;

import java.util.Arrays;

public class JavaChapter06 {
	
	//全局变量
	static int a = 35;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		checkNum(15);
		
		int sum = sum(2,3);
		
		int[] arr = new int[3];
		
		System.out.println(Arrays.toString(arr));
		
		//System.out.println("全局变量a："+a);
				
//		System.out.println("sum関数の戻り値は　"+sum);
//		
//		System.out.println("out10関数の戻り値は　"+out10());
//		
//		System.out.println("combine関数の戻り値は　\n"+combine("文字列",36,'S'));
		
//		test("java","is","important","!");
//		
//		System.out.println("------------------------------");
//		
//		String[] strArr = {"java","is","important","!"};
//		
//		test1(strArr);
		
//		System.out.println(sumOverload(3,7));
//		
//		System.out.println(sumOverload("3","7"));
//		
//		System.out.println(sumOverload("3","7","10"));
		
		//count(10);
		
		fact(5, 5);
	}
		
	static int count(int in) {
		System.out.println(in);
		if(in<0) {
			return 0;
		}
		return count(in-1);
	}
	
	static int fact(int n, int res) {
		System.out.println("current n:"+n+", current res:"+res);
		if(n==0)
			return 1;
		else 	
			return fact(n-1, res*(n-1));
	}
	
	//a=1,b=2    return 3
	static int sumOverload(int a, int b) {
		System.out.println("sumOverload(int a, int b)函数中的局部变量a:"+a);
		//System.out.println("sumOverload(int a, int b)中的全局变量a:"+a);
		return a+b;
	}
	
	//a="1",b="2"  return 3
	static int sumOverload(String a, String b) {
		return Integer.valueOf(a) + Integer.valueOf(b);
	}
	
	static int sumOverload(String a, String b, String e) {
		return Integer.valueOf(a) + Integer.valueOf(b) + Integer.valueOf(e);
	}
	
	static int sumOverload(int d, int c, int e) {
		return d+c+e;
	}
	
	static void checkNum(int a) {
		if(a<10) {
			return;
		}
		else {
			System.out.println("a>=10");
		}	
	}
	
	static int sum(int a, int b) {
		return a+b;
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
	
	static void test(String...strs) {
		for(String subStr : strs) {
			System.out.println(subStr);
		}
	}
	
	static void test1(String[] strs) {
		for(String subStr : strs) {
			System.out.println(subStr);
		}
	}

}
