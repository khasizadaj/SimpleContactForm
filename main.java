import java.util.Collections;
import java.util.List;

import ContactForm.Application;
import ContactForm.ApplicationPool;

class Main {

	public static void main(String[] args) {

		ApplicationPool applicationPool = new ApplicationPool();
		List<Application> allApplications = applicationPool.getAllApplications();

		Collections.sort(allApplications, Collections.reverseOrder());

		System.out.println("We have %s form applications in our Application Pool.".formatted(allApplications.size()));
		System.out.println("We should start working on the applications in this given order.");

		for (int i = 0; i < allApplications.size(); i++) {
			Application application = allApplications.get(i);

			System.out.println("%s | %s".formatted(i + 1, application));
		}
	}
}
