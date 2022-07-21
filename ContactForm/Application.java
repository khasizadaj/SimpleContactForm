package ContactForm;

public class Application implements Comparable<Application> {
	public String id;
	public String author;
	public String body;
	public FormType type;

	public Application(
			String id,
			String author,
			String body,
			String type) {
		this.id = id;
		this.author = author;
		this.body = body;
		this.type = FormType.valueOf(type);
	}

	public int compareTo(Application other) {
		return this.type.getPriority() - other.type.getPriority();
	}

	public String toString() {
		return "%s | %s | %s : %s".formatted(this.id, this.type, this.author, this.body);
	}
}
