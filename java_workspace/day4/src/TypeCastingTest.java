class Parent{
	//Parent(){super();}
	int su1 =10; 
	void pr() {
		System.out.println(su1);
	}
	void mp() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	//Child(){super();}
	int su2 = 20;
	void pr() { //overriding
		System.out.println(su2);
	}
	void mc() {
		System.out.println("Child");
	}
}
public class TypeCastingTest {

	public static void main(String[] args) {
		//Parent p1 = new Parent();
		//Child c1 = new Child();
		Parent p2 = new Child(); //자동 형변환
		System.out.println(p2.su1);
		//System.out.println(p2.su2); //불가능
		p2.mp();
		//p2.mc(); //불가능
		p2.pr(); //Child 호출 overriding 
		
		Child c2 = null;
		if(p2 instanceof Child) { //p2변수는 Child 타입의 객체 만들었느냐 -> T면 명시적 형변환 가능
			System.out.println("test1");
			c2 = (Child)p2; //명시적 형변환
		}
		Parent p3 = new Parent();
		if(p3 instanceof Child) { //false
			System.out.println("test2");
			Child c3 = (Child)p3;
		}
		
		System.out.println(c2.su2);
		c2.mc();
		
		//Child c3 = new Parent(); //자동 형변환 불가능. 컴파일오류
		//Child c3 = (Child)new Parent(); //명시적 형변환 불가능. 실행오류. 자동형변환 하지 않았어서!!
		
	}

}
