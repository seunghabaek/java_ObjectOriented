import java.io.FileWriter;
import java.io.IOException;

public class OthersAppOop {

	public static void main(String[] args) throws IOException { // 예외처리(파일이 없을때)
		// class: System, Math, FileWriter
		// instance: f1, f2
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		FileWriter f1 = new FileWriter("data.txt"); // f1이라는 instance 만듬.
		f1.write("Hello");
		f1.write("Java");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write(" Java2");
		f2.close();

	}

}
