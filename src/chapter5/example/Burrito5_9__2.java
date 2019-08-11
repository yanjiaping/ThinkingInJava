package chapter5.example;

public class Burrito5_9__2 {
	Spiciness degree;

	public Burrito5_9__2(Spiciness degree) {
		this.degree = degree;
	}

	public void describe() {
		System.out.print("This burrito is ");
		switch (degree) {
		case NOT:
			System.out.println("not spicy at all.");
			break;
		case MILD:
		case MEDIUM:
			System.out.println("a little hot.");
			break;
		case HOT:
		case FLAMING:
		default:
			System.out.println("maybe too hot.");
			break;
		}
	}

	public static void main(String[] args) {
		Burrito5_9__2
			plain = new Burrito5_9__2(Spiciness.HOT),
			greenChile = new Burrito5_9__2(Spiciness.MEDIUM),
			jalapeno = new Burrito5_9__2(Spiciness.HOT);
		plain.describe();
		greenChile.describe();
		jalapeno.describe();
	}

}
