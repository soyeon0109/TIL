package day3;

class Test{
	//리턴타입 = 기본형, 참조형 변수, void 다 가능
	int ma(){
		int i = 10; 
		return i*i;
	}
	String mb(){
		String s = "java";
		return s.toUpperCase();
	}
	int[] mc(){
		int [] i = new int[3];
		i[0] = 100;
		i[1] = 200;
		i[2] = 300;
		return i;
	}
	void md(){
		int i = 10; 
		System.out.println(i*i);
	}
	void me() {
		int i = 0;
		System.out.println("me메소드시작");
		//if(조건) 메소드 전체 중단
		//반복문 중단 - break
		if(i==0) { return;}//메소드 중단
		System.out.println("me메소드종료");
			
	}
}

public class ReturnTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		int r1 = t.ma();
		String r2 = t.mb();
		System.out.println(r1);
		System.out.println(r2);
		int[] r3 = t.mc();
		for(int one : r3) {
			System.out.println(one);
		}
		t.md();
		t.me();
		System.out.println("main 종료");
	}

}
