package chapter7.example;

/**
 * 7.1 ×éºÏÓï·¨
 * 
 * @author YJP
 *
 */
class WaterSource {
	private String s;

	WaterSource() {
		System.out.println("WaterSource()");
		s = "Constructed";
	}

	public String toString() {
		return s;
	}
}

public class SprinklerSystem_7_1__1 {
	private String value1, value2, value3, value4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;

	public String toString() {
		return "value1 = " + value1 + " " + "value2 = " + value2 + " " + "value3 = " + value3 + " " + "value4 = "
				+ value4 + "\n" + "i = " + i + " " + "f = " + f + " " + "source = " + source;
	}

	public static void main(String[] args) {
		SprinklerSystem_7_1__1 sprinklers = new SprinklerSystem_7_1__1();
		System.out.println(sprinklers);
	}

}
