package day6;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeTest {

	public static void main(String[] args) {
		// jdk 초기 날짜 표현 방법
		Date now = new Date();
		System.out.println(now);
		//Date 기능을 Calendar 이동
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		//날짜 시간 형식을 정해서 출력
		SimpleDateFormat sdf = new SimpleDateFormat
				("yyyy-MM-dd E a hh:mm:ss");
		String dat1 = sdf.format(now);
		String dat2 = sdf.format(cal.getTime());
		System.out.println(dat1);
		System.out.println(dat2);
		// 숫자 (기본 좌측정렬)
		DecimalFormat df = new DecimalFormat("###.###");
		System.out.println(df.format((double)10/3));
		//문자 (기본 우측정렬)
		System.out.println(String.format("%10s", "java"));
		System.out.println(String.format("%-10s", "java")); //우측정렬
	}

}
