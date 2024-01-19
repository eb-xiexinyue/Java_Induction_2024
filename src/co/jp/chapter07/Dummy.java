package co.jp.chapter07;

public class Dummy {
	
	public int public_n = 1;
	
	protected int protected_n = 2;
	
	private int private_n = 3;
	
	public int getPrivate_n() {
		return private_n;
	}

	public void setPrivate_n(int private_n) {
		this.private_n = private_n;
	}

	int default_n = 4;
	
//	public int m = 0;
//	
//	public final int final_n;
//			
//	public static int i = 0;

//	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
//
//	}
	public void print() {
		System.out.println("hello from Dummy");
	}
	
	public static void staticPrint() {
		System.out.println("static hello from Dummy");
	}
	
//	public int get_private_n() {
//		return this.private_n;
//	}
//	
//	public void set_private_n(int n) {
//		this.private_n = n;
//	}
	
//	public Dummy(int n) {
//		this.n = n;
//	}
	
//	public Dummy(int in_n, int in_m, int in_final_n) {
//		this.n = in_n;
//		this.m = in_m;
//		this.final_n = in_final_n;
//	}

}
