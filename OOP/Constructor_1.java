// No Argument Constructor 

class Constructor_1 {
	
	String name;
	int roll_no;
	
	Constructor_1() {
		name = "Hari Prasad";
		roll_no = 15;
	}
	
	public static void main(String[] args) {
		Constructor_1 con = new Constructor_1();
		
		System.out.println("Name: " + con.name);
		System.out.println("Roll No: " + con.roll_no);
	}
}