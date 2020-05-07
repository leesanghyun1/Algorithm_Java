package _44;

public class ex45 {
// 다익스트라 알고리즘
	//하나의 정점에서 다른모든 정점으로 가는 최단거리
/*	
	1. 출바노드설정
	2. 출발노드 기준으로  각  노드 최소비용 저장
	3. 방문하지 않은 노드 중 가장 비용이적은 노드 선택
	4. 해당노드 거쳐 다른 특정한 노드로 가는 경우의 수 고려해 최소비용 갱신
	5. 위 3~4 과정반복 
	*/
	static int number = 6;
	static int INF = 1000000;
	
	static int a[][] = {
			{0,2,5,1,INF,INF},
			{2,0,3,2,INF,INF},
			{5,3,0,3,1,5},
			{1,2,3,0,1,INF},
			{INF,INF,1,1,0,2},
			{INF,INF,5,INF,2,0}
	};
	
	static boolean v[]=new boolean[6]; //방문한 노드
	static int d[]=new int[6]; //노드 거리 
	//선택된 노드에서 가장 짧은거리를 가진 인덱스 가져옴
	public static int getSmall() {
		int min = INF;
		int num = 0;
		for(int i=0; i < number; i++) {
			if(min > d[i] && !v[i]) {
				min = d[i];
				num = i;
			}
		}
		return num;
	}
	
	//다익스트라 
	public static void dijkstra(int start) {
		//d배열에 시작점  부터 인접노드 까지 거리 넣기
		for(int i=0; i<number; i++) {
			d[i] = a[start][i];
		}
		//시작점 방문처리
		v[start]=true; 
		//현재 방문하지 않은 노드
		for(int i=0; i < number -2; i++) {
			int min = getSmall(); //선택된 노드에서 가장 짧은거리를 가진 인덱스 가져옴
			v[min]= true;
			for(int j=0; j < number; j++) {
				if(!v[j]) {//방문하지 않은것 중
					//현재보고있는 그 노드까지 의 최소 비용에서 그 노드를 거쳐 인접 노드로 가는 값이 현재 그 인접한 노드로 가는 최소값 보다 작다면 갱신
					if(d[min] + a[min][j] < d[j]) { 
						d[j]= d[min] + a[min][j];
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dijkstra(0);
		for(int i=0; i<number; i++) {
			System.out.print(d[i] + " ");	

		}
	}
}
