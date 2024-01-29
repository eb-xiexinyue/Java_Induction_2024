package co.jp.chapter12;

public class MyException extends Exception{
	
	String msg;
	
	public MyException(String str) {
		this.msg = str;
	}
}
