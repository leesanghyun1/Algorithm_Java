package _15;
// 369 ����
public class ex15 {
	 public static int game (int i) { //static -> �޸� ����
		 	int cnt=1;
		 	while(i > 0) {
		 		int b =i % 10;
		 		i = i/10;
		       	if(b == 3 ||b == 6||b == 9) {
		       		cnt =0;
		       		break;
		       	}else {
		       		cnt=1;
		       	}
		 	}
		 	return cnt;
	       		        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		 //ȣ��
		int a = 0;
		
		for(int i = 1; i <100; i++) {
			
			a = game(i);
			if(a == 0) {
				System.out.print("¦  ");	
			}else {
				System.out.print(i+ "  ");
			}
			
			if(i == 50 ) {
				
			System.out.println();	

			}
			
		}
		
			

	}

}
