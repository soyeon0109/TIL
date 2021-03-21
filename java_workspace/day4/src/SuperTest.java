class A/*extends Object*/{ //extends Object 자동 정의, Object는 java.lang 라이브러리
	int i;
	A(String s){
		//super(); 자동 정의 // Object() 생성자 호출 
		i = 10; 
		System.out.println("A 생성자 호출");
	}
}
class B extends A{
	int j;
	B(){
		//super(); //자동 정의  A() 생성자 호출
		super("aaa");
		j = 100;
		System.out.println("B 생성자 호출");
	}
}
public class SuperTest {

	public static void main(String[] args) {
		B b1 = new B(); // Object, A, B 차례로 만들어짐
		System.out.println(b1.i);
		System.out.println(b1.j);

	}

}