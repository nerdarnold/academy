public class Courses {

	public Courses(int id, String name, String description, int percentage, Instructor instructor,Category category) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.instructor = instructor;
		this.category=category;
		System.out.println("You have enrolled for " + this.name + ". Unless you finish your course, "
				+ this.instructor.name + " will get angry\nCategory for this course: "+this.category.name);
	}

	int id;
	String name;
	String description;
	Instructor instructor;
	Category category;

}
