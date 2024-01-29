package co.jp.chapter12;

public class JavaChapter12 {
	public static void main(String[] args) {
		
		System.out.println("-----start-----");
		
		try {
			
			String str = null;
//			System.out.println(str.charAt(0));
			
			test(str);
			
//			String[] arr = new String[] {"1","2"};
//			System.out.println(arr[2]);
			
		}
		catch(MyException e) {
			System.out.println(e.msg);
		}
//		catch(NullPointerException e) {
//			//System.out.println(e);
//			System.out.println("error");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			//System.out.println(e);
//			//System.out.println("error:ArrayIndexOutOfBounds");
//			e.printStackTrace();
//		}
		finally {
			System.out.println("code in finally");
		}
		
		System.out.println("-----end-----");
	}
	
	static void test(String s) throws MyException{
		try {
			s = s.concat("sss");
			System.out.println(s);
		}
		catch(NullPointerException e) {
			throw new MyException("thrown from MyException");
		}
		
//		if(s==null) {
//			throw new MyException("thrown from MyException");
//		}
//		else {
//			System.out.println(s);
//		}
	}

}
