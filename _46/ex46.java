package _46;

//�÷��̵� �ͼ� �˰���
	//��� �������� ��� ���������� �ִܰ�� �˰���
	//���İ��� ��带 �������� �ٷ�
	//3�� for������ n^3 �ð����⵵
	
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
		//���İ��� ���
		for(int k = 0; k < num; k++) {
			//��߳��
			for(int i = 0; i < num; i++) {
				//�������
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
