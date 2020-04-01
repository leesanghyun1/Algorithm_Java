package _12;
//숫자 사격형

import java.util.Scanner;

//1	 2	3	4
//2	 4	6	8
//3	 6	9	12
//4	 8	12	16
public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("수입력:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int num = 1;
		int arr[][] = new int[n][n];
		
	/*	for(int i = 0; i < n; i++ ) {
				for(int j = 0; j < n; j++ ) {	
					arr[i][j] = num;
					num	+= i+1 ;
				}
				num=i+2;
		}
	*/
		for(int i = 0; i < n; i++ ) {
			for(int j = 0; j < n; j++ ) {	
				arr[i][j] = (i + 1)*(j + 1);
			}
		}

		
		for(int i = 0; i < n; i++ ) {
			
				for(int j = 0; j < n; j++ ) {
					System.out.print("\t" + arr[i][j]);
				}

				System.out.println();
			}
	}

}
