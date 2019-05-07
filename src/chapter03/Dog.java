package chapter03;

public class Dog {
	String name;

	public static void main(String[] args) {
		// Dog 객체를 만들고 접근합니다.
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";

		// 이번에는 Dog 배열을 만듭니다.

		Dog[] myDogs = new Dog[3];
		// 그리고 개를 몇마리 집어 넣습니다.
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		// 배열 레퍼런스를 써서 Dog객체에 접근합니다.
		myDogs[0].name = "Fred";
		myDogs[1].name = "Manggo";

		// myDogs[2]의 이름이 뭐였지?
		System.out.print("마지막 개의 이름 : ");
		System.out.println(myDogs[2].name);

		// 순환문을 써서 배열에 들어있는
		// 모든 개가 짖도록 해보자
		int x = 0;
		while (x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		}

	}

	public void bark() {
		System.out.println(name + "이 왈! 하고 짖습니다.");
	}

}
