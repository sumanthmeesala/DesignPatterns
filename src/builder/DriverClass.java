package builder;

public class DriverClass {
	
	public static void main(String[] args) {
		Student student = Student.builder()
				.name("Sumanth")
				.age(25)
				.marks(91)
				.build();
		
		System.out.println(student);
	}

}