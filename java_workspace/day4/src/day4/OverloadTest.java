package day4;

class Adding{
	public int add(int i, int j) {
		return i+j; //정수 덧셈
	}
	public double add(double i, double j) {
		return i+j; //실수 덧셈
	}
	public String add(String i, String j) {
		return i+j; //문자열 결합
	}
}
public class OverloadTest {

	public static void main(String[] args) {
		String s1 = "100";
		int dec = Integer.parseInt(s1);
		int bin = java.lang.Integer.parseInt(s1, 2);
		System.out.println(dec);
		System.out.println(bin);
		Adding a = new Adding();
		String r1 = a.add("java", "program");
		int r2 = a.add(10, 20);
		double r3 = a.add(3.14,2.0);
		System.out.println(r1+":"+r2+":"+r3);
	}
/* 1개 메소드 이름이 2개 기능 구현 유사
 * 메소드 overloading
 * 1개의 클래스에 같은 이름 메소드 여러개 정의 기술
 * 매개변수 갯수, 타입, 순서중 1개 이상 다르게 정의
 * 리턴타입, modifier 상관없다.
 class Integer{
 	public int parseInt(String s){
 		s를 정수로 변경 기능
 		return s 를 정수로 변경
 	}
 }
 public int parseInt (String s, int r){
 	return r 진수로 변경
 }
 */
}
