package _19;

import java.util.Scanner;

//백준2908 
//두수입력후 거꾸로 뒤집어서 누가 더 큰지
public class ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
			
			int res1 = ((n1 / 100) + ((n1 / 10) % 10) * 10 + (n1 % 10)*100 );
			int res2 = ((n2 / 100) + ((n2 / 10) % 10) * 10 + (n2 % 10)*100 );
		
			if(res1 < res2) {
				System.out.print(res2);	
			}
			
			if(res1 > res2){
				System.out.print(res1);	
			}
			
	}

}
