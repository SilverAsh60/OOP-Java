package Abstract;

public class AppPerson {
	public static void main(String[] args) {
		Person ps1 = new Employee("Huy", "Đồng Nai", 100);
		Person ps2 = new Customer("Hoàng", "Hà Nội", 100);
		ps1.display();
		ps2.display();
	}
}