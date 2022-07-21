
public class Main {

	public static void main(String[] args) {
		String description = "How to train your student";
		Category category1 = new Category("All");
		CourseManager manager = new CourseManager();
		Instructor instructor1 = new Instructor(1, "Engin Demiroğ", 32);
		Courses course1 = new Courses(1, "C#+Angular", description, 0, instructor1,category1);
		manager.Start();
		Courses course2 = new Courses(2, "Java-React", description, 0, instructor1,category1);
		manager.Stop();
		Courses course3 = new Courses(3, "Javascript", description, 0, instructor1,category1);
		manager.SpeedUp();
		Courses course4 = new Courses(3, "Fundamentals of Programming", description, 0, instructor1,category1);
		
		Courses[] courses = {course1,course2,course3,course4};
		
		for(Courses course : courses) {
			System.out.println("All courses that you have enrolled:\n"+course.name);
		}
		
	}

}
