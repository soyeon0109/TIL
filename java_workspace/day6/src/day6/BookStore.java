package day6;

class Book{
	private String title;
	private int price;
	
	Book() {}
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
class BookMgr/*extends Object*/{
	Book booklist[];
	BookMgr(Book booklist[]){
		this.booklist = booklist;
	}
	
	
	@Override
	public String toString() {
		String result = "";
		int total=0;
		//booklist 배열 저장 객체 수만큼 반복, 제목 |이름
		for(int i = 0; i < booklist.length; i++) {
			result += String.format
					("%-20s", booklist[i].getTitle())+"|"+booklist[i].getPrice()+"\n";
			total += booklist[i].getPrice();		
		}
		result += "전체 책 가격의 합 : "+ total;
		return result;
	}
	
}
public class BookStore {

	public static void main(String[] args) {
		//5개 Book 객체 배열
		Book booklist[] = new Book[5];

		Book book1 = new Book("Java Program", 25000);
		Book book2 = new Book("JSP Program", 15000);
		Book book3 = new Book("SQL Fundamentals", 30000);
		Book book4 = new Book("JDBC Program", 28000);
		Book book5 = new Book();
		book5.setTitle("Spring Program");
		book5.setPrice(34000);
		
		//booklist 배열에 저장 초기화
		booklist[0] = book1;
		booklist[1] = book2;
		booklist[2] = book3;
		booklist[3] = book4;
		booklist[4] = book5;
		
		BookMgr mgr = new BookMgr(booklist);
		System.out.println("=== 책 목록  정보 ===");
		System.out.println(mgr/*toString*/);//패키지명.클래스명@16진수 주솟값. Object 상속 그대로
	}

}
