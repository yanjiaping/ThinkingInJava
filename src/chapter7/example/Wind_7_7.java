package chapter7.example;

/**
 * 7.7 向上转型
 * 
 * @author YJP
 *
 */
class Instrument {
	public void play() {
		System.out.println("play()");
	}

	static void tune(Instrument i) {
		i.play();
	}
}

public class Wind_7_7 extends Instrument {

	public static void main(String[] args) {
		Wind_7_7 w = new Wind_7_7();
		Instrument.tune(w);
	}

}
