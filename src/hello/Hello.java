package hello;

public class Hello {

	public static void main(String[] args) {

		System.out.println("hello there world");
		System.out.println("hello there world again");
	}

	// force to success
	public String printers(String what) {

		return what;
	}

	// force to fail
	public int numbers(int num) {
		num++;
		return num;
	}

}
