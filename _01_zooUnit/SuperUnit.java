package _01_zooUnit;

public class SuperUnit {
	public String zname = "human_zoo";
	public String name = null;
	public int age = 0;
	public int kg = 0;

	public void feed() {
		System.out.println("먹이주기");
	}

	@Override
	public String toString() {
		return "superUnit [zname=" + zname + ", name=" + name + ", age=" + age + ", kg=" + kg + "]";
	}

}
