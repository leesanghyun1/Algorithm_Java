package _8;

import java.util.Scanner;

//각자리수 합 구하기
public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("수입력:");
		
		int n = scan.nextInt();
		int sum = 0 ;
		while(n >= 1) {
			sum += n % 10;
			n = n / 10;
		}
		System.out.print("각 자리의 합" + sum);
	}

}
