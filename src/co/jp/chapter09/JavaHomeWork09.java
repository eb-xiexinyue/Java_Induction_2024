package co.jp.chapter09;

public class JavaHomeWork09 {

	public static void main(String[] args) {

		//質問１
		//　btn.addActionListener((ActionEvent e) -> {
	 //   System.out.println("ボタンクリックしました。");
	//   });　
		//　“(ActionEvent e) ->”这里是用了ラムダ表达式。用于定义当按钮被按下的时候的消息输出“ボタンクリックしました”

		//質問２
		
		new Thread() {
		    @Override
		    public void run() {
		        System.out.println("thread running...");
		    }
		}.start();
		//这个部分使用了匿名クラス。
	}

}
