package co.jp.chapter08;

public class Sword extends Weapon{

	int damage = 99;
	
	String name = "sowrd name";
	
	Shield swordShield;
	
	public Sword(String name, int durability, boolean isBroken) {
		super(name, durability, isBroken);
		// TODO 自動生成されたコンストラクター・スタブ
		this.swordShield = new Shield("swordShield",5,false);
	}
	
	@Override
	public void breakWeapon() {
		//super.breakWeapon();
		System.out.println("ding!!");
	}
	
	public void call() {
		//super.breakWeapon();
		System.out.println(this.name);
		
		System.out.println(super.name);
		
	}
}
