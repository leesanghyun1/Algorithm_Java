package _44;

public class ex45 {
// ���ͽ�Ʈ�� �˰���
	//�ϳ��� �������� �ٸ���� �������� ���� �ִܰŸ�
/*	
	1. ��ٳ�弳��
	2. ��߳�� ��������  ��  ��� �ּҺ�� ����
	3. �湮���� ���� ��� �� ���� ��������� ��� ����
	4. �ش��� ���� �ٸ� Ư���� ���� ���� ����� �� ����� �ּҺ�� ����
	5. �� 3~4 �����ݺ� 
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
	
	static boolean v[]=new boolean[6]; //�湮�� ���
	static int d[]=new int[6]; //��� �Ÿ� 
	//���õ� ��忡�� ���� ª���Ÿ��� ���� �ε��� ������
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
	
	//���ͽ�Ʈ�� 
	public static void dijkstra(int start) {
		//d�迭�� ������  ���� ������� ���� �Ÿ� �ֱ�
		for(int i=0; i<number; i++) {
			d[i] = a[start][i];
		}
		//������ �湮ó��
		v[start]=true; 
		//���� �湮���� ���� ���
		for(int i=0; i < number -2; i++) {
			int min = getSmall(); //���õ� ��忡�� ���� ª���Ÿ��� ���� �ε��� ������
			v[min]= true;
			for(int j=0; j < number; j++) {
				if(!v[j]) {//�湮���� ������ ��
					//���纸���ִ� �� ������ �� �ּ� ��뿡�� �� ��带 ���� ���� ���� ���� ���� ���� �� ������ ���� ���� �ּҰ� ���� �۴ٸ� ����
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
