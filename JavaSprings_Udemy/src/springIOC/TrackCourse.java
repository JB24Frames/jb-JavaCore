package springIOC;

public class TrackCourse implements Course {
	
	private CourseService courseService;
	

	public TrackCourse(CourseService courseService) {
		this.courseService = courseService;
	}

	public TrackCourse() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyCourse() {
		
		return "Read and Code atleast 8 hours";
	}

	@Override
	public String getDailyService() {
		return "Do DI_CI for TrackCourse:" +courseService.getService();
	}
	
//	Methods explaining Bean LifeCycle;
//	Method used  while bean Initialization;
	public void doStartMyCourse() {
		System.out.println("Inside TrackCourse: doStartMyCourse Method");
	}
//	Method used  while bean Destruction;
	public void doDestroyMyCourse() {
		System.out.println("Inside TrackCourse: doDestroyMyCourse Method");
	}

}
