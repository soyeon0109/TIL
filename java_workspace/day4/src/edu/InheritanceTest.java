package edu;

class Employee{
	int id;
	String name;
	String salary;
	String pw="Employee";
	public void printEmp() {
		System.out.println(id+":"+name+":"+salary);
	}
	
}
class Manager extends Employee{
	String jobOfManage; //관리업무
	int cntOfSub; //부하직원수
	String pw = "Manager";
	/*Employee 상속 그대로 사용 또는 변경해 재정의 가능
	 * 이름 매개변수 리턴타입 modifier 동일하거나 modifier 더 넓어야함
	 */
	@Override //자바시스템에 오버라이딩메소드임을 알려줌
	public void printEmp() {
		super.printEmp();
		//System.out.println(id+":"+name+":"+salary);
		System.out.println(jobOfManage+":"+cntOfSub);
	}
	
	void test() {
		String pw = "test메소드";
		System.out.println(pw); //지역변수
		System.out.println(this.pw); 
		System.out.println(super.pw);
	}
}
public class InheritanceTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.id = 12345;
		m.name = "김부장";
		m.jobOfManage = "it직종 관리";
		m.cntOfSub = 10;
		System.out.println(m.id+":"+m.name+":"+m.jobOfManage+":"+m.cntOfSub);
		m.test();
		m.printEmp();//Manage 클래스 재정의 메소드 우선 
	}

}




