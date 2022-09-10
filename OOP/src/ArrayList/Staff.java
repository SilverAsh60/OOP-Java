package ArrayList;

public class Staff extends Teamer {
	private String task;

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Staff(String name, int age, String gender, String address, String Staff) {
		super(name, age, gender, address);
		this.setTask(Staff);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		System.out.println("Tên của nhân viên:" + super.name);
		System.out.println("Tuổi:" + super.age);
		System.out.println("Giới tính:" + super.gender);
		System.out.println("Địa chỉ:" + super.address);
		System.out.println("Nhiệm vụ:" + this.task);
		return task;
	}
}