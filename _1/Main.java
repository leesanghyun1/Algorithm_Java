package _1;
import java.util.ArrayList;
import java.util.Scanner;
//�л��̸� �˻��� �й�ã��

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("�̻���","201639303");
		Student st2 = new Student("�ڹο�","201739303");
		Student st3 = new Student("����ȣ","201439303");
		
		
		ArrayList <Student>list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
	
		while(true) {
			System.out.println("�˻��Ϸ��� y �����ϸ� n");
			Scanner scan = new Scanner(System.in);
			String input  = scan.next(); //���ڿ� ����
			
			if(input.equals("y")) {
				System.out.print("�̸��� �Է��ϼ���:");
				String name  = scan.next(); //���ڿ� ����
				boolean flag=false;
				
				for(Student stu: list) { //ArrayList �ȿ� ���� stu�� �� �־���
					if(stu.getName().equals(name)) {
						System.out.println("�й�: "+stu.getNo());
						flag=true;
					}
				}
				
				if(!flag) {
					System.out.println("���� �̸��Դϴ�.");
				}
			}
			else if(input.equals("n")) {
				System.out.println("�����մϴ�.");
				break;
			}else {
				System.out.println("y,n�߿� �Է� �ϼ���.");
			}
		
		}
		
	}

}
