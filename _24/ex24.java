package _24;

import java.util.Scanner;

//��� �Լ�

public class ex24 {
	
	public static int fac(int n) {  //��� ���丮��
		if(n == 1) {
			return 1;
		}
		
		return n * fac(n - 1);
	}
	
	public static int sum(int n1, int n2) {  //��� �� - �Էµ� �� �� ������ �� 
		
			if(n1 == n2) {
				return n2;
			}
			
			return n1 + sum(n1 + 1, n2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���丮��:");
		int n = sc.nextInt();
		int res = fac(n);


		System.out.println("���丮��: " + res);	
		
		System.out.print("�μ��� ��:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int res1 = sum(n1,n2);


		System.out.print("��: " + res1);	
		
		
	}

}
