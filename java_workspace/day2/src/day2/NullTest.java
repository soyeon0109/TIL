package day2;

public class NullTest {

	public static void main(String[] args) {
		String s1 = null;
		System.out.println(s1);
		if(s1 != null) {
			System.out.println(s1.toUpperCase());
		}
		
		//char-1개 문자 표현'단일 문자', String - "여러개 문자 묶음"
		String sa = "java";
		String sb = "java";
		String sc = new String("java");
		String sd = new String("java");
		
		if(sa==sb)
			System.out.println("sa == sb 같다");
		if(sb == sc)
			System.out.println("sb == sc 같다");
		if(sc == sd)
			System.out.println("sc == sd 같다");
		//참조형 변수 == (연산자) 동등성 비교 -> 주솟값 동일 비교
		// String.equals() (메소드) 동등성 비교 -> 문자열 내용 동일 비교
		if(sa.equals(sb))
			System.out.println("sa.equals(sb) 같다");
		if(sb.equals(sc))
			System.out.println("sb.equals(sc) 같다");
		if(sc.equals(sd))
			System.out.println("sc.equals(sd) 같다");
	}

}
