package _29;

public class ex29 {
	static final int SIZE = 5; //final - ���� �Ұ��� �ϵ��� ����
	static final int APART= 1;
	
	static int aprtCnt = 0;
	static int house[] = new int[10];
	//������ 3
	//������ ����� 3,5,2
	static int [][]map = {
			
			{0,0,0,1,1},
			{0,0,0,0,1},
			{1,0,0,0,1},
			{1,1,0,0,0},
			{1,1,0,1,1}
	};
	
	public static void apt(int n1,int n2,int aprtCnt) {
		map[n1][n2] = 0; // �̹� ��Ǵ��� 0ó��
		house[aprtCnt]++;//���� �� �߰�
		
		
		if(n2 - 1 >= 0 && map[n1][n2-1] == APART) { //���ʿ� ����Ʈ ��������
			apt(n1, n2 - 1, aprtCnt);
		}if(n2 + 1 < SIZE && map[n1][n2+1] == APART) {	//�����ʿ� ����Ʈ ������
			apt(n1, n2 + 1, aprtCnt);
		}if(n1 - 1 >= 0 && map[n1-1][n2] == APART) { //���ʿ� ����Ʈ ��������
			apt(n1 - 1, n2, aprtCnt);
		}if(n1 + 1 < SIZE && map[n1+1][n2] == APART) {	//�Ʒ��ʿ� ����Ʈ ������
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
		
		for(int i = 0 ; i < SIZE ; i ++) {  //����Ʈ �ִ°� ã��
			for(int j = 0 ; j < SIZE ; j ++) {
					if(map[i][j] == APART) {
						apt(i,j,aprtCnt);
						aprtCnt ++;
					}
			}	
		}
		
		System.out.println();
		System.out.print("���� ��: "+ aprtCnt);
		System.out.println();
		System.out.print("���� ��: ");
		for(int i : house) {
			if(i !=0) {
			System.out.print(i + ", ");
			}
		}
		
	}

}
