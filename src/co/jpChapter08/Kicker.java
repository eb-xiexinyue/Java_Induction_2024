package co.jpChapter08;

public class Kicker {
	    public static void print(Child v) {
	        v.hello();
	    }
	    
	    public static void main(String...args) {
	        print(new Child()); 
	    }
}
