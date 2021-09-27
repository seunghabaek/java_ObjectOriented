
class Print {
	public String delimeter = ""; // variable
	public Print(String delimeter) { // constructor
//		delimeter = _delimeter;
		this.delimeter = delimeter; // this´Â instance¸¦ °¡¸®Å´.
	}
	public void B() { // method
		System.out.println(this.delimeter);
		System.out.println("B");
		System.out.println("B");
	}

	public void A() { // method
		System.out.println(this.delimeter);
		System.out.println("A");
		System.out.println("A");
	}
}