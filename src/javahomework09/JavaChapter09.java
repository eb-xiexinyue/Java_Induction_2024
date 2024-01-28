package javahomework09;

public class JavaChapter09 {
//	質問１︓以下ソースにラムダ式の使う場所を解釈してください。
//	import java.awt.event.ActionEvent;
//	import java.awt.event.ActionListener;
//	import javax.swing.JButton;
//	import javax.swing.JFrame;
//	public class GUISample {
//	 public static void main(String[] args) {
//	 JFrame window = new JFrame("DCNet Java 教育");
//	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	 window.setSize(800, 600);
//	 JButton btn = new JButton("hello world");
//	 window.getContentPane().add(btn);
//	 btn.addActionListener((ActionEvent e) -> {
//	 System.out.println("ボタンクリックしました。");
//	});
//	 window.setVisible(true);
//	 }
//	}
	//回答：这个源代码使用了Swing来创建GUI应用程序。，Lambda表达式在btn.addActionListener方法中被使用。
	//btn.addActionListener((ActionEvent e) -> {
   // System.out.println("ボタンクリックしました。");
  //});
  //这里使用了Lambda表达式来替代实现ActionListener接口的匿名类。
	//ActionListener是一个接口，有一个在按钮被点击时调用的方法。
	//Lambda表达式的一般形式是(参数) -> { 处理 }，在这里，它接受一个ActionEvent参数，
	//并提供了在按钮被点击时执行的处理。
//	質問２︓以下ソースに匿名クラスの利⽤する⾏は︖
//	public class Kicker {
//	 public static void main(String... args) {
//	 new Thread() {
//	 @Override
//	 public void run() {
//	 System.out.println("thread running...");
//	 }
//	 }.start();
//	 }
//	}
	//回答：new Thread() {
//    @Override
//    public void run() {
//        System.out.println("thread running...");
//    }
//}.start();
//这里创建了一个扩展了Thread类的匿名类，覆盖了run方法。
	//然后，创建了该匿名类的实例并直接调用了start方法。
	//这样做创建了一个新的线程，并执行了run方法内的处理。使用匿名类允许在定义类和创建实例的同时进行，从而简化了代码。
	
	

}
