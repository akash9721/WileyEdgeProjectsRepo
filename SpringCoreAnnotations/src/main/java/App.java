
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springbeamnotation.Customer;

public class App {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/springbeamnotation/bean.xml");
		Customer cus = (Customer) ap.getBean("customer");
		System.out.println("Customer retrieved!!");
		System.out.println(cus.getCusId());
		System.out.println(cus.getName());
		System.out.println(cus);
//		System.out.println(cus.getAddress().getCity());
//		System.out.println(cus.getAddress().getTown());

		// System.out.println(cus);
	}
}
