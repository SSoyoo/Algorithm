package Algorithm01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Student st1 = new Student("이바라","1");
		Student st2 = new Student("나기사","2");
		Student st3 = new Student("히요리","3");
		Student st4 = new Student("쥰","4");
		
		ArrayList<Student>list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
	
	
//		for(Student stu : list) {
//			System.out.println(stu.getName());
//			System.out.println(stu.getNo());		
//			
//		}
	
		Scanner sc = new Scanner(System.in);
	
		
		while(true) {
			System.out.println("검색하고 싶으면 y 종료하고 싶으면 n");
			String input = sc.next();
				
			
			if(input.equals("y")) {
				System.out.println("검색시작");
				String name = sc.next();
				boolean flag = false;
				
				for(Student stu:list) {
					if(stu.getName().equals(name)) {
						System.out.println(stu.getName()+" 학생의 학번은"+stu.getNo());
						flag = true;
					}
				}
				if(!flag) {
					System.out.println("해당하는 학생이 없습니다");
					
				}
				
			}else if(input.equals("n")) {
				break;
			}
		}
		System.out.println("프로그램종료");
		
	}
}
