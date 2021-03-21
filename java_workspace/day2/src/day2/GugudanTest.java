package day2;

public class GugudanTest {

	public static void main(String[] args) {
		// 2단 ~9단 출력시 5단만 제외하고 출력
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				if(j == 5) continue;
				System.out.print(j+"*" + i +"="+j*i +"\t");
			}
			System.out.println();
		}

	}

}
