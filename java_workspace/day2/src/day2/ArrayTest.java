package day2;

import java.text.DecimalFormat;

public class ArrayTest {

	public static void main(String[] args) {
		// 5명 학생 시험점수 저장 배열 선언, 생성
		String names [] = new String[5];
		int scores[][];
		scores = new int [names.length][3];
		double avg [] = new double[names.length];
		
		//학생 이름 저장
				names[0] = "홍미미";
				names[1] = "이민정";
				names[2] = "서형준";
				names[3] = "김범근";
				names[4] = "김우일";
				
		/*
		학생1의 국어 영어 수학 점수
		.
		학생5의 국어 영어 수학 점수
		
		난수 1-100 난수 발생 초기화 출력
		각 학생별 3과목 실수평균 avg 배열 저장후 출력
		*/
		
		for(int i = 0; i < scores.length; i++) {
			int avgScore = 0;
			System.out.print(names[i]+"\t");
			for(int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int)(Math.random()*100)+1;
				System.out.print(scores[i][j]+"\t");
				avgScore += scores[i][j];
			}
			avg[i] = (double)avgScore / scores[i].length;
			//##.## 은 00일땐 표시 안함, ##.00은 00도 표시
			java.text.DecimalFormat dec = new DecimalFormat("##.00");
			System.out.println(dec.format(avg[i]));
			System.out.println();
		}
		//names 배열 - 5명 학생 이름 저장 상태
		//학생 수 증가
		String [] names2 = new String[10];
		
		//names 배열 names2에 복사
		for(int i = 0; i < names.length; i++) {
			names2[i] = names[i];
		}
		for(int i = 0; i < names2.length; i++) {
			System.out.println(names2[i]);
		}
		//for 또다흔 방법 (jdk 1.5추가)
		for(String n : names2) {
			System.out.println(n);
		}
	}

}
