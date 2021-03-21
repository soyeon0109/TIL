package nongeneric;

class Apple{
	String origin = "대구";
	
}
class Paper{
	String size = "A4";
}
class Box<T>{ //컴파일 시점 타입전달 - 정적 유지. 타입 파라미터
 	T o; 
	Box(T o){
		this.o = o;
	}
	public T getO() {
		return o;
	}
	public void setO(T o) {
		this.o = o;
	}
}
public class GenericTest {

	public static void main(String[] args) {
		Apple a = new Apple();
		Paper p = new Paper();
		Box<Apple> appleBox = new Box<Apple>(a);
		
		Box<Paper> paperBox = new Box<Paper>(p);
		
		//if(appleBox.getO() instanceof Apple)
			//System.out.println(((Apple)appleBox.getO()).origin);
		System.out.println(appleBox.getO().origin);
		
		//if(paperBox.getO() instanceof Paper)
		//	System.out.println(((Paper)paperBox.getO()).size);
		System.out.println(paperBox.getO().size);
	}

}
