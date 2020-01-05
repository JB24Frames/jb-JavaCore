package springIOC;

public class MyCourseApp {

	public static void main(String[] args) {

//		Create the Objects
		JavaCourse theCourse = new JavaCourse(); 
//		To use the Generic interface write below code.
		Course theCourse1 = new JavaCourse();
		Course theCourse2 = new TrackCourse();
		Course theCourse3 = new SpringCourse();
//		Use the Object created above.
		System.out.println("Course Schedule for each Course:" +theCourse.getDailyCourse());
		System.out.println("Course Schedule for each Course Using Generic Interface 'Course':" +theCourse1.getDailyCourse());
		System.out.println("Calling 'TrackCourse' Class through AtuoCode by Eclipse:" +theCourse2.getDailyCourse());
		System.out.println("New SpringCourse Class is configured in ApplicationConetext.xml file" +theCourse3.getDailyCourse());
//		For below 2 we will get java.lang.NullPointerException
//		System.out.println("Course Service for each Course:" +theCourse.getDailyService());
//		System.out.println("Course Service for each Course Using Generic Interface 'Course':" +theCourse1.getDailyService());
		
	}

}
