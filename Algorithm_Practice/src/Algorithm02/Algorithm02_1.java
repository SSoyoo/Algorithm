package Algorithm02;

public class Algorithm02_1 {

	public static void main(String[] args) {
		
		//피보나치 수열 출력 배열, for 
		
		long [] arr = new long[100];
		// An = An-1+An-2 n>3 일때부터 
		//a1 = 1 a2 = 1 로 초기화시켜놓고 시작
		// 0,1,1,2,3,5,8,13
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i =2; i<100; i++) {
			arr[i]=(arr[i-1])+(arr[i-2]);
			
		}
		
		for(int i = 0; i<30; i++) {
			System.out.println(arr[i]+" ");
		}
		
	}

}
