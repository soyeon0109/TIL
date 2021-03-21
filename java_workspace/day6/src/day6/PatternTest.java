package day6;

import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {
		// 정규표현식 전용 문자열
		//010-로 시작, 국번 3-4자리 번호-,전화번호 4자리 숫자 
		System.out.println(Pattern.matches
				("010-[0-9]{3,4}-[0-9]{4}", "010-1234-5678"));
		System.out.println(Pattern.matches
				("010-[0-9]{3,4}-[0-9]{4}", "012-1234-5678"));
		System.out.println(Pattern.matches
				("010-[0-9]{3,4}-[0-9]{4}", "010-123-5678"));
		System.out.println(Pattern.matches
				("010-[0-9]{3,4}-[0-9]{4}", "010-123a-5678"));
		//이메일 id: 알파벳, 숫자, !#$%_ 구성, 8-10자리 가능 [a-zA-Z0-9!#$%_]{8,10}
		// @
		//이메일 서버: 알파벳, 숫자 구성 3-10자리 가능 [a-zA-Z0-9]{3,10}
		//. ->정규표현식에서 아무 문자 갯수 무관하게 와도 된다는 의미
		// \\.으로 써야 .자체 표현 가능
		//com co.kr go.kr 중에 한가지 (com|co.kr|go.kr) 그룹핑
		String myemail = "javadosa1!@campus.com";
		boolean result = Pattern.matches
				("[a-zA-Z0-9!#$%_]{8,10}@[a-zA-Z0-9]{3,10}\\.(com|co.kr|go.kr)",
						myemail);
		if(result) {
			System.out.println(myemail +"은 이메일로 적합합니다");
		}
		//[표현형태(0-9..)]{최소횟수, 최대횟수}(문자그룹핑)
	}

}
