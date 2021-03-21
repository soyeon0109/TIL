package generic1;

class Apple{
	String origin = "대구";
	
}
class Paper{
	String size = "A4";
}
//Box <Apple과 하위클래스, Paper
class Box<T, K>{ //컴파일 시점 타입전달 - 정적 유지. 타입 파라미터
 	T t1;
 	K k1;
 	String name = "상자";
	Box(T t1, K k1){
		this.t1 = t1;
		this.k1 = k1;
	}
	public T getT1() {
		return t1;
	}
	public K getK1() {
		return k1;
	}
	public void setT1(T t1) {
		this.t1 = t1;
	}
	public void setK1(K k1) {
		this.k1 = k1; 
	}
}
class BoxManager{ //제네릭 메소드. 클래스는 제네릭 아니다
	public <P1, P2> Box<P1, P2> test(P1 a, P2 p) {
		Box<P1, P2> box2 = new Box<P1, P2>(a, p); //아직까지는 무슨 타입인지 모르는 것
		return box2;
	}
}

public class GenericTest {

	public static void main(String[] args) {
		Apple a = new Apple();
		Paper p = new Paper();
		Box<Apple, Paper> box = new Box<Apple, Paper>(a, p);
		
		System.out.println(box.getT1().origin);
		
		System.out.println(box.getK1().size);
		
		BoxManager manager = new BoxManager();
		Box<Apple, Paper> box2 = manager.test(a, p);
		System.out.println(box2.getT1().origin);
		System.out.println(box2.getK1().size);
	}

}
