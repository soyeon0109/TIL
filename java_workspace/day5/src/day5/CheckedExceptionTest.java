package day5;

public class CheckedExceptionTest {
	
	public static void main(String[] args) {
		// 존재, 미존재
		try {
		Class.forName("day5.CheckedExceptionTest");
		}catch(ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		//System.out.println(10/0);//RuntimeException 
		
		//args[0] - 정수 변경 - > 0 이면 정상 사용
		//                  <= 0 이면 -인위적 NumberFormatException 발생 
		int su = Integer.parseInt("-100");
		try{
			if(su <= 0) {
				throw new NumberFormatException("소수 구하기 부적합합니다.");
		}
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
