package day5;

public class ExceptionTest {

	public static void main(String[] args) {
		//2개 이상 명령행 매개변수, 정수 변경값, 0제외 입력
		//예외 발생 가능성 문장
		//예외 발생 o --> try 중단- 발생예외타입 지정 catch 실행
		//예외 발생 x --> try 실행완료
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			System.out.println(i/j);
		}catch(ArithmeticException e) { //하위예외
			System.out.println("0을 입력하면 나누기 불가능합니다.");
		}finally {
			System.out.println("항상 실행합니다.");
			//파일 입출력-종료명시, db연결-연결해제명시, 네트워크-연결해제명시 
		}
		
		//catch(ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
			//3개 예외 동일 처리
		//}
/*		catch(ArithmeticException e) { //하위예외
			System.out.println("0을 입력하면 나누기 불가능합니다.");
		}
		catch(Exception e) { //상위예외
			System.out.println("그밖의 예외 동일 처리합니다.");
			
			//모든 예외 동일 처리
			// class ArithmeticException extends Exception
			// Exception e = new xxxxxException(); 형변환 가능
		}
*/		 
/*		catch(ArithmeticException e) {
			System.out.println("0을 입력하면 나누기 불가능합니다.");
			e.printStackTrace(); //예외발생 라인 추적 정보, 예외 발생 원인 모를때 사용
			System.out.println(e.getMessage()); //오류 메세지 
		} 
		catch(NumberFormatException e) {
			System.out.println("정수로 변경 가능한 값을 입력하세요.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("2개 이상의 값을 입력하세요.");
		}
		*/
		System.out.println("main 종료");
	}

}
