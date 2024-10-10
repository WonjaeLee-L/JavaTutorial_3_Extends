package _01_zooPlay;

import java.util.ArrayList;

import _01_zooUnit.Monkey;
import _01_zooUnit.SuperUnit;
import _01_zooUnit.Tiger;

public class Game {

	public static void main(String[] args) {
		ArrayList<SuperUnit> zlist = new ArrayList<>();

		SuperUnit t1 = new Tiger();
		t1.name = "호돌이";
		t1.age = 1;
		t1.kg = 40;
		zlist.add(t1);

		t1 = new Tiger();
		// add 후 다시 쓰기
		t1.name = "호순이";
		t1.age = 2;
		t1.kg = 60;
		zlist.add(t1);

		SuperUnit m1 = new Monkey();
		m1.name = "숭이";
		m1.age = 3;
		m1.kg = 30;
		zlist.add(m1);

		for (SuperUnit su : zlist) {
			System.out.println(su.toString());
			System.out.print(su.name + "에게 ");
			su.feed();
		}

	}

}
