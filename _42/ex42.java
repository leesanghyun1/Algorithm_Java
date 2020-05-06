package _42;

import java.util.Scanner;

//code-up 1099 문제
public class ex42 {
	//(2,2) 에서 시작 오른쪽으로만감 벽만나면 오른쪽을꺽음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int [10][10];
		Scanner sc = new Scanner(System.in);

		
		for(int i = 0; i < 10; i++) {
			 for(int j = 0; j < 10; j++) {
				 arr[i][j] = sc.nextInt();;
			 } 
		 }
		int x = 1;
		int y = 1;
		if(arr[x][y]==2) {
			arr[x][y]=9;
		}else {
			arr[x][y]=9;
			while(true) {
				if(arr[x][y+1] == 2) {
					y++;
					arr[x][y] = 9;
					break;
				}
				
				if(arr[x][y+1] == 0){
					y++;
					arr[x][y] = 9;
					
				}else{
					if(arr[x+1][y] == 0) {
						x++;
						arr[x][y] = 9;	
					}else {
						if(arr[x+1][y] == 2) {
							x++;
							arr[x][y] = 9;	
							break;
						}
						if(arr[x][y+1] == 2) {
							y++;
							arr[x][y] = 9;
							break;
						}
						x--;
						y++;
						arr[x][y] = 9;
					}
				}

				if(x==8 &&y==8) {
					arr[x][y]=9;
					break;
				}
				
			}
		}
		
		
		
		
		for(int i = 0;i < 10; i++) {
			 for(int j = 0; j < 10; j++) {
				 System.out.print(arr[i][j]+" ");	

			 } 
			 System.out.println();	

		 }
		
	}	

}
