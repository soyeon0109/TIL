package day1;

public class TimeConversion {

	public static void main(String[] args) {
		int time = 10000; //초단위 시간, 만초
		System.out.print(time + "초는 ");
		//시분초단위 변경 출력
		//10000초는 xx시간 xx분 xx초입니다.
		int h; 
		int m; 
		int s;
		
		h = time / 3600;
		time = time %3600;
		m = time / 60;
		s = time % 60;

		System.out.println(h +"시간 "+m+"분 "+s+"초 입니다.");
		
		String result;
		result = h>24 ? "만 1일 경과했습니다" : "1일 이내입니다";
		System.out.println(result);
	}

}
