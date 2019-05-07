package chapter06;

import java.util.ArrayList;

public class DotCom {

	private ArrayList<String> locationsCells;
	private String name;

	public void setLocationCells(ArrayList loc) {
		locationsCells = loc;
	}

	public void setName(String n) {
		name = n;
	}

	public String checkYourself(String userInput) {
		String status = "miss";
		int index = locationsCells.indexOf(userInput);
		if (index >= 0) {
			locationsCells.remove(index);
			if (locationsCells.isEmpty()) {
				status = "kill";
				System.out.println("Ouch! You sunk" + name + " :(");

			} else {
				status = "hit";
			}
		} // if문 끝
		return status;
	} // 메소드 끝

} // 클래스 끝
