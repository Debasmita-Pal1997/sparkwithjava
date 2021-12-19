package highschool_assignmet;

public class Student extends Person {
	private String year;
	private String major;

	public Student(String year, String major) {
		super();
		this.year = year;
		this.major = major;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
