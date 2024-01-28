package co.jp.chapter09;

public class JavaHomeWork09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

//質問1
//このソースコードでは、Swingを使用してGUIアプリケーションを作成している。
//ラムダ式は、btn.addActionListenerメソッドの引数として使用されている。
//具体的には、以下のコードがラムダ式を含んでいる。
//15 btn.addActionListener((ActionEvent e) -> {
//16 System.out.println("ボタンクリックしました。");
//17 });
//この部分で、btnというボタンに対してActionListenerを追加している。
//アクションリスナーは、ボタンがクリックされたときに実行されるコードを提供する。ラムダ式は、このアクションリスナーの実装を簡潔に記述している。
//具体的には、(ActionEvent e) -> { System.out.println("ボタンクリックしました。"); } の部分がラムダ式で、ボタンがクリックされたときに行われる処理を定義している。
//この場合、ボタンがクリックされるとコンソールに「ボタンクリックしました。」というメッセージが表示されるようになる。

//質問2
//このソースコードでは、匿名クラスがThreadクラスを拡張して新しいスレッドを作成し、その中でrunメソッドを実装している。
//具体的には、行4から行9までが匿名クラスの定義である。以下に、匿名クラスを利用している行を示す。
//4    new Thread() { // 匿名クラスの開始
//5        @Override
//6        public void run() {
//7            System.out.println("thread running...");
//8        }
//9    }.start(); 
//この部分が匿名クラスで、Threadクラスを拡張して新しいスレッドを作成し、そのスレッドが実行するrunメソッドを定義している。



