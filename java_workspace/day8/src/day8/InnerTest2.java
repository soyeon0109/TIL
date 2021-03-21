package day8;

class Outer2{ 
	int outervar = 10; //외부 클래스 non-static 멤버변수
	static int outervar2 = 20; //외부 클래스 static 멤버변수
	String name = "Outer2";
	
	class Inner{ // non-static(=인스턴스) 멤버 중첩 클래스 
		String name = "Inner";
		void m() {
			String name = "m메소드";
			System.out.println("중첩 클래스 메소드 실행");
			System.out.println(outervar);
			System.out.println(outervar2);
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Outer2.this.name);
		}
	}// inner end
	static class Inner2{ // static 멤버 중첩 클래스
		void m2() {
			System.out.println("중첩 클래스 메소드 실행2");
			//System.out.println(outervar); //static 변수 아니라 사용 불가능(메모리 저장 시기 달라서)
			System.out.println(outervar2);
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
	}// test end
}
public class InnerTest2 {
//1. main 실행 이전 static (변수, 내부클래스, 메소드) 메모리 저장
//2. new Outer2() 실행 non-static (변수, 내부클래스, 메소드) 메모리 저장
	public static void main(String[] args) {
		//Outer o = new Outer();
		Outer2.Inner i = new Outer2().new Inner();
		i.m();
		
		Outer2.Inner2 i2 = new Outer2.Inner2(); //static 중첩 클래스
		i2.m2();
		
		Outer2 o = new Outer2();
		o.test();
	}

}
