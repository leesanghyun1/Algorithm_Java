package _4;
//소문자 -> 대문자 ,대문자 -> 소문자 변경

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="helloWorlD";
		char []arr;
		arr = input.toCharArray(); //문자열 객체를 Array하나하나에 넣어줌
						//소문자 a~z 끝나고 대문자 A~Z
		
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
