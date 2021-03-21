package day8;

@FunctionalInterface
interface Math{
	public int calc(int first, int second);
	//public double calc2(double f, double s); //메소드 2개 이상 불가능
}
@FunctionalInterface
interface C{
	public int calc(int first, int second);
}

@FunctionalInterface
interface A{
	int ma();
}

@FunctionalInterface
interface B{
	int mb(int i);
}
class C1{
	static int mc1(int i, int j) {return i/j;}
	int mc2(int i, int j) {return i % j;}
}

public class FunctionalTest {
	String name = "멤버변수";
	public static void main(String[] args) {
		String name = "메인지역변수";
		Math m = (a,b)-> a*b;
		System.out.println(m.calc(10, 2));
		
		//Math m2 = (int first, int second)->{return first - second;};
//		Math m2 = (first, second)-> first - second;
//		System.out.println(m2.calc(10, 2));
//		
//		Math m3 = (i,j)-> i+j;
//		System.out.println(m3.calc(10, 2));
//		
//		Math m4 = (i,j)-> i/j;
//		System.out.println(m4.calc(10, 2));
		
		//Math m5 = (i, j)->C1.mc1(i, j); //람다식의 매개변수를 외부클래스 메소드 매개변수 전달하고
		Math m5 = C1::mc1;
		//외부클래스 메소드 실행한 결과 리턴
		System.out.println(m5.calc(10, 2));
		
		//Math m6 = (i,j)-> new C1().mc2(i, j);
		C1 c = new C1();
		Math m6 = c::mc2; 
		//객체생성 변수명::non-static 메소드명
		System.out.println(m6.calc(10, 2));
		
//		A a1 = ()-> 1;
//		System.out.println(a1.ma());
//		
//		B b1 = a-> {
//			String name2 = "람다"; //람다식에서만 쓰는 변수. 메인 지역변수와 이름 달라야함
//			System.out.println("람다식 실행");
//			System.out.println(name); //람다 포함 메소드 지역변수 사용 가능.
//			// 멤버변수가 static 변수 ---> 클래스명.static변수
//			// non-static 변수 ---> new 클래스명().non-static변수
//			System.out.println(new FunctionalTest().name);
//			return a*a;
//		};
//		System.out.println(b1.mb(10));
	}

}
