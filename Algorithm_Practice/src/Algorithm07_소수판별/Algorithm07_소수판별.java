package Algorithm07_소수판별;

import java.util.Scanner;

public class Algorithm07_소수판별 {

	public static void main(String[] args) {
		/*
		 *소수: 1과 자기자신으로 밖에 나누어지지 않는 수 
		 *접근 방법 : 주어진 수를 나누어서 나머지가 0인경우를 카운트한다
		 *소수는 나머지가 0인 경우가 1과자신, 즉 2가지 밖에 없으므로
		 *반복문이 끝나고 카운트가 2이면 소수다
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0; 
		
		for (int i = 0 ; i<n ; i ++) {
			if(n%(i+1) == 0) {
				count ++;
			}
		}
		
		if(count == 2) {
			System.out.println("소수입니다");
		}else {
			System.out.println("소수가 아닙니다");
		}
	}

}
