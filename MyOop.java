public class MyOop {
	public static void main(String[] args) {
		Print p1 = new Print("----"); // make instance which delimeter is "----"
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print p2 = new Print("****"); // make instance which delimeter is "****"
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();
		p2.A();
		p1.A();
		p2.A();
	}
	

}