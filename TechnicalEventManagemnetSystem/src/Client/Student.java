package Client;

public class Student {
	int studentid;
	String stuname;
	int age;
	String stream;
	String eventtype;

	public Student(int studentid, String stuname, int age, String strem, String eventtype) {

		this.studentid = studentid;
		this.stuname = stuname;
		this.age = age;
		this.stream = strem;
		this.eventtype = eventtype;

	}

	public int getStudentid() {
		return studentid;
	}

	public String getStuname() {
		return stuname;
	}

	public int getAge() {
		return age;
	}

	public String getStream() {
		return stream;
	}

	public String getEventtpe() {
		return eventtype;
	}

	public String toString() {
		return studentid + ", id: " + stuname + ", name: " + age + ", age: " + stream + ", stream: " + eventtype
				+ "eventtype";
	}

	public void display() {

	}

	public void displayStudent() {
	}


}
