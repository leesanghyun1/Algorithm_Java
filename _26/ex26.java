package _26;

import java.util.Scanner;

//피보나치 재귀 
//Fn = Fn-1 + Fn-2;
//1 1 2 3 5 8 13 21
public class ex26 {
 
	public static int pb(int n) { //입력된 수 몇번째 항 인지
		if(n == 1||n == 2) {
			return 1;
		}
		return pb(n-1) + pb(n-2) ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int res = pb(n);
		
		System.out.print(res);	

		
	}

}
