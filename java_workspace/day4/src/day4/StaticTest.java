package day4;

class Person{
	// 이름 나이 국적
	String name;
	int age;
	final static String nation="대한민국";
}
public class StaticTest {

	public static void main(String[] args) {
		//객체생성이전, 클래스명.static 변수
		System.out.println(Person.nation);
		Person p1 = new Person();
		p1.name = "박민국";
		p1.age = 20;
		//p1.nation = "미국";
		System.out.println(p1.name + ":"+p1.age +":"+p1.nation);
		Person p2 = new Person();
		p2.name = "김대한";
		p2.age = 30;
		//p2.nation = "대한민국";
		System.out.println(p2.name + ":"+p2.age +":"+p2.nation);

	}

}
