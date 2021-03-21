package day5;

public class ObjectClassTest {

	public static void main(String[] args) {
		MyObject o1 = new MyObject("java");
		MyObject o2 = new MyObject("java");
		// 패키지명.클래스명@16진수주소값암호
		// 객체는 자동 먼저 호출 결과 출력
		// 메소드 오버라이딩하면 다른값 재정의 가능 - 출력값 변경
		System.out.println(o1/*.toString()*/); //객체참조변수 출력
		//System.out.println(o1.toString());
		System.out.println(o2);
		//System.out.println(o2.toString());
		
		if(o1 == o2) { // '==' : 기본 + 참조(실제값+주소값)-연산자 오버라이딩X
			System.out.println("o1 == o2 true");
		}
		if(o1.equals(o2)) { 
			// 메소드 : 참조(주소값)- 메소드 오버라이딩 이전
			// 전달 매개변수 MyObject 타입이고 전달 배개변수값 동일하면 true- 메소드 오버라이딩 이후
			System.out.println("o1.equals(o2) true");
		}
	}

}
class MyObject/*extends Object*/{
	String msg;
	MyObject(String msg){
		this.msg=msg;
	}
	
	//toString() - 오버라이딩 -MyObject 객체 출력 내용 변경
	@Override
	public String toString() {
		return msg;
	}
	
	//equals() 그대로 상속 포함
	//if(o1.equals(o2)) 호출
	@Override
	public boolean equals(Object obj) { //정의 
		//String o2 = new String("java");
		//Object obj = 자바모든객체; //자동형변환
		if(obj instanceof MyObject) {
			return toString().equals(obj.toString());
/*			String me = this.toString();
			String other = obj.toString();
			if(me.equals(other)) {//String equals 메소드 - 문자열 내용 비교
				return true;
			}else {
				return false;
			}
*/
		}else {
			return false;
		}
	}
	
		
}
