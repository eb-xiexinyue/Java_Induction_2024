package co.jp.chapter09;

public class JavaChapter09 {

	public static void main(String[] args) {
		
		//Animal animal = new Animal();
		
		//一般的の実装
//		Puppy dog = new Puppy();
//		dog.move();
//		
//		Turtle turtle = new Turtle();
//		
//		turtle.swim();
//		
//		turtle.walk();
		
		//内部クラスでの実装
//		Cat kitty = new Cat();
//		kitty.walk();
//		
//		Tiger tiger = new Tiger();
//		tiger.walk();
		
		//匿名クラスでの実装
//		Land_Animal animal = new Land_Animal() {
//
//			@Override
//			void walk() {
//				// TODO 自動生成されたメソッド・スタブ
//				System.out.println("Abstract Animal walking");
//			}
//
//			@Override
//			void move() {
//				// TODO 自動生成されたメソッド・スタブ
//				
//			}			
//		};
//		
//		animal.walk();
		
		//ラムダ式での実装
		ILand_Animal iAnimal = (s, i)->{
			System.out.println("iAnimal walking, And "+s +" "+ i  +" times");
		};
		
		iAnimal.walk("Jump",2);
		
		Gender sex = Gender.male;
	}
	
	public enum Gender{
		male,
		female
	}
	
	public static class Cat implements ILand_Animal{

		@Override
		public void walk(String str, int i) {
			// TODO 自動生成されたメソッド・スタブ
			System.out.println("Cat walking");
		}
		
	}

	public static class Tiger extends Land_Animal{

		@Override
		void move() {
			// TODO 自動生成されたメソッド・スタブ
			
		}

		@Override
		void walk() {
			// TODO 自動生成されたメソッド・スタブ
			System.out.println("Tiger walking");
		}
		
	}
	
}
