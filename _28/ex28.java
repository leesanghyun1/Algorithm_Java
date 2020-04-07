package _28;

import java.util.Scanner;

//이진수로 변환 재귀
public class ex28 {
	public static void bin(int n) {
		if(n / 2 == 0 ) {
			System.out.print(n);	
			return;
		}
		bin(n / 2);
		System.out.print(n % 2);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		bin(n);
	}

}
