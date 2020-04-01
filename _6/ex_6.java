package _6;
//소수인지 판별

import java.util.Scanner;

import javax.sql.rowset.spi.SyncFactory;

public class ex_6 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("수입력:");	
		boolean flag = true;
		
		int n = scan.nextInt();
		
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				flag = false;
			}
		}
		
		if(flag) {
			System.out.print(n + "은 소수 입니다.");	
		}else{
			System.out.print(n  + "은 소수가 아닙니다.");
		}
	}	

}
