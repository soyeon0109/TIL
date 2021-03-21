package day3;

class MyObject{
	int a = 10;
	
}
class Call{
	void add(int i) { //기본형 변수
		//i=10 가정
		System.out.println(i++);// 10출력 후 메모리에서 i=11
	}
	void addObject(MyObject mo) { //참조형변수
		System.out.println(mo.a++);
	}
}
public class CallByValueTest {

	public static void main(String[] args) {
		Call c = new Call();
		//int j = 10;
		//c.add(j);
		//System.out.println("c.add(j) 호출 후의 j = "+j);
		MyObject obj = new MyObject();
		c.addObject(obj);
		System.out.println("c.addObject(obj) 호출 후의 obj.a = "+obj.a);
	}

}
