package springs.annotations;

import org.springframework.stereotype.Component;

// theRegularCustomer BeanID = thatSillyCoach: Spring Class 54;
//@Component("theRegularCustomer")		 			 // This is Explicit Bean Passing.
@Component 											// @Component gives Default BeanId as Class Name with lower starting letter like 'bankCustomer'.
public class BankCustomer implements Customer {

	@Override
	public String getDailyWork() {
		return "Inside: getDailyWork()-BankCustomer: Have to use the @Component to Scan the Classes for Beans!";
	}

	@Override
	public String setWork(String setWork) {
		System.out.println("Setting Work with setWork() Inside BankCustomer: ");
		String resultWork = setWork;
		return resultWork;
	}

}
