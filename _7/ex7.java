package _7;
//팩토리얼 구하기

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("수입력:");
		
		int num = scan.nextInt();
		int n = num;
		int a = 1;
		for(int i = 1; i <= n; i++ ) {
			a = a * i;
		}
			System.out.print(num + "! 값은" + a +"입니다.");
	}

}
