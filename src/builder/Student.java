package builder;

public class Student {
	
	private String name;
	private int age;
	private String address;
	private int marks;
	private String rollNumber;
	
	private Student(String name, int age,
            String address,
            int marks,
			String rollNumber) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.marks = marks;
		this.rollNumber = rollNumber;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", marks=" + marks + ", rollNumber="
				+ rollNumber + "]";
	}

	public static StudentBuilder builder() {
		return new StudentBuilder();
	}
	
	public static class StudentBuilder {
		
		private String name;
		private int age;
		private String address;
		private int marks;
		private String rollNumber;
		
		public StudentBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public StudentBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public StudentBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public StudentBuilder marks(int marks) {
			this.marks = marks;
			return this;
		}
		
		public StudentBuilder rollNumber(String rollNumber) {
			this.rollNumber = rollNumber;
			return this;
		}
		
		public Student build() {
			return new Student(name, age, address, marks, rollNumber);
		}
		
	}
	
}
