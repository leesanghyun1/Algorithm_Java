package _22;

import java.util.Scanner;

// 백준2920
// c-1, d-2, e-3, f-4, g-5, a-6, b-7, C-8
// 1-8 차례대로 -> ascending
// 8-1 차례대로 -> descending
// 둘다아니면 mixed
// 12345678

public class ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[8];
		
		for(int i = 0; i < 8; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean aflag = true;
		boolean bflag = true;
		
		
		for(int i = 1; i < 8; i++) { //12345678
			if(arr[i] - arr[i-1] != 1) {
				aflag = false;
				break;
			}
		}
		
		for(int i = 1; i < 8; i++) {
			if(arr[i] - arr[i-1] != -1) {
				bflag = false;
				break;
			}
		}
		
		if(aflag) {
			System.out.print("ascending");	

		}else if (bflag) {
			System.out.print("descending");
		}else {
			System.out.print("mixed");
		}
		
	}

}
