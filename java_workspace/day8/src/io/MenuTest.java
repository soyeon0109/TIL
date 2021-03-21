package io;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	int id;
	String name;
	double salary;
	Employee(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
	public String toString() {
		return id+"|"+name+"|"+salary;
	}
	
}

public class MenuTest {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		Employee e=null;
		ArrayList<Employee> list =  new ArrayList<Employee>();
		//파일이나 db --> 영구 저장
		
		here : while(true) {
			System.out.println("===다음과 같은 메뉴 이용 가능합니다====\n"+
						"1.사원등록\n"+"2.사원정보조회\n"+"3.사원정보수정\n"+
						"4.사원탈퇴\n"+"5.프로그램종료\n"+"\n"+"번호입력: ");
		
		
			int menu = num.nextInt();
			
			
			switch(menu) {
			case 1:
				System.out.println("사번 입력:");
				int id = num.nextInt();
				
				System.out.println("이름 입력:");
				String name = num.next();
			
				System.out.println("급여 입력:");
				double salary = num.nextDouble();
			
				e = new Employee(id, name, salary);
				
				//ArrayList 정의하고 등록, 사원을 ArrayList 가장 끝에 저장
				list.add(e);
				
				System.out.println(list.size()+" 명의 사원 등록을 마쳤습니다. ");
				break;
			case 2:
				System.out.println("사원정보 조회를 선택하셨습니다.");
				//ArrayList에 저장된 모든 사원 정보 출력
				for(Employee em : list) {
					System.out.println(em);
				}
				
				break;
			case 3:
				System.out.println("사원정보 수정을 선택하셨습니다.");
				//수정사번 입력: 100
				//수정항목 입력: name 박수정 -> 이름 변경 (name, 박수정 split으로 읽어오기)
				//수정항목 입력: salary 3000 -> 현재 급여 + 3000으로 변경
				
				//list.contains(o)
				
			break;
			case 4:
				System.out.println("사원탈퇴 조회를 선택하셨습니다.");
				//퇴사한 사번 입력 : 100
				//100번 사번 list에서 삭제 
				
				break;
			case 5:
				System.out.println("프로그램 종료합니다.");
				break here;
			default:
				System.out.println("해당 기능의 메뉴는 존재하지 않습니다.");
				break;
				
			}
		}
	}

}
