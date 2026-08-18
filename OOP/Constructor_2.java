// Parameterized Constructor

class Constructor_2 {
	String name;
	int roll_no;
	
	Constructor_2(String name , int roll_no) {
		this.name = name;
		this.roll_no = roll_no;
	}
	
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + roll_no);
	}
	
	public static void main(String[] args) {
		String name = "Hari Prasad";
		int roll_no = 15;
		
		Constructor_2 con = new Constructor_2(name,roll_no);
		
		con.display();
	}
}