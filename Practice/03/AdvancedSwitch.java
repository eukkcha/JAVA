
public class AdvancedSwitch {

	public static void main(String[] args) {
		var day = "MON";
		var today = "";
		switch(day) {
			case "SAT", "SUN" -> today = "주말";
			case "MON", "TUS", "WED", "THU", "FRI" -> today = "주중";
			default -> System.out.println("Error");
		}
		System.out.println(today);
	}

}
