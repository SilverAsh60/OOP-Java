/**
 * 
 */
package Abstract;

/*
 *Lớp Employee kế thừa lớp Person
 */
public class Employee extends Person {
	private int salary;

	/**
	 * Phương thức khởi tạo có tham số
	 * 
	 * @param name:tham    số name
	 * @param address:tham số đại chỉ
	 */
	public Employee(String name, String address, int salary) {
		super(name, address);
		this.salary = salary;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Employee name:" + super.getName());
		System.out.println("Employee address:" + super.getAddress());
		System.out.println("Employee salary:" + this.salary);
	}

}
