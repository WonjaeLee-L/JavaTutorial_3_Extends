package _01_zooUnit;

// 여기서 abstract -> sub에서 add unimplemented methods 
public abstract class SuperUnit {	// 추상 클래스. 추상 메서드가 있다면 추상클래스, 특징은 객체를 만들 수 없다는 것.
	public String zname = "human_zoo";
	public String name = null;
	public int age = 0;
	public int kg = 0;

	public void feed() {
		System.out.println("먹이주기");
	}
	
	// 추상 메서드 만들면, 위에 클래스도 abstract
	public abstract void kkk();		// 추상 메서드. 구현되지 않은 상태. 상속 받으면 반드시 override 해야 한다.

	@Override
	public String toString() {
		return "superUnit [zname=" + zname + ", name=" + name + ", age=" + age + ", kg=" + kg + "]";
	}

}
