package _1;

public class Student {
	private String name,no;
	
	public Student(String name, String no) {	//생성자
		super();
		this.name = name;
		this.no = no;
	} //name, no 받아서 초기화 함

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

}
