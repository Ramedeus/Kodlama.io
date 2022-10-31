package katmanliMimari.entities;

public class Instractor {
	private int id;
	private String name;
	private String surname;
	private String courses;

	public Instractor(int id, String name, String surname, String courses) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.courses = courses;
	}

	public Instractor() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

}
