package day7;

import java.util.ArrayList;

class Employee{
	int id;
	String name;
	double salary;
	
	Employee(int id, String name, double salary) {
		//super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	//toString 자동 포함 - 패키지명.클래스명@16진수...

	@Override
	public String toString() {
		return id+"-"+name+"-"+salary;
	}
	
}

public class ArrayListTest {

	public static void main(String[] args) {
		//ArrayList 조회 자주할 때 효율저
		//LinkedList 저장 수정 삭제 자주할 때 효율적
		
		//ArrayList = 여러 타입 데이터 저장 가능/ 동일 타입 데이터만 저장하되 갯수 변경 의도
		/* 1. 컴파일러 컴파일시점 타입 체크
		 * 2. 형변환 필요 없다 = 단순 가결 = 실행 오류 줄어든다
		 * 3. 타입 정적 유지
		 * 4. 타입 지정X => add(Object o) / Object <---get(0)
		 * 5. 타입 지정O => add(? o) / ? <--get(0) 리턴타입
		 * 6. generic 타입 지정한 ArrayList
		 * */
		ArrayList list = new ArrayList(5); //참조형변수만 저장 가능
		//ArrayList<String> list = new ArrayList<String>(5); //String 타입만 저장 가능
		list.add(100); //int 타입 데이터를 Integer 타입 자동 변경 가능
		list.add(new Integer(200)); //Integer 타입 객체
		list.add(2.55); //double 타입
		list.add(new Double(32.14)); //Double 타입 객체
		list.add(300);
		list.add(9.99);
		list.add("자바 프로그램"); //6번 인덱스
		list.add(0, " 변경 "); //0번 인덱스에 "변경" 데이터 저장, 
		
		list.set(0, "변경확인"); //0번 인덱스 저장 데이터를 "변경확인"으로 수정
		list.remove(0);
		
		Employee e1 = new Employee(100, "이사원", 56000.55);
		Employee e2 = new Employee(200, "최대리", 66000.55);
		Employee e3 = new Employee(300, "박과장", 76000.55);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println(list.size());
		
		//list 내에 멀티캠퍼스 문자열 있다면 삭제 
		if(list.contains("멀티캠퍼스")){
			System.out.println(list.indexOf("멀티캠퍼스"));
			list.remove("멀티캠퍼스");
		}
		for(int i = 0; i < list.size() ; i++) {
			Object o = list.get(i);
			//day7.Employee@15db9742 나오므로 string 오버라이딩 필요
			System.out.println(i + " 번 인덱스= " + list.get(i)); //id-name-salary형식
			//만약 조회 데이터가 Employee 객체라면 name 변수만 출력한다.
			//Integer, Double, String, Employee 
			if(o instanceof Employee) {
				System.out.println(((Employee)list.get(i)).name);
			}
		}
		
		//auto boxing / unboxing 
		//int i = new Integer(500);
		//Integer in = 100;
	}

}
