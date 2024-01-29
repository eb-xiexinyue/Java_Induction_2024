package co.jp.chapter09;

public enum Gender {
	
	male("male type",0,"blue"), //color:blue
	female("female type",1,"red"),//color:red
	hidden("hidden type",-1,"white");//color:white

	
	final String genderStr;
	
	final int genderNo;
	
	final String color;
	
	Gender(String s, int n, String c) {
		this.genderStr = s;
		this.genderNo = n;
		this.color=c;
	}
	
	public String getGenderStr() {
		return genderStr;
	}

//	public void setGenderStr(String genderStr) {
//		this.genderStr = genderStr;
//	}

	public int getGenderNo() {
		return genderNo;
	}

//	public void setGenderNo(int genderNo) {
//		this.genderNo = genderNo;
//	}

}
