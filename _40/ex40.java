package _40;

import java.util.Scanner;

//1097 code-up ����100
public class ex40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int x=0;
		int y=0;
		int a[][]=new int[20][20];
		
		Scanner sc = new Scanner(System.in);
		
		// �ٵ��� �Է�
		for(int i=1; i<=19; i++) //�� ��(������ �Ʒ���) ��
		{
		  for(int j=1; j<=19; j++) //�� ��(���ʿ��� ����������) ��
		  {
		   a[i][j] = sc.nextInt();
		  }
		}
		n = sc.nextInt();
		
		for(int i=1; i <= n; i++){

			x = sc.nextInt();
			y = sc.nextInt(); 

			for(int j= 1; j<=19; j++) { //10 10 ,12 12
				if(a[x][j] == 0){
					a[x][j] = 1;	

				}else if(a[x][j] == 1){
					a[x][j] = 0;

				}
			}
			for(int j = 1; j<=19; j++) {
				if(a[j][y] == 0){
					a[j][y] = 1;

				}else if(a[j][y] == 1){
					a[j][y] = 0;

				}
			}
		}
		
		for(int i=1; i<=19; i++) //�� ��(������ �Ʒ���) ��
		{
		  for(int j=1; j<=19; j++) //�� ��(���ʿ��� ����������) ��
		  {
		    System.out.print(a[i][j]+" ");	 //�� ���
		  }
		  System.out.println();	//�� �ٲٱ�
		}
		
	}

}
