package Algorithm05_대소문자변환;

public class Algorithm05대소문자변환 {

	public static void main(String[] args) {
		/*
		 * 문제
		 * 대문자는 소문자로ㅡ 소문자는 대문자로 변환하시오
		 * helloWrolD
		 * 출력 : HELLOwORLd
		 * 배열, for, if
		 * 
		 * 
		 * String.toCharArray() -> 문자열을 하나씩 쪼개서 char 타입의 배열에 넣어주는 메소드
		 * // 소문자 a보다 크거나 같거나, 소문자 z보다 작거나 같으면 소문자이다
		 */
		
		String input = "helloWorLD";
		
		char [] arr;
		arr = input.toCharArray();
		
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] >= 'a' && arr[i]<='z') {
				arr[i] = (char)(arr[i]+('A'-'a'));
			}else if(arr[i] >='A' && arr[i]<='Z') {
				arr[i] = (char)(arr[i]-('A'-'a'));
			}
		}
		
		
		
		
		
		System.out.println(arr);
		
		
	}

}
