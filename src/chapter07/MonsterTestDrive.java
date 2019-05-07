package chapter07;

public class MonsterTestDrive {
	public static void main(String[] args) {
		Monster[] monster = new Monster[3];
		monster[0] = new Vampire();
		monster[1] = new Dragon();
		monster[2] = new Monster();
		for (int x = 0; x < 3; x++) {
			monster[x].frighten(x);
		}
	}

}
