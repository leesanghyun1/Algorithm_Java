package _20;
//달팽이 출력

//1  2  3
//8  9  4
//7  6  5

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		
		int n = 0;
		int s = 1; //부호 바꾸는 변수
		
		int num[][] = new int[k][k];
			
			int a1 = 0;
			int a2 = -1;
			
			while(true) {
				for(int i = 0; i < k; i++) {
					n++;
					a2 += s;
					num[a1][a2] = n;
				}
				
				k --;
				
				if(k == 0) {
					break;
				}
				
				for(int i = 0; i < k; i++) {
					n++;
					a1 += s;
					num[a1][a2] = n;
					
				}
				s = s * (-1);	
			}
			
			
			for(int a = 0; a < num.length; a++) {
				for(int b = 0; b < num.length; b++) {
					System.out.print(num[a][b] + "\t");
				}	
				System.out.println();
			}
			
	}

}
