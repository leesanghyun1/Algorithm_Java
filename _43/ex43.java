package _43;

import java.util.Scanner;

//그리디 알고리즘
//ex 거스름돈
public class ex43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//1270  500 -2 , 100 -2 , 50-1 , 10 -2
		
		while(n != 0) {
			if (n >= 500) {
				  a = n / 500;
				  n = n % 500;
			 }if (n >= 100) {
				  b = n / 100;;
				  n = n % 100;
			 }
			 if (n >= 50) {
				  c = n / 50;;
				  n = n % 50;
			 }
			 if (n >= 10) {
				  d = n / 10;;
				  n = n % 10;
			 }	
			
		}
		System.out.print(" 500:"+a+" 100:"+b+" 50:"+c+" 10:"+d);	

		 
		 
	}

}
