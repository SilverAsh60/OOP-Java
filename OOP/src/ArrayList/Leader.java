package ArrayList;

public class Leader extends Teamer {
	private String level;

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Leader(String name, int age, String gender, String address,String level) {
		super(name, age, gender, address);
		this.setLevel(level);
	}

	public String toString() {
		System.out.println("Tên của lãnh đạo:" + super.name);
		System.out.println("Tuổi:" + super.age);
		System.out.println("Giới tính:" + super.gender);
		System.out.println("Địa chỉ:" + super.address);
		System.out.println("Cấp bậc:" + this.level);
		return level;
	}
}