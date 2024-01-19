package co.jp.chapter08;

public class JavaChapter08 {
	
	public static void main(String[] args) {
		
		Weapon wp = new Weapon("wp",7,false);
		
		Sword swd = new Sword("sword",8,false);
		
		Bow bow = new Bow("bow",9,false);
		
		Shield sid = new Shield("shield",10,false);
		
//		System.out.println(wp.name);	
//		System.out.println(wp.durability);
//		System.out.println(wp.isBroken);
		
//		System.out.println(swd.name);	
//		System.out.println(swd.durability);
//		System.out.println(swd.isBroken);
//		System.out.println(swd.damage);
		
//		System.out.println(swd.isBroken);
//		
		//swd.breakWeapon();
		
		//swd.call();
//		
//		System.out.println(swd.isBroken);
		
//		System.out.println(swd instanceof Sword);
//		System.out.println(swd instanceof Weapon);
//		
//		System.out.println(wp instanceof Sword);
		
		Weapon wp1 = new Sword("cast sword",20,false);
		
		Sword castWp = (Sword)wp1;
		
		castWp.call();
	}
	
}
