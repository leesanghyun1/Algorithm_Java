package _41;

import java.util.Scanner;
//�ڵ�� 1098
public class ex41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h,w,n,l,d,x,y;
		
		x=0;
		y=0;
		d=0;
		Scanner sc = new Scanner(System.in);
		 h = sc.nextInt(); //�ٵ��� ����
		 w = sc.nextInt(); //�ٵ��� �ʺ�
		 
		 n = sc.nextInt(); //���� ����

		 int arr[][] = new int [h+1][w+1];
		 
		 for(int i = 1; i <=h; i++) {
			 for(int j = 1; j <= w; j++) {
				 arr[i][j]=0;
			 } 
		 }
		 
		 
		 for(int i=0; i<n; i++) {
			 l = sc.nextInt(); //�������
			 d = sc.nextInt(); //0���� 1 ����
			 x = sc.nextInt(); //x��ǥ
			 y = sc.nextInt(); //y��ǥ	 

			 
			 if(d==0) { //����
				 for(int j=0; j<l; j++) {

					 arr[x][y]=1;
					 y++;//l��ŭ 
				 }
			 }else {
				 for(int j=0; j<l; j++) {
					 arr[x][y]=1;
					 x++;//l��ŭ 
				 }
			 }
		 }

		 for(int i = 1;i <= h; i++) {
			 for(int j = 1; j <= w; j++) {
				 System.out.print(arr[i][j]+" ");	

			 } 
			 System.out.println();	

		 }
		 
	}

}
