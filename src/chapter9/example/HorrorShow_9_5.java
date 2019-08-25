package chapter9.example;

/**
 * 9.5 通过继承来扩展接口
 * 
 * @author YJP
 *
 */
interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destory();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {
	@Override
	public void menace() {
		System.out.println("DragonZilla menace()");
	}

	@Override
	public void destory() {
		System.out.println("DragonZilla destory()");
	}
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {
	@Override
	public void destory() {
		System.out.println("VeryBadVampire destory()");
	}

	@Override
	public void menace() {
		System.out.println("VeryBadVampire menace()");
	}

	@Override
	public void kill() {
		System.out.println("VeryBadVampire kill()");
	}

	@Override
	public void drinkBlood() {
		System.out.println("VeryBadVampire drinkBlood()");
	}
}

public class HorrorShow_9_5 {
	static void u(Monster b) {
		b.menace();
	}

	static void v(DangerousMonster d) {
		d.menace();
		d.destory();
	}

	static void w(Lethal l) {
		l.kill();
	}

	public static void main(String[] args) {
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire vdal = new VeryBadVampire();
		u(vdal);
		v(vdal);
		w(vdal);
	}
}
