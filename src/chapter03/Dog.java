package chapter03;

public class Dog {
	String name;

	public static void main(String[] args) {
		// Dog ��ü�� ����� �����մϴ�.
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";

		// �̹����� Dog �迭�� ����ϴ�.

		Dog[] myDogs = new Dog[3];
		// �׸��� ���� ��� ���� �ֽ��ϴ�.
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		// �迭 ���۷����� �Ἥ Dog��ü�� �����մϴ�.
		myDogs[0].name = "Fred";
		myDogs[1].name = "Manggo";

		// myDogs[2]�� �̸��� ������?
		System.out.print("������ ���� �̸� : ");
		System.out.println(myDogs[2].name);

		// ��ȯ���� �Ἥ �迭�� ����ִ�
		// ��� ���� ¢���� �غ���
		int x = 0;
		while (x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		}

	}

	public void bark() {
		System.out.println(name + "�� ��! �ϰ� ¢���ϴ�.");
	}

}
