package springIOC;

public class HappyCourseService implements CourseService {

	@Override
	public String getService() {
		return "Through DependencyInjection-Constructor Intjection: Injecting Beans use of getService Method(Overrided in HappyCourseService Class):";
	}

}
