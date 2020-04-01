package _5;
//최대공약수 , 최공배수
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 24;
		int num2 = 16;
		int small,big;
		int a = 0;
		int b = 1;
		
		if(num1 > num2) {
			big = num1;
			small = num2;
		}else{
			big = num2;
			small = num1;
		}
		
		//최대공약수
		for(int i = 1; i <= small; i++) {
			if(big % i == 0 && small % i == 0) {
				a = i;
			}
		}
		
		//최소공배수
		int []arr = new int[20];
		int n=0;
		
		int i=2;
		while(true) {
			if(big % i == 0 && small % i == 0) {
				arr[n] = i;
				n++;
				big = big/i;
				small = small/i;
				i=2;
			}else {
				i++;
			}
			
			if(i > small) {
				break;
			}
		}
		
		for(int j = 0; j < arr.length; j++) {
			if(arr[j]!=0) {				
				b = b * arr[j];
			}
		}
		b = b * big * small;

		System.out.println("최대공약수:" + a);
		System.out.println("최소공배수:" + b);
	}

}
