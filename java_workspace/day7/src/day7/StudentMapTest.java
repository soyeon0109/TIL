package day7;

class Student<T>{
	T id;
	String name;
	int kor, eng, mat;
	int total;
	public Student(T id, String name, int kor, int eng, int mat) {
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	//toString, equals 오버라이딩
	@Override
	public String toString() {
		total = kor + eng + mat;
		return id+"-"+name+"-"+total;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			int total = kor + eng + mat;
			int othersum = ((Student)obj).kor+((Student)obj).eng+((Student)obj).mat;
			// ==연산자 
			if(total == othersum) return true;
			else return false;
		} else return false;
	}
}
public class StudentMapTest {

	public static void main(String[] args) {
		Student<Integer> s1 = new Student<Integer>(100, "김자바", 100, 90, 80);
		Student<String> s2 = new Student<String>("200", "박지원", 100, 100, 70);
		System.out.println(s1); //id-name-총점
		System.out.println(s2);
	
		if(s1.equals(s2)) {
			// 세과목 총점 같으면 true
			System.out.println("두 학생 총점은 같다");
		}
	}

}
