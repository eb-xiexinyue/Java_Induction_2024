package co.jp.chapter08;

public class Weapon{

	String name;
	
	protected int durability;
	
	boolean isBroken;

	public Weapon(String name, int durability, boolean isBroken) {
		super();
		this.name = name;
		this.durability = durability;
		this.isBroken = isBroken;
	}
	
	public void breakWeapon() {
		this.isBroken = true;
		System.out.println("weapon broken!");
	}
}
