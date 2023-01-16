package Algorithm04_10진수를2진수로;

public class Algorithm04_다른풀이방법들 {
	//Integer 클래스의 함수를 사용하면 쉽게 변환이 가능
	//Integer 클래스의 toBinaryString, toOctalString, toHexString 함수를 사용하면 
	//각각 2진수,8진수 16진수로 변환
	
	
	//반대로 2진수, 8진수, 10진수로 변환하기 위해서는 Integer 클래스의 parseInt 를 사용하여
	// 쉽게 변환이 가능하다 
	//parseInt 는 문자열을 숫자로 변환시킨다 
	public static void main(String[] args) {
		
		int i = 167;
		
		String binaryString = Integer.toBinaryString(i);
		String octalString = Integer.toOctalString(i);
		String hexString = Integer.toHexString(i);
		
		System.out.println(binaryString);
		System.out.println(octalString);
		System.out.println(hexString);
		
		
		int binaryToDecimal = Integer.parseInt(binaryString, 2);
		int binaryToOctal = Integer.parseInt(octalString,8);
		int binaryToHex = Integer.parseInt(hexString,16);
		
		System.out.println(binaryToDecimal);
		System.out.println(binaryToOctal);
		System.out.println(binaryToHex);
		
		
	}

}
