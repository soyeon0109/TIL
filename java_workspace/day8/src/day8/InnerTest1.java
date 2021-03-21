package day8;

class Outer{
	class Inner{ // non-static(=인스턴스) 멤버 중첩 클래스 
		void m() {
			System.out.println("중첩 클래스 메소드 실행");
		}
	}// inner end
	static class Inner2{ // static 멤버 중첩 클래스, 중첩 클래스는 static 붙일 수 있음
		void m2() {
			System.out.println("중첩 클래스 메소드 실행2");
		}
	}
	void test() {
		//지역중첩클래스(= 로컬 클래스) - 현재 메소드에서만 쓸 수 있다.
		class Inner3{
			void m3() {
				System.out.println("중첩 클래스 메소드 실행3");
			}
		}
		new Inner3().m3();
	}
}
public class InnerTest1 {

	public static void main(String[] args) {
		//Outer o = new Outer();
		Outer.Inner i = new Outer().new Inner();
		i.m();
		
		Outer.Inner2 i2 = new Outer.Inner2(); //static 중첩 클래스
		i2.m2();
		
		Outer o = new Outer();
		o.test();
	}

}
