package Algorithm02;

public class Algorithm02_2 { // 배열없이 푸는 법

	public static void main(String[] args) {
		
		int ppn = 1;
		int pn = 1;
		
		System.out.println(ppn+ "\n"+pn);
		
		for (int i =3; i<10; i++) {
			int curNum = ppn+pn; 
			System.out.println(curNum);
			
			ppn =pn;
			pn=curNum;
			
		}
		
	}

}
