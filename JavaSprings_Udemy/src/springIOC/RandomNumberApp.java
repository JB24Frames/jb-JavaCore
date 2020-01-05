package springIOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomNumberApp {

	public static void main(String[] args) {
		
//		Loading Spring Config File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Retrieve the Bean;
		Course theCourse = context.getBean("myCloudService", Course.class);
//		Call External Methods;
		System.out.println("getDailyCourse:" +theCourse.getDailyCourse());
		System.out.println("getDailyService:" +theCourse.getDailyService());
//		close context;
		context.close();

	}

}
