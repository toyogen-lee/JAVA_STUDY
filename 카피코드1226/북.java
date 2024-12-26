package 카피코드1226;

public class 북 {
	private String 제;
	private String 저;
	private String 번;
	public 북(String 제, String 저, String 번) {
		this.제 = 제;
		this.저 = 저;
		this.번 = 번;
	}
	public String get제() {
		return 제;
	}
	public String get저() {
		return 저;
	}
	public String get번() {
		return 번;
	}
	public String 투스() {
		return 제 + "  " + 저 + "  " + 번;
	}

}
