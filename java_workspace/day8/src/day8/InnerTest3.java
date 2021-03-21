package day8;

public class InnerTest3 {

	public static void main(String[] args) {
		int out = 10; //jdk 8 이전에는 final 선언해야만 Inner 클래스에서 사용 가능했다.
		class Inner{
			public int count() {
				int cnt = 0;
				for(int i = 0; i < out; i++) {
					cnt += i;
				}
				return cnt; //0-9 총합
			}//count end
		}//class inner end
		
		System.out.println(new Inner().count());

		//지역 내부 클래스 
		//interface Runnable { public void run();}
/*	방법 1
 * 		class RunnableSub implements Runnable{
			@Override
			public void run() {
				System.out.println("실행중");
			}
		}
		//지역 내부 객체 생성
		RunnableSub sub = new RunnableSub();
		//메소드 호출
		Thread t1 = new Thread(sub);
		t1.start();
*/		
/* 빙법 2
 * 		Runnable sub = new Runnable() {
			@Override
			public void run() {
				System.out.println("실행중");
			}
		};
		Thread t1 = new Thread(sub);
		t1.start();
*/		
/* 방법3
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("실행중");
			}
		});
		t1.start();
*/
		//방법 4
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("실행중1111");
			}
		}).start();
		
		new Thread(()->{System.out.println("실행중2222");}).start();
		
		myInter i = new myInter() {
			public void mi1() {
				System.out.println("mi1");
			}
			public void mi2() {
				System.out.println("mi2");
				mi3(); //가능
				System.out.println(name); // 가능
			}
			String name = "100";
			public void mi3() {
				System.out.println("하위 추가 메소드");
			}
		};
		//자동 형변환 이후 myInter 포함 메소드만 호출 가능
		i.mi1();
		i.mi2();
		//i.mi3(); //호출 불가능
		
	}//main end

}

interface myInter {
	/*public abstract*/ void mi1();
	void mi2();
}



