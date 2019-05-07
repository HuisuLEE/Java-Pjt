package chapter04;

// 캡슐화 : 인스턴스 변수는 private로 게터와 세터 메소드는 public으로
public class GoodDog {

	private int size; // 인스턴스 변수는 private로 만들자

	public int getSize() { // 게터와 세터 메소드는 public으로
		return size;
	}

	public void setSize(int s) {
		size = s;
	}

	void bark() {
		if (size > 60) {
			System.out.println("왈왈");
		} else if (size > 14) {
			System.out.println("컹컹");
		} else {
			System.out.println("멍멍");
		}
	}

}
