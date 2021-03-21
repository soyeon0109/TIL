package runna;

class Multi1 implements Runnable{
	public void run() {
		for(int i = 1; i<=50; i++) {
			System.out.println(Thread.currentThread().getName() + "다른 작업 수행");
		}
	}
}
public class MultiThreadTest {

	public static void main(String[] args) {
		Multi1 m1 = new Multi1();
		Thread t1 = new Thread(m1);
		//1. Priority + 2. 시간 할당 + 3. 멀티코어-10
		t1.setName("t1");
		t1.setPriority(Thread.MAX_PRIORITY);
		
		
		Multi1 m2 = new Multi1();
		Thread t2 = new Thread(m2);
		
		t2.setName("t2");
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start(); //run() 동시 실행 = 멀티스레드 t1
		t2.start(); //run() 동시 실행 = 멀티스레드 t2
		
		for(int i = 1; i<=50; i++) {
			System.out.println("메인 작업 수행");
		}
	}//main end

}//class end
