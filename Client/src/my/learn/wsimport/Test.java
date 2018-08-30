package my.learn.wsimport;

public class Test {
	public static void main(String[] args) {
		MathService math = new MathServiceService().getMathServicePort();
		System.out.println(math.hello("xixi"));
		System.out.println(math.add(3, 5));
	}
}
