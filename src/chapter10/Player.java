package chapter10;

// ���� ������ �� Ŭ������ ���ϴ� ��ü�� �����Ǳ� ���� �ʱ�ȭ �ȴ�.
// ���� ������ �� Ŭ������ ���ϴ� ���� �޼ҵ尡 ����Ǳ� ���� �ʱ�ȭ �ȴ�.
public class Player {
	static int playerCount = 0;
	private String name;

	public Player(String n) {
		name = n;
		playerCount++;
	}

}
