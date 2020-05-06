package _41;

import java.util.Scanner;
//코드업 1098
public class ex41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h,w,n,l,d,x,y;
		
		x=0;
		y=0;
		d=0;
		Scanner sc = new Scanner(System.in);
		 h = sc.nextInt(); //바둑판 높이
		 w = sc.nextInt(); //바둑판 너비
		 
		 n = sc.nextInt(); //막대 갯수

		 int arr[][] = new int [h+1][w+1];
		 
		 for(int i = 1; i <=h; i++) {
			 for(int j = 1; j <= w; j++) {
				 arr[i][j]=0;
			 } 
		 }
		 
		 
		 for(int i=0; i<n; i++) {
			 l = sc.nextInt(); //막대길이
			 d = sc.nextInt(); //0가로 1 세로
			 x = sc.nextInt(); //x좌표
			 y = sc.nextInt(); //y좌표	 

			 
			 if(d==0) { //가로
				 for(int j=0; j<l; j++) {

					 arr[x][y]=1;
					 y++;//l만큼 
				 }
			 }else {
				 for(int j=0; j<l; j++) {
					 arr[x][y]=1;
					 x++;//l만큼 
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
