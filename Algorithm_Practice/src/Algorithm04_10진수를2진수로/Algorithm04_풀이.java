package Algorithm04_10진수를2진수로;

public class Algorithm04_풀이 {

	public static void main(String[] args) {
		int inputNum = 19;
		int bin[] = new int[100];
		
		int i = 0; // bin변수에 인덱스를 카운트 하기 위한 것 
		int temp = inputNum;
		while(temp>0) {
			bin[i] = temp %2;
			temp /=2; // == temp = temp/2  
			i++;
		}
		i--;
		for(; i>=0; i--) {
			System.out.print(bin[i]);
		}
	}

}
