package _16;

import java.util.Scanner;

//�Ӹ���� �Ǻ� - ��� �������� ��Ī  ex) 12321

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String n = "1235321";		
		int len = n.length();
		boolean flag =true;
		
		for(int i = 0; i < len/2; i++) {
			if(n.charAt(i) != n.charAt(len-(i+1))) {
					flag = false;		
			}
		}
		if(flag) {
			System.out.print("�Ӹ���� o");
		}else{
			System.out.print("�Ӹ���� x");
		}
		
	}

}
