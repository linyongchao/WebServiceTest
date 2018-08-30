package my.learn.webservice;

import javax.xml.ws.Endpoint;

/**
 * 发布服务
 * 
 * @author lin
 * @date 2018年8月30日 下午2:35:07
 */
public class Publish {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8088/MathService", new MathService());
		System.out.println("服务发布成功");
	}
}
