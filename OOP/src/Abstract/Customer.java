/**
 * 
 */
package Abstract;

/**
 * Lớp customer
 * 
 * @author Asus
 *
 */
public class Customer extends Person {
	private int balance;

	/**
	 * Phương thức có tham số truyền vào
	 * 
	 * @param name
	 * @param address
	 */
	public Customer(String name, String address, int balance) {
		super(name, address);
		this.balance = balance;
		// TODO Auto-generated constructor stub
	}

	// Phương thức ghi đè
	@Override
	public void display() {
		System.out.println("Customer name:" + super.getName());
		System.out.println("Customer address:" + super.getAddress());
		System.out.println("Customer salary:" + this.balance);

	}

}
