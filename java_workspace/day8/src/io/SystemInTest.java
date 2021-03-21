package io;

import java.io.IOException;
import java.io.InputStream;

public class SystemInTest {

	public static void main(String[] args) {
		System.out.println("키보드 입력을 시작하세요");
		//키보드 입력 종료(Ctrl+z)될 때까지 입력
		//1바이트씩 읽어옴, 한글은 읽어올 수 없음
//		try {
//			while(true) {
//				int result = System.in.read();
//				System.out.println((char)result);
//				if(result == -1) { // 엔터키->13
//					break;
//				}
//			}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
		//System.in.read(); // 0-> 48, A->65, a->97
		
		try {
				InputStream is = System.in;
				byte b[] = new byte[100];
				
				int cnt = is.read(b); //키보드 1바이트 입력 b 배열 저장, cnt:입력갯수
				String inputString = new String(b,0,cnt);//한글 1문자 2바이트
				
				System.out.println(inputString);
				
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
