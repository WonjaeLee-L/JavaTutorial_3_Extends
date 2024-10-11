package _01_zooUnit;

public class Monkey extends SuperUnit {

	@Override	// 선택적으로 재정의
	public void feed() {
		System.out.println("바나나 10개를 먹이로 준다!");
	}

	// superclass abstract시 add unimplemented methods 
	@Override	// 필수적으로 재정의
	public void kkk() {
		// TODO Auto-generated method stub
		
	}

}
