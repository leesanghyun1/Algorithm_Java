package _3;

import java.util.ArrayList;
import java.util.Scanner;

//2진수 구하기
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("수입력:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> bin = new ArrayList<>();
		
		while(true) {
			bin.add(n%2);
			n=n/2;
			if(0 == (n/2)) {
				bin.add(n%2);
				break;
			}
		}
		
		for(int i=bin.size()-1; i>=0; i--) {
			System.out.print(bin.get(i));
		}
	}
}
