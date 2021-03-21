package day5;

class Employee{
	int num; //사번 
	String name;
	int m1; //본봉 baseSalary
	int m2; //일반수당 generalFee
	int totalMoney;//totalSalary
	
	
	public Employee(int num, String name, int m1, int m2) {
		super();
		this.num = num;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
	}


	public void calcTotalSalary(){
		totalMoney = m1 + m2;
	}
}
class Manager extends Employee{
	int managerFee; //간부수당
	
	

	public Manager(int num, String name, int m1, int m2, int managerFee) {
		super(num, name, m1, m2); //Employee 생성자 
		this.managerFee = managerFee;
	}

	@Override
	public void calcTotalSalary() {
		//totalMoney = m1 + m2 + managerFee;
		super.calcTotalSalary(); //totalMoney = m1 + m2
		totalMoney += managerFee;
	}
	
}
class Engineer extends Employee{
	int certiFee; //자격수당
	int engineerFee; //기술수당
	Engineer(int num, String name, int m1, int m2, int certiFee, int engineerFee) {
		super(num, name, m1, m2);
		this.certiFee = certiFee;
		this.engineerFee = engineerFee;
	}
	
	@Override
	public void calcTotalSalary() {
		totalMoney = m1+m2+ totalMoney + certiFee+engineerFee;
	}
}
class Secretary extends Employee{
	int secretaryFee; //비서수당
	Secretary(int num, String name, int m1, int m2, int secretaryFee) {
		super(num, name, m1, m2);
		this.secretaryFee = secretaryFee;
	}
	
	@Override
	public void calcTotalSalary() {
		totalMoney = m1+m2+ totalMoney + secretaryFee;
	}
		
}

public class SalaryTest {

	public static void main(String[] args) {
		Employee e [] = new Employee[4];
		// 1.상속 2.생성자(타입 순서 갯수....)
		e[0] = new Employee
		(1000,"이사원",10000,5000);
		e[1] = new Manager
		(2000,"김간부",20000,10000,10000);
		e[2] = new Engineer
		(3000,"박기술",15000,7500,5000,5000);
		e[3] = new Secretary
		(4000,"최비서",15000,7000,10000);
		
		System.out.println("사번	:이름:본봉:총급여");
		for(int i = 0; i < e.length; i++) {
			e[i].calcTotalSalary();
			System.out.println(e[i].num+":"+e[i].name+":"+e[i].m1+":"+e[i].totalMoney);
			//Engineer 객체의 경우에는 certiFee와 engineerFee 같이 출력
			if(e[i] instanceof Engineer) {
				Engineer en = (Engineer)e[i];
				System.out.println(en.certiFee+":"+en.engineerFee);
			}
		}
	}
	/* 배열 내의 각 객체의 
    급여계산메소드 호출하고
사번, 이름, 총급여 출력

사번:이름:본봉:총급여
1000:이사원:10000:xxxxx
2000:김간부:20000:xxxxx
3000:박기술:15000:xxxxx
4000:최비서:15000:xxxxx
*/ 

}
