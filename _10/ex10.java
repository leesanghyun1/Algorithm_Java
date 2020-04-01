package _10;

import java.util.Scanner;

//지그재그 숫자 사격형 N행 N열
public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("수입력:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int arr[][] = new int[n][n];

		int num = 1;
		for(int i = 0; i < n; i++ ) {
			if(i % 2 == 0) {
				for(int j = 0; j < n; j++ ) {	
					arr[i][j] = num;  //i * n + j + 1; 가능
					num++;
				}
			}else {
				for(int j = n-1; j >= 0; j-- ) {	
					arr[i][j] = num;	//i * n + n - j; 가능 
					num++;
				}
			}		
		}
		
		for(int i = 0; i < n; i++ ) {
			
				for(int j = 0; j < n; j++ ) {
					System.out.print("\t" + arr[i][j]);
				}

				System.out.println();
			}
		
		
		}//main
}
