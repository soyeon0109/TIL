package day6;

//동시 실행 내용 생기면 멀티스레드 코드 작성
//동시 실행중에 특정 객체 접근시 SYNCHRONIZED 블록 순서 지키고 1번에 1개 스레드 접근
//===> singleton 패턴 자주 등장
//스레드 내부 이미 구현 완성 api
class MyStack{
	char[] ch = new char[10];
	int idx = 0;
	void push(char c) {
		synchronized (ch) { //lock 해제
			//스레드 수행 속도 느려질 수 있다.
			ch[idx] = c;
			System.out.println(Thread.currentThread().getName()+ " , idx= "+ idx +" , ch[idx]= "+ ch[idx]);
			idx++;
		}//lock 설정
	}
}

class MyStackThread extends Thread{
	MyStack st;
	char c;
	
	MyStackThread(MyStack st, char c){
		this.st = st;
		this.c = c;
	}
	public void run() {
		for(int i = 1; i <= 5; i++) {
			st.push(c);
		}
	}
}
public class SynchronizedTest {

	public static void main(String[] args) {
		MyStack st = new MyStack();
		MyStackThread t1 = new MyStackThread(st, 'a');
		MyStackThread t2 = new MyStackThread(st, 'b');
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();

	}

}
