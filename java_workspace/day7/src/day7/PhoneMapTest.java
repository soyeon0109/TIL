package day7;

import java.util.HashMap;
import java.util.Set;

public class PhoneMapTest {

	public static void main(String[] args) {
/*		String [] s1 = new String[3];
		s1[0] = "010-1234-5678";
		s1[1] = "02-334-5678";
		s1[2] = "ss@multi.com";
		
		s1 = new String[30];
		
		String []s2 = {"010-1234-5678","02-334-5678","ss@multi.com"};
		s2 = new String[30];
*/		
		HashMap<String, String[]> phone =
				new HashMap<String, String[]>();
		
		phone.put("초등친구", new String[]{"010-1234-5678","02-334-5678","031-9988-7766","fri@multi.com"});
		phone.put("고등친구", new String[]{"010-1234-5678","031-9988-7766","fri2@multi.com"});
		phone.put("회사동기",new String[]{"010-1234-5678","fri2@multi.com"});
		phone.put("회사상사",new String[]{"010-1234-5678","031-9988-7766","fri2@multi.com"});
		phone.put("회사상사",new String[]{"010-9966-5678","031-0000-7766","fri2@multi.com"}); //키값 같아서 수정
		
		System.out.println("총 연락처갯수 : "+phone.size());
		
		//회사 동기의 연락처 정보 조회
		if(phone.containsKey("회사동기")) {
			String [] phonelist = phone.get("회사동기");
			for(String one : phonelist) {
				System.out.println(one);
			}
		}
		
		//사장님 연락처 정보 조회
		if(phone.containsKey("사장님")) {
			String [] phonelist2 = phone.get("사장님");
			for(String one : phonelist2) {
				System.out.println(one);
			}
		} else {
			System.out.println("사장님은 연락처에 없어요");
		}
		
		//내 연락처 모든 정보 조회
		// 초등친구 : xxxx | xxxx | xxxx | ....
		// 모든 key 조회 = 4번 반복
		Set<String> keys = phone.keySet(); //key 중복 허용 X
		for(String k : keys) {
			System.out.print(k+ " : ");
			String[] phonelist = phone.get(k);
			for(String one : phonelist) {
				System.out.print(one +" | ");
			}
			System.out.println();
		}
	}

}
