package my.learn.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * JDK1.6之后可利用@WebService注解发布WebService
 * 
 * @author lin
 * @date 2018年8月30日 下午2:30:23
 */
@WebService
public class MathService {
	/**
	 * hello
	 * 
	 * @param name
	 * @return
	 * @author lin
	 * @date 2018年8月30日 下午2:22:12
	 */
	public String hello(String name) {
		return "hello " + name + "!";
	}

	/**
	 * 加法
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @author lin
	 * @date 2018年8月30日 下午2:20:34
	 */
	public int add(int a, int b) {
		return a + b;
	}

	/**
	 * 减法，因为@WebMethod(exclude= true)注解，所以不会被发布
	 * 
	 * @param a
	 *            被减数
	 * @param b
	 *            减数
	 * @return
	 * @author lin
	 * @date 2018年8月30日 下午2:23:54
	 */
	@WebMethod(exclude = true)
	public int subtract(int a, int b) {
		return a - b;
	}

	/**
	 * 乘法，因为是静态的，所以不会发布
	 * 
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @author lin
	 * @date 2018年8月30日 下午2:26:07
	 */
	public static int multiply(int a, int b) {
		return a * b;
	}
}
