package my.learn.webservice;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class Test {
	public static void main(String[] args) {
		try {
			MathService math = new MathServiceServiceLocator().getMathServicePort();
			System.out.println(math.hello("lin"));
			System.out.println(math.add(1, 2));
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
