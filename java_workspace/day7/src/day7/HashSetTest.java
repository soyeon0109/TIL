package day7;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		//HashSet set = new HashSet();
		HashSet<Employee> set = new HashSet<Employee>();
		
		//set.add(100);
		//set.add(3.14);
		//set.add("java");
		Employee e1 = new Employee(400, " 박부장 ", 88000.90); //e1 :주소
		set.add(e1);
		//set.add(e1); //무시
		//set.add(new Employee(400, " 박부장 ", 88000.90)); // 새로운 객체 생성. e1 중복 아니다
		
		System.out.println(set.size());
		
		//for(int i = 0; i < set.size(); i++) {
			//Iterator it = set.iterator(); // 반복자 (set 저장 데이터들을 순서없이 모은 객체)
			Iterator<Employee> it = set.iterator();
			while(it.hasNext()) { // 다음 데이터 존재 여부
				//Object o = it.next(); // 다음 데이터 조회
				Employee o = it.next();
				System.out.println(o.name);
			}
			
		//}
			
		System.out.println("=======================================");
		HashSet<Integer> lotto = new HashSet<Integer>();
		// 1-45 난수 생성하여 lotto 저장하여
		// lotto 출력하면 6개 정수 나오도록 처리(저장 - 조회 출력 순서 일치하지 않아도 된다)
		
		while(true) {
			int num = (int)(Math.random()*45)+1;
			lotto.add(num); //최대 6번까지, 중복 데이터는 추가되지 않음, for문보다는 while문으로
			System.out.println("생성된 난수="+num);
			if(lotto.size()==6) {
				break;
			}
		}
		
		// 1. Iterator 사용
		Iterator<Integer> it2 = lotto.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next()); //항상 6개
		}
		// 2. 반복문 사용
		for(Integer one : lotto) { //lotto.size() 만큼 자동 반복
			System.out.println(one); //데이터 출력
		}
		
		//향상된 for문
/*		int [] ar = new int[5];
		for(int one : ar) {
			System.out.println(one);
		}
		ArrayList list = new ArrayList();
		
		for(Object one : list) {
			System.out.println(one);
		}
*/		
		
	}

}
