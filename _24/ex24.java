package _24;

import java.util.Scanner;

//재귀 함수

public class ex24 {
	
	public static int fac(int n) {  //재귀 팩토리얼
		if(n == 1) {
			return 1;
		}
		
		return n * fac(n - 1);
	}
	
	public static int sum(int n1, int n2) {  //재귀 합 - 입력된 두 수 까지의 합 
		
			if(n1 == n2) {
				return n2;
			}
			
			return n1 + sum(n1 + 1, n2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("팩토리얼:");
		int n = sc.nextInt();
		int res = fac(n);


		System.out.println("팩토리얼: " + res);	
		
		System.out.print("두수의 합:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int res1 = sum(n1,n2);


		System.out.print("합: " + res1);	
		
		
	}

}
