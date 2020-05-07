package _46;

//플로이드 와샬 알고리즘
	//모든 정점에서 모든 정점으로의 최단경로 알고리즘
	//거쳐가는 노드를 중점으로 다룸
	//3중 for문으로 n^3 시간복잡도
	
class floyWarshall{
	private int num = 4;
	private int INF = 1000000;
	private int [][]map = {
			{0,5,INF,8},
			{7,0,9,INF},
			{2,INF,0,4},
			{INF,INF,3,0}
	};
	
	public int [][]d = new int [num][num];
	
	public void floy() {
		
		for(int i =0; i<num; i++) {
			for(int j =0; j<num; j++) {
				d[i][j] = map[i][j];
			}
		}
		//거쳐가는 노드
		for(int k = 0; k < num; k++) {
			//출발노드
			for(int i = 0; i < num; i++) {
				//도착노드
				for(int j = 0; j < num; j++) {
					if(d[i][k] + d[k][j] < d[i][j]) {
						d[i][j] = d[i][k]+d[k][j];
					}
				}
			}
		}
		get();
	}
	public void get() {
		for(int i = 0; i < num; i++) {
			for(int j =0; j < num; j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}

public class ex46 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		floyWarshall f = new floyWarshall();
		f.floy();
	}

}
