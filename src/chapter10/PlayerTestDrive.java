package chapter10;

public class PlayerTestDrive {
	public static void main(String[] args) {
		System.out.println(Player.playerCount);
		Player one = new Player("Tiger Woods");
		System.out.println(Player.playerCount); // 정적 변수를 접근할때에도 정적 메소드를 접근할때와 마찬가지로 클래스명을 사용 (Player)
	}

}
