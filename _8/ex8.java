package _8;

import java.util.Scanner;

//���ڸ��� �� ���ϱ�
public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���Է�:");
		
		int n = scan.nextInt();
		int sum = 0 ;
		while(n >= 1) {
			sum += n % 10;
			n = n / 10;
		}
		System.out.print("�� �ڸ��� ��" + sum);
	}

}
