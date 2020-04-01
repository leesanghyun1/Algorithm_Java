package _13;

import java.util.Scanner;

//입력된 숫자의 갯수 구하기
public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 421314210;
		//421314218
		
		int []num = new int[10];
		int []temp = new int[10];
		int a=0;
	
		while(n >= 1) {
			num[(n % 10)]++;
			n = (n/10);
			a++;
		}
	
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i+": "+num[i]);	 
		}
	
	
	}

}
