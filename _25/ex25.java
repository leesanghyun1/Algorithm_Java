package _25;
//색칠 재귀  0->2 

public class ex25 {
	static final int SIZE = 5; //final - 변경 불가능 하도록 선언
	static final int COLOR = 2;
	
	
	static int [][]map = {
			{0,0,0,0,0},
			{0,0,1,1,0},
			{0,0,0,0,1},
			{0,0,0,0,0},
			{0,0,1,0,0}
	};
				
	
	public static void color(int n1, int n2) {
		
		if(map[n1][n2] != 1){
			map[n1][n2] = COLOR;
		}
		
		if(n2 < SIZE-1) {
			n2++;
			color(n1,n2);		
		}
		if(n2 == SIZE-1) {
			if(n1 != SIZE-1) {
				n2 = 0;
				n1++;
				color(n1,n2);	
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i < SIZE ; i ++) {
			for(int j = 0 ; j < SIZE ; j ++) {
				System.out.print(map[i][j]+" ");	
			}
			System.out.println();	
		}
		
		
		System.out.println();
		System.out.println();
		
		color(0,0); 
		
		for(int i = 0 ; i < SIZE ; i ++) {
			for(int j = 0 ; j < SIZE ; j ++) {
				System.out.print(map[i][j]+" ");	
			}
			System.out.println();	
		}
	
	
	}
}
