package ContactForm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationPool {
	private List<Application> applicationPool = new ArrayList<Application>(
			Arrays.asList(
					new Application("qa1", "A", "What are your services?", "QUESTION"),
					new Application("aa1", "B", "I like it.", "APPRECIATION"),
					new Application("ca1", "C", "I don't think yu are on good track.", "CRITICISM"),
					new Application("sa1", "D", "I want an app.", "SERVICE_REQUEST"),
					new Application("ra1", "E", "Don't you think, it's time for learning Java?", "RECOMMENDATION")));

	public List<Application> getAllApplications() {
		return applicationPool;
	}

}
