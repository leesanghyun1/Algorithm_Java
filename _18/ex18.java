package _18;

import java.util.Scanner;

//����1110
//N�� �־����� �� N�� ����Ŭ ���� ���ϱ�
//26 -> 2+6 = 8 -> 6+8 = 14 -> 8+4 = 12-> 4+2 = 6 (4����Ŭ)
public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int a = 0;
		int b = 0;
		int re = n;
		int num = 0;

			
			while(true) {
				b = n % 10;	//ó������ �����ڸ�
				n = n / 10;	//ó������ �����ڸ�
				a = b+n; 
				if(a >= 10) {	//10 ���� ũ�� ���Ѽ��� �����ڸ� a�� ���� 
					a = a % 10;	
				}
				n = a + (b * 10); //���ϱ� �� �� �����ڸ�, ���ϱ� �� �����ڸ� ���̱�
				num++;	//����Ŭ ��� 
				if(n == re) {	//ó�� �Է��� ���� ���ƿ��� ����
					break;
				}
			}
			System.out.print(num);
			
	}

}