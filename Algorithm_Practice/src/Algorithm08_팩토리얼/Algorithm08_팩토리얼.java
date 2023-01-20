package Algorithm08_팩토리얼;

import java.util.Scanner;

public class Algorithm08_팩토리얼 {

	public static void main(String[] args) {
	
		
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int result = 1;
	
	for(int i =0; i<n ; i++	) {
		
		result *= (i+1);
		
		
	}
	System.out.println(result);	
	}

}
