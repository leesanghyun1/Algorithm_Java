package _29;

public class ex29 {
	static final int SIZE = 5; //final - 변경 불가능 하도록 선언
	static final int APART= 1;
	
	static int aprtCnt = 0;
	static int house[] = new int[10];
	//단지수 3
	//단지의 세대수 3,5,2
	static int [][]map = {
			
			{0,0,0,1,1},
			{0,0,0,0,1},
			{1,0,0,0,1},
			{1,1,0,0,0},
			{1,1,0,1,1}
	};
	
	public static void apt(int n1,int n2,int aprtCnt) {
		map[n1][n2] = 0; // 이미 들렷던곳 0처리
		house[aprtCnt]++;//세대 수 추가
		
		
		if(n2 - 1 >= 0 && map[n1][n2-1] == APART) { //왼쪽에 아파트 이있으면
			apt(n1, n2 - 1, aprtCnt);
		}if(n2 + 1 < SIZE && map[n1][n2+1] == APART) {	//오른쪽에 아파트 있으면
			apt(n1, n2 + 1, aprtCnt);
		}if(n1 - 1 >= 0 && map[n1-1][n2] == APART) { //위쪽에 아파트 이있으면
			apt(n1 - 1, n2, aprtCnt);
		}if(n1 + 1 < SIZE && map[n1+1][n2] == APART) {	//아래쪽에 아파트 있으면
			apt(n1 + 1, n2, aprtCnt);
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
		
		for(int i = 0 ; i < SIZE ; i ++) {  //아파트 있는곳 찾음
			for(int j = 0 ; j < SIZE ; j ++) {
					if(map[i][j] == APART) {
						apt(i,j,aprtCnt);
						aprtCnt ++;
					}
			}	
		}
		
		System.out.println();
		System.out.print("단지 수: "+ aprtCnt);
		System.out.println();
		System.out.print("세대 수: ");
		for(int i : house) {
			if(i !=0) {
			System.out.print(i + ", ");
			}
		}
		
	}

}
