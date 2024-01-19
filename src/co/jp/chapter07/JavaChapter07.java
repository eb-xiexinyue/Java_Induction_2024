package co.jp.chapter07;

public class JavaChapter07 {
	
	public static int i=8;
	
	public static int count() {
		System.out.println("revoke in count, i is:"+i);
		return 0;
	}

	public static void main(String... args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("i is :"+i);
		count();
		
		Animal animal = new Animal("puppy");
		System.out.println(animal.getName());
		
//		Dummy dummy = new Dummy();
//		
//		dummy.print();
//		
//		Dummy.staticPrint();
		
//		System.out.println("n(dummy) in instance is :"+dummy.n);
//		
//		dummy.n ++;
//		
//		System.out.println("n(dummy) in instance is :"+dummy.n);
//		
//		Dummy dummy1 = new Dummy();
//		
//		System.out.println("n(dummy1) in instance is :"+dummy1.n);
//		
//		System.out.println("i(dummy1) in instance is :"+dummy1.i);
//		
//		dummy1.i ++;
//		
//		System.out.println("n(dummy) in instance is :"+dummy.n);
//		
//		System.out.println("i(dummy) in instance is :"+dummy.i);
		
		//コンストラクタ
//		Dummy dummy = new Dummy();
//		
//		System.out.println("n in instance is :"+dummy.n);
//		System.out.println("m in instance is :"+dummy.m);
//		System.out.println("final_n in instance is :"+dummy.final_n);
		
		//getter, setter
		Dummy dummy = new Dummy();
		System.out.println(dummy.public_n);
		System.out.println(dummy.protected_n);
		System.out.println(dummy.default_n);
	}

}

