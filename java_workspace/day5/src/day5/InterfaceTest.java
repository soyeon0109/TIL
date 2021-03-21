package day5;
//1>다중상속 2>여러 서로 클래스 공통 메소드 정의 스펙 = abstract 클래스
//1번 2번 모두 필요하면 interface, 2번만 필요하면 abstract 
class StudentTeacher /*extends Object*/ implements Student, Teacher{
	//String name = "학생"; Student 상속
	//String name = "교수"; Teacher 상속
	String name = "조교";
	public void study() {
		//Student.name = "학생조교"; //final static 이라 수정 불가
		System.out.println(Student.name);
		System.out.println(Teacher.name);
		System.out.println("학생-공부하다");
	}

	@Override
	public void teach() {
		System.out.println("선생님 - 가르치다");
		
	}

	@Override
	public void lunch() {
		System.out.println("학생과 선생님 - 점심먹다");
		
	}

	
}
class ITTeacher implements Teacher{

	@Override
	public void teach() {
		System.out.println("it를 가르치다");
		
	}

	@Override
	public void lunch() {
		System.out.println("12시에 점심먹다");
		
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) {
/*		StudentTeacher st = new StudentTeacher();
		st.study();
		st.lunch();
		st.teach();
		System.out.println(st.name); //조교
*/
/*		Student st = new StudentTeacher();
		st.study();
		st.lunch();
		//st.teach();
		System.out.println(st.name); //학생
*/
		/*		Teacher st = new StudentTeacher();
		//st.study();
		st.lunch();
		st.teach();
		System.out.println(st.name); //Teacher 타입이라 교수출력
		System.out.println(Teacher.name);
*/
		//서로 다른 객체를 1개의 타입(Teacher)로 통일한것 : 형변환
		Teacher[] t = new Teacher[2]; //Teacher 타입의 배열을 만든것
		//Teacher t = new Teacher(); Teacher 타입의 객체 만드는것은 불가능
		t[0] = new StudentTeacher();
		t[1] = new ITTeacher();
		t[0].teach(); //overriding 은 하위클래스 우선
		t[0].lunch();
		t[1].teach();
		t[1].lunch();
		
/*		//명시적 형변환
		StudentTeacher st =(StudentTeacher)t[0];
		st.study();
*/		
		for(int i = 0; i<t.length ; i++) {
			if(t[i] instanceof StudentTeacher) {
				StudentTeacher st = (StudentTeacher)t[i];
				st.study();
			}
		}
		
	}

}
