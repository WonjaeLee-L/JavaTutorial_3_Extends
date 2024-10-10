package _00_unit;
// extends StarUnit으로 상속받음
public class Seok extends StarUnit{

	// *** superclass에서 상속받은 메서드를 subclass가 그대로 사용하지 않고 재정의 하겠다. (source -> override methods) ***
	@Override
	public void attack() {
		System.out.println("seok만은 독자적 공격으로 -50");
//		super.attack();
		// if문으로 체력에 따른 공격 조건 설정 가능
	}

	

}
