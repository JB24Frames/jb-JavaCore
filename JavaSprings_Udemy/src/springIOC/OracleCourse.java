package springIOC;

// Equals to CricketCoah class 35;
public class OracleCourse implements Course {
	
//	DI_SetterInjection: Steps
//	1: Create new class and inherit the interface 
//	2: Create fields to call method and create no-arg Constructor for Spring default invoking and also to diagnose 
//	3: Create setter methods and inject them in applicationCnotext as property name and with BeanID as Reference.(Configuration ) 
	
	public CourseService courseService;
	
//	Injecting Literal Values: 
//	Step1: Create and define the fields and getters and setter methods with those fields.
//	step2: Configure them in the Spring Config or context.xml file.
	private String emailAddress;
	private String devTeam;
	

	//	Create no-arg Constructor
	public OracleCourse() {
		System.out.println("DI_SI: Inside No-Arg Constructor - OracleCourse");
	}

//	Define our Setter Methods
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
		System.out.println("Inside Setter Method -setCourseService -OracleCourse:" +courseService);
	}

	@Override
	public String getDailyCourse() {
		return "DI_SI: Practice new Course each day";
	}
	
	@Override
	public String getDailyService() {
		return "DI_SI: Interact with different portals and news feed to get good Service";
	}
	
	//Generating getters and setter methods for emailAddress and devTeam;
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("OracleCourse- Literal Injection -Inside Setter Method - emailAddress:");
		this.emailAddress = emailAddress;
	}

	public String getDevTeam() {
		return devTeam;
	}

	public void setDevTeam(String devTeam) {
		System.out.println("OracleCourse- Literal Injection -Inside Setter Method - devTeam:");
		this.devTeam = devTeam;
	}

}
