package Abstract;

public abstract class Person {
	private String name;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// Phương thức trừu tượng(không có thân hàm)
	public abstract void display();

	// Hàm khởi tạo
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

}