package springs.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

//		Read Spring Config File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
//		Retrieve Bean from the Spring Container
//		Customer theCustomer = context.getBean("theRegularCustomer", Customer.class);
		Customer theCustomer = context.getBean("bankCustomer", Customer.class);
		
//		Call any Methods using the Helper or Bean
		System.out.println("Inside AnnotationDemoApp: Calling getDailyWork(): " +theCustomer.getDailyWork());
		String settedWork = theCustomer.setWork("Withdraw 60K from SBI");
		System.out.println("Inside AnnotationDemoApp Calling seWork(para): Result: " +settedWork);
		
//		Close the Context or Container
		context.close();

	}

}
