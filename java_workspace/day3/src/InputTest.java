//main 클래스 시작 메소드 - entry point method
public class InputTest {

	public static void main(String[] args) {
		/* run --- 100 200 -> 정수 아닌 문자
		 * args = new String[3];
		 * args[0] = "자바";
		 * args[1] = "program";
		 * args[2] = "과정";
		 * args[3] = "입니다";
		 * 
		 * */
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println(args[0]+args[1]);
		//String -> int, double 변경
		//(int)연산자 -> 기본형!!!
		//라이브러리 메소드 제공
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		System.out.println(first+second);
		
		double first2 = Double.parseDouble(args[0]);
		double second2 = Double.parseDouble(args[1]);
		System.out.println(first2+second2);
	}
	
}
//run InputTest --> run InputTest.main() 자동실행
//run InputTest 입력변수 전달 --> run InputTest.main() 자동실행