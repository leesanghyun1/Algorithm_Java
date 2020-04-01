package _11;

import java.util.Scanner;

//숫자 사격형  
//1 4 7
//2 5 8
//3 6 9
public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("수입력:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int num = 1;
		int arr[][] = new int[n][n];


		for(int i = 0; i < n; i++ ) {
				for(int j = 0; j < n; j++ ) {	
					arr[j][i] = num;
					num	++;
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
