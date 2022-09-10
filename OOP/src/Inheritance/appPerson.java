package Inheritance;

/*
 * Lớp cha Person
 */
class Person {
	// các thuộc tính(attributes)
	private String name;
	private int age;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/*
	 * Hàm khởi tạo(Constructor)
	 */
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	/*
	 * Phương thức hiển thị(Method)
	 */
	public void display() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Address:" + address);
	}
}

/*
 * Lớp kế thừa Student
 */
class Student extends Person {
	private double gpa;

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	// Hàm khởi tạo(Constructor) có các tham số truyền vào
	public Student(String name, int age, String address, double gpa) {
		super(name, age, address);
		this.gpa = gpa;
	}

	// Phương thức hiển thị ghi đè (method overidding)
	public void display() {
		super.display();
		System.out.println("GPA:" + this.gpa);
	}
}

/**
 * Lớp kế thừa Teacher
 * 
 * @author Asus
 *
 */
class Teacher extends Person {
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// Hàm khởi tạo(Constructor)
	public Teacher(String name, int age, String address, int salary) {
		super(name, age, address);
		this.salary = salary;
	}

	// Phương thức ghi đè(overidding)(method)
	public void display() {
		super.display();
		System.out.println("Salary:" + this.salary);
		;
	}
}

public class appPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thông tin sinh viên:");
		// Khởi tạo đối tượng sinh viên
		Student s = new Student("Lan", 18, "Hà Nội", 9);
		s.display();
		// Khởi tạo đối tượng giáo viên
		Teacher t = new Teacher("Huy", 25, "Đồng Nai", 19);
		t.display();
	}

}
