package day5;

class Test{
	//예외 처리x, 예외 처리 권한을 다른 메소드에 위임
	void m1(int i) /*throws ArithmeticException*/ {
		System.out.println(100/i);
	}
	void m2() {
		//try{
			m1(0);
		//}catch(ArithmeticException e) {
		//	System.out.println(e.getMessage());
		//}
	}
	void m3() {
		try{
			m1(0);
		}catch(ArithmeticException e) {
			m1(100);
		}
	}
}
public class ThrowsTest {
	//자바시스템에 예외 알려줌. 에러메세지 출력
	public static void main(String[] args) /*throws ArithmeticException*/{
		Test t = new Test();
		t.m2();
		//t.m3();

	}

}
