package _31;

import java.util.Scanner;

//���� 9095
//���� n�� �־����� ��, n�� 1, 2, 3�� ������ ��Ÿ���� ����� ���� ���ϴ� ���α׷�
// 0 < n < 11


//[n] = [n-1]+[n-2]+[n-3] ��ȭ��(DP)
public class ex31 {
	static int arr[]=new int[1000];
	public static int fuc(int n) {
		if(arr[n] != 0) {
			return arr[n];
		}
		return arr[n] = fuc(n-1) + fuc(n-2) + fuc(n-3); //321
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int res = 0;
		arr[1] = 1; // 1=1
		arr[2] = 2; // 1+1 , 2=2
		arr[3] = 4; // 1+1+1 , 2+1 , 1+2 ,3=3
		//arr[4] = 7;  1+1+1+1 , 2+1+1, 1+2+1 , 1+1+2 , 3+1 , 1+3 ,4=4
		for(int i =0; i<a; i++) {
			while(sc.hasNextInt()) {
				int n = sc.nextInt();
			
					res = fuc(n);	
					System.out.println(res);	
			
			}
		}


	}
}
