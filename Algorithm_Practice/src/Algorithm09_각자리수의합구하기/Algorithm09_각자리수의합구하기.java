package Algorithm09_각자리수의합구하기;

import java.util.Scanner;

public class Algorithm09_각자리수의합구하기 {

	public static void main(String[] args) {
		/*
		 * 입력된수의 각 자리수의 합 구하기
		 * 입력1256
		 * 출력 14
		 * 
		 * 내가 생각한 접근 법
		 * 1. 문자열로 입력받는다
		 * 2. 모든 자리를 substring을 이용해서 하나하나 분리하고 Integer.parseInt를 이용해 정수형으로 바꾼다
		 * 3. 분리해낸 정수를 i가 증가할 때 마다 result변수에 더해서 담는다
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		int result =0;
		
		for(int i = 0 ; i<input.length() ; i ++) {
			result += Integer.parseInt(input.substring(i,i+1));
			
		}
		
		System.out.println(result);
		
		
		
		/*
		 * 강의에서의 접근법 
		 * 입력된 값을 10으로 계속 나눠서 몫과 나머지를 취한다
		 * 
		 * 몫이 0이되면 반복을 중지한다
		 * 
		 */
		
		int input2 = sc.nextInt();
		int result2 =0;
		while(input2>0) {
			result2 += input2%10;
			input2 /= 10;
			
		}
		
		System.out.println(result2);
		
	}

}
