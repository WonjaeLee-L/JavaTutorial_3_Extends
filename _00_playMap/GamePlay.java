package _00_playMap;

import java.util.ArrayList;

import _00_unit.Seok;
import _00_unit.StarUnit;
import _00_unit.ZZan;

public class GamePlay {

	public static void main(String[] args) {
		// 여기서 게임을 진행한다.
		// 캐릭터 Seok을 선택함 >> 객체 생성
		// s1의 참조변수는 Seok의 주소값을 저장한다.
		// 상속받지 않아도 참조(.)하면 맨뒤에 -Object라고 뜬다. 여기서 Object란 자바에서 최상위 클래스를 의미한다. 
		// Object class는 모든 클래스가 상속받는다.
		// 상속받은 후에는 attact, hp, unitName, attack()에 접근 가능하다.
		// 상속 : super class의 멤버변수와 메서드를 sub class가 확장하여 사용하는 것이다.
		ArrayList<StarUnit> seok_zzanList = new ArrayList<>();		
		// 보통 상속으로 ArrayList를 만들지 않는다.
//		ArrayList<Seok> seokList = new ArrayList<>();
		// ArrayList<ZZan> zzanList = new ArrayList<>();
		StarUnit s1 = new Seok();
		// 다형성(객체지향 언어 특징) : 부모로부터 접근. 부모에게 정의된 멤머변수와 메서드를 부모로부터 접근
		// 슈퍼클래스의 참조변수, 자식클래스의 객체를 참조할 수 있다. 부모를 가지고 자식을 객체를 만들면 자식에 관심이 있는 것(is a관계)
		// s1은 StarUnit의 주소 
		// s1.unitName은 부모로부터(부모의 주소로) unitName에 접근
//		Seok t1 = new Seok();
		// t1.unitName은 자식객체에 있는 unitName에 접근
		s1.unitName = "석진";
		s1.hp = 6000;
		s1.attack = 100;
		seok_zzanList.add(s1);
		
		StarUnit s2 = new Seok();
		s2.unitName = "홍길";
		s2.hp = 5500;
		s2.attack = 80;
		seok_zzanList.add(s2);
		// 캐릭터를 드래그해서 석진과 홍길을 같이 선택한 상태
		// 각 캐릭터 마다 스레드를 따로 주면 알아서 따로 동작하게 한다.
		
		StarUnit z1 = new ZZan();
		z1.unitName = "짜장";
		z1.hp = 7000;
		z1.attack = 120;
		seok_zzanList.add(z1);
		
		for(StarUnit s : seok_zzanList) {
//			System.out.println(s.toString());
			s.attack();
			// 선택한 캐릭터에 어택명령을 내린 상태
		}
	}

}
