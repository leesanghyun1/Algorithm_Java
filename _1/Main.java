package _1;
import java.util.ArrayList;
import java.util.Scanner;
//학생이름 검색해 학번찾기

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("이상현","201639303");
		Student st2 = new Student("박민웅","201739303");
		Student st3 = new Student("나정호","201439303");
		
		
		ArrayList <Student>list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
	
		while(true) {
			System.out.println("검색하려면 y 종료하면 n");
			Scanner scan = new Scanner(System.in);
			String input  = scan.next(); //문자열 받음
			
			if(input.equals("y")) {
				System.out.print("이름을 입력하세요:");
				String name  = scan.next(); //문자열 받음
				boolean flag=false;
				
				for(Student stu: list) { //ArrayList 안에 값들 stu에 다 넣어줌
					if(stu.getName().equals(name)) {
						System.out.println("학번: "+stu.getNo());
						flag=true;
					}
				}
				
				if(!flag) {
					System.out.println("없는 이름입니다.");
				}
			}
			else if(input.equals("n")) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("y,n중에 입력 하세요.");
			}
		
		}
		
	}

}
