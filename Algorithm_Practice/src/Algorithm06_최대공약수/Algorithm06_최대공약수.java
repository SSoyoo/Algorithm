package Algorithm06_최대공약수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Algorithm06_최대공약수 {

	public static void main(String[] args) {
		/*
		 * 입력된 두 수의 최대공약수를 구하시오
		 * 
		 * 최대공약수 : 공통되는 약수 중 가장 큰 수 
		 * 약수 : 어떤 수를 나누어서 나머지가 0인 경우
		 * 
		 * a의 약수 구해서 배열에 담기 
		 * b의 약수 구해서 배열에 담기
		 * a와 b가 공통된 약수를 담을 배열 c
		 * 
		 * c에서 가장 큰 수 출력하기 
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = 1;
		
		ArrayList arA = new ArrayList();
		ArrayList arB = new ArrayList();
	
		
		//a약수 구해서 배열에 담기
		
		for (int i = 1; i <=a ;i ++) {
			if (a % i == 0) {
				arA.add(i);
			}
		}
		System.out.println(arA);
		
		//b약수 구해서 배열에 담기
		for (int i = 1; i <=b ;i ++) {
			if (b % i == 0) {
				arB.add(i);
			}
		}
		System.out.println(arB);
	
		
		for (int i = 0; i<arA.size() ; i++) {
			for (int j = 0; j<arB.size(); j++) {
				
				if(arA.get(i) == arB.get(j)) {
					
					if((int)arA.get(i) > gcd) {
						gcd = (int)arA.get(i);
						
					}
				}
				
			}
			
		}
		
		
		System.out.println(gcd);
			
		
			
		
	}
}

