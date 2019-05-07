package chapter10;

// 정적 변수는 그 클래스에 속하는 객체가 생성되기 전에 초기화 된다.
// 정적 변수는 그 클래스에 속하는 정적 메소드가 실행되기 전에 초기화 된다.
public class Player {
	static int playerCount = 0;
	private String name;

	public Player(String n) {
		name = n;
		playerCount++;
	}

}
