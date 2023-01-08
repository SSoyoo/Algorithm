package Algorithm03_최빈수구하기;

import java.util.Scanner;

public class Algorithm03_1 { 

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int[] inputNum = new int[10];
		
		for(int i = 0; i<10; i++) {
			inputNum[i] = sc.nextInt();
			
		//inputNum ={1,2,2,3,1,4,2,2,4,3}
			
		}
		// index = 출현한수
		//index 값 = index(출현횟수)가 몇번 나왔는지 저장하는 용도
		// mode[3] = 5, => 3이라는 숫자가 5번 출현했다
		
		int [] mode =new int[10];
		
		for(int i =0; i<10; i++) {
			mode[inputNum[i]]++;
			//mode[1]++
		
			}
		int modeNum =0;
		int modeCnt =0;
		
		for(int i=0; i<10 ; i++) {
			if(modeCnt<mode[i]) {
				modeCnt =mode[i];
				modeNum = i;
			}
		}
		
		System.out.println("최빈수는:"+modeNum+" 횟수는:"+modeCnt);

		
	}

}
