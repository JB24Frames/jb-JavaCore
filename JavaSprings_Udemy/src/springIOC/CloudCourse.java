package springIOC;

public class CloudCourse implements Course {
	
	private CourseService courseService;
// constructor for default sPring bean initialization; 
	public CloudCourse(CourseService theCourseService) {
		courseService = theCourseService;
	}

	@Override
	public String getDailyCourse() {
		return "Inside new Cloud Course- Activty #2:";
	}

	@Override
	public String getDailyService() {
		return courseService.getService();
	}

}
