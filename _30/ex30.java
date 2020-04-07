package _30;

import java.util.Scanner;

//백준 1673 
//치킨 교환권 n개 , 도장 k개 -> 도장 k개 -당 치킨 교환권 1개 

public class ex30 {							
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {  
			int n = sc.nextInt();
			int k = sc.nextInt();
			int stamp = 0;
			int sum = 0;
			
			stamp = n;
			sum = n;
			while(stamp >= k) { // 8/3 - 2 -> sum = 2*3 -> n= 2+2
				stamp -= k;
				sum++;
				stamp++;
			}
			System.out.print(sum);	
		
		}
	}
}
	