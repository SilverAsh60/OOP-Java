package InheritanceCollege;

//lớp Employee
class Employee {
	/*
	 * Các thuộc tính
	 */
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// Hàm khai báo(Constructor)
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	// Phương thức trả về Họ và tên(Method)
	public String getFullName() {
		return firstName + " " + lastName;
	}
}

public class Company {

	public static void main(String[] args) {
		// Tạo đối tượng(object)
		Employee e = new Employee(1, "Huy", "Lâm", 500);
		System.out.println("Id:" + e.getId());
		System.out.println("Name:" + e.getFullName());
		System.out.println("Salary:" + e.getSalary());
	}

}
