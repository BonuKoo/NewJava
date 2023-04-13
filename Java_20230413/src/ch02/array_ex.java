package ch02;

public class array_ex {

	public static void main(String[] args) {
		int sum = 0;		//총점
		double average = 0;	//평균
		//1. score 배열 생성
		int[] score = {79,88,91,33,90,100,95};
		
		//2. score 배열 총점과 평균
		int max = score[0];				//변수max값을 우선 배열 첫번째
		int min = score[0];				//변수 min 값 반복
		
		{for (int i=0; i<score.length; i++) {
			sum +=score[i];    //score 값을 다 더함
		}
		average = (double)sum / score.length; //형변환
			
		System.out.println("총점 :" + sum);
		System.out.println("평균 :" + average);
		}//2의 끝
		
		//3. score 배열 최대값과 최소값
		{for (int i=1; i<score.length; i++) {
			if(score[i]>max) {
				score[i]=max;
			}
			if(score[i]<min) {
				score[i]=min;
			
			}
		}
		System.out.println("max값:"+max);
		System.out.println("min값:"+min);
		}//3의 끝
		
		//4. score값 섞기
		{for (int i=0; i<score.length; i++) {
			(int j=0; j<score.length; j++) { 
			if()
			int tmp = score[i];
			score[i] = score[j];
			score[j] = tmp;
			
			}	
		}
		
		}//4의 끝
		}
		}
