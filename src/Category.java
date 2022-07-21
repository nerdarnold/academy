public class Category {
	
	public Category(String name, int id) {
		this(name);
		this.name = name;
		this.id = id;
	}
	
	public Category(String name) {

		this.name = name;
	}

	String name;
	int id;
}
