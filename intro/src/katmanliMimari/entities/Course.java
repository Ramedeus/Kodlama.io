package katmanliMimari.entities;

public class Course {

	private int courseCode;
	private String courseName;
	private double progress;
	private Instractor instractor;
	private int percentage;
	private double price;

	public Course(int courseCode, String courseName, double progress, Instractor instractor, int percentage,
			double price) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.progress = progress;
		this.instractor = instractor;
		this.percentage = percentage;
		this.price = price;
	}

	public Course() {
		super();
	}

	public int getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getProgress() {
		return progress;
	}

	public void setProgress(double progress) {
		this.progress = progress;
	}

	public Instractor getInstractor() {
		return instractor;
	}

	public void setInstractor(Instractor instractor) {
		this.instractor = instractor;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
