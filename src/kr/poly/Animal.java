package kr.poly;
public abstract class Animal { //추상클래스(불완전한객체)
	// Dog, Cat --> Animal	
	public abstract void eat(); //추상클래스(불완전한메세드)
	public void move() {
		System.out.println("무리를 지어서 이동한다.");
	}
	
}
