package _21;

import java.util.Scanner;

// 10진수 N n진수로 변환
public class ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n = sc.nextInt();
		char num[] = new char[100];
		int i = 0;
		int tmp;
		
		while(N > 0) {
			tmp = N % n;
			
			if(10 <= tmp && tmp <= 15) {
				num[i] = (char)('A' + (tmp - 10) );
			}else {
				num[i] = (char)('0' + tmp);
			}
			i++;
			N = N / n;
		}
		
		for( ; i >= 0; i--) {
			System.out.print(num[i]);

		}
	}

}
