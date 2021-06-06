
public class Calculator {

	public static void main(String[] args) {
		System.out.println("Arithmetic Calculator");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		System.out.println("Addition is : " + add);
		System.out.println("Subtraction is : " + sub);
		System.out.println("Mltiplication is : " + mul);

	}

}
