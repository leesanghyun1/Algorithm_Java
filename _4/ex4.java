package _4;
//�ҹ��� -> �빮�� ,�빮�� -> �ҹ��� ����

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="helloWorlD";
		char []arr;
		arr = input.toCharArray(); //���ڿ� ��ü�� Array�ϳ��ϳ��� �־���
						//�ҹ��� a~z ������ �빮�� A~Z
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >='a' && arr[i] <= 'z') {
				arr[i] = (char)(arr[i] +('A'-'a'));
			}else if(arr[i] >='A' && arr[i] <= 'Z'){
				arr[i] = (char)(arr[i] -('A'-'a'));
			}
			
		}
		System.out.print(arr);	
	}

}
