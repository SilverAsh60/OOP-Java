package Inheritance;

/*
 *Lớp cha Employee
 */
class Employee {
	private String name;
	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	/*
	 * Hàm khởi tạo(Constructor
	 */
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	/*
	 * Phương thức hiển thị(Method
	 */
	public void display() {
		System.out.println("Name:" + this.name);
		System.out.println("Salary:" + this.salary);
	}
}

/*
 * Lớp kế thưà Manager
 */
class Manager extends Employee {
	private int bonus;

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	/*
	 * Hàm khởi tạo(Constructor
	 */
	public Manager(String name, int salary, int bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	/*
	 * Phương thức hiển thị ghi đè (overidding)
	 */
	public void display() {
		super.display();
		System.out.println("Bonus:" + this.bonus);
	}
}

public class Company {

	public static void main(String[] args) {
		// Tạo đối tượng nhân viên
		System.out.println("Thông tin nhân viên:");
		Employee e = new Employee("Hoàng", 10);
		e.display();
		System.out.println("Thông tin trưởng phòng");
		Manager m = new Manager("Huy", 2, 3);
		m.display();
	}

}
