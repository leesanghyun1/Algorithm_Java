package _2;
//�ֺ�� ���ϱ�
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int []num = new int[10];
		int []max = new int[10];
		ArrayList<Integer> maxNum = new ArrayList<>();
		int cnt=0;
		
		System.out.print("1~9 ���� �� 10�� �Է�:");
		for(int i=0; i<10; i++) {
			num[i]=scan.nextInt();
		}
		//���迭 ++
		for(int i=0; i<10; i++) {
			max[num[i]]++;
		}
		//���� �ּҰ�ã��
		for(int i=0; i<10; i++) {
			if(cnt < max[i]) {
				maxNum.set(0,i);
				cnt = max[i];
			}
			if(cnt == max[i]) {	
				maxNum.add(i);
			}
		}

		
		for(int i : maxNum) {
			System.out.println("���� ���� ��:"+maxNum+","+cnt+"��");
		}
	}

	}

