package day2;

public class TestSample {

	public static void main(String[] args) {
/*		//  switch-case 문 이용하여 직급별 급여 구하기
		String title = "대리";// 직급
		int baseSalary = 500000;//본봉
		int  basicFee = 0;//사원수당
		double totalSalary = 0; //총급여 
		
		switch(title) {
		case "사원":
			basicFee = 1000;
			totalSalary = baseSalary + basicFee;
			break;
		case "대리":
		case "과장":
		case "부장":
			basicFee = 5000;
			totalSalary = baseSalary * 1.2 + basicFee;
			break;
		case "사장":
			basicFee = 10000;
			totalSalary = baseSalary * 1.3 + basicFee;
			break;
		}
		System.out.println((int)totalSalary);
*/		
		//while 문 이용
		/*'A'-'Z' 코드 65-90 : 대문자
		'a'-'z' 코드 97-122 : 소문자*/
		int number = (int)(Math.random()*200) +1;
		
		
	}

}
