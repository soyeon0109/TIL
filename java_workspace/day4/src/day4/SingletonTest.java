package day4;
//singleton - spring
//자바 테스트
class A{
	private static A a1 = new A();
	private A(){
		System.out.println("A 생성자 호출");
	}
	static A getInstance(){
		return a1; //객체가 생성되기 이전부터 메모리에 저장되어 유지
	}
}

public class SingletonTest {

	public static void main(String[] args) {
		A.getInstance(); //A타입 객체 생성 통로
		A.getInstance();
		A.getInstance(); //3번 호출해도 A 생성자가 static이라 1개만 만들어져서 공유됌
	}

}
