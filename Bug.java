package hello.world;

public class HelloWorld {
	
	public static void main(String[] args) {		
		test();
	}
	
	private static void test() {
		try{
			int a = 1;
			int b = 0;
			int result = a / b;
			System.out.println("result = " + result);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}