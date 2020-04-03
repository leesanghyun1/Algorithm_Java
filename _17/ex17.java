package _17;
	
import java.util.*;
//baek4344
//평균 넘는 학생들 비율 반올림해 소수 3재짜리 
public class ex17 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int C = scan.nextInt();
		int[] arr = new int[1001];
		double avg=0;
		
		int N = 0;
		for(int i = 0; i < C; i++) {
			N = scan.nextInt();
			int sum=0;
			int high=0;
			
			for(int j = 0; j < N; j++) {
				arr[j] = scan.nextInt(); 
				sum += arr[j];
				
			}
			avg = (double)sum/N;
			
			for(int j = 0; j < N; j++) {
				if(avg < arr[j]) {
					high++;
				}
			}
			System.out.printf("%.3f",100.0 * high / N);
			System.out.println("%");
		}
		
		scan.close();
		
	}
}
