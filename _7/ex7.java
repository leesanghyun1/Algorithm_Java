package _7;
//���丮�� ���ϱ�

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���Է�:");
		
		int num = scan.nextInt();
		int n = num;
		int a = 1;
		for(int i = 1; i <= n; i++ ) {
			a = a * i;
		}
			System.out.print(num + "! ����" + a +"�Դϴ�.");
	}

}
