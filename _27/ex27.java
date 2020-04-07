package _27;

import java.util.Scanner;

//재귀
//입력된 수 높은자리 수 부터 출력 
public class ex27 { //1 2 7 3
	static int tmp = 0;
	public static void fun(int n) {
		
		if(n/10 == 0) {
			System.out.println(n);
			return;
		}
		
		fun(n / 10);
		
		System.out.println(n % 10);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		fun(n);
		
	}

}
