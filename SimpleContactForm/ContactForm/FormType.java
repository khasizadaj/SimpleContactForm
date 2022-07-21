package SimpleContactForm.ContactForm;

public enum FormType {
	SERVICE_REQUEST(5),
	QUESTION(4),
	CRITICISM(3),
	RECOMMENDATION(2),
	APPRECIATION(1);

	private int priority;

	private FormType(int priority) {
		this.priority = priority;
	}

	public int getPriority() {
		return this.priority;
	}
}
