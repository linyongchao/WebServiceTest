package my.learn.webservice;

public class Test {
	public static void main(String[] args) {
		MathService ms = new MathService();
		System.out.println(ms.hello("lin"));
		System.out.println(ms.add(1, 2));
		System.out.println(ms.subtract(4, 2));
		System.out.println(MathService.multiply(2, 3));
	}
}
