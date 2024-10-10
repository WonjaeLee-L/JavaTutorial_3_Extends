// super class
package _00_unit;

public class StarUnit {
	public int hp = 100;
	public int attack = 10;
	public String unitName = null;
	// null이라도 초기값을 넣는 습관을 갖자.

	public void attack() {
		System.out.println("공격점수 100점");
	}

	@Override
	public String toString() {
		return "StarUnit [hp=" + hp + ", attack=" + attack + ", unitName=" + unitName + "]";
	}

}
