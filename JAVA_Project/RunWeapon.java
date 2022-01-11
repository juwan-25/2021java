package prog5;

public class RunWeapon {

	public static void main(String[] args) {
		Bomb b = new Bomb();
		b.fire();
		Laser l = new Laser();
		l.fire();
		Weapon w = new Weapon();
		w.fire();
	}

}
