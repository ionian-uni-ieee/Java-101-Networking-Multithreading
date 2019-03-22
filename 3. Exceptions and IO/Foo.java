public class Foo{
	
	public static void main(String[] args){
		System.out.println("Start of main...");
		method1();
		System.out.println("End of main...");
	}

	public static void method1(){
		System.out.println("Start of method1...");
		method2();
		System.out.println("End of method1...");
	}

	public static void method2(){
		System.out.println("Start of method2...");
		int i = 3/0;
		System.out.println("End of method2...");
	}
}