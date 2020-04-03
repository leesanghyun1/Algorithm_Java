package _18;

import java.util.Scanner;

//백준1110
//N이 주어졌을 때 N의 사이클 길이 구하기
//26 -> 2+6 = 8 -> 6+8 = 14 -> 8+4 = 12-> 4+2 = 6 (4사이클)
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
				b = n % 10;	//처음수의 일의자리
				n = n / 10;	//처음수의 십의자리
				a = b+n; 
				if(a >= 10) {	//10 보다 크면 더한수의 일의자리 a에 저장 
					a = a % 10;	
				}
				n = a + (b * 10); //더하기 전 수 일의자리, 더하기 후 일의자리 붙이기
				num++;	//사이클 계산 
				if(n == re) {	//처음 입력한 수로 돌아오면 종료
					break;
				}
			}
			System.out.print(num);
			
	}

}