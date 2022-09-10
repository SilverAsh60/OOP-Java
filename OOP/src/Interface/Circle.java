package Interface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle implements Ishape {
	private double radius;
	final double pi = 3.14;

	public Circle() {
	}

	// Phương thức ghi đè
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * pi * radius;
	}

	// Phương thức ghi đè
	@Override
	public double gerArea() {
		// TODO Auto-generated method stub
		return pi * radius * radius;
	}

	public void input() throws NumberFormatException, IOException {
		// Lấy đối tượng từ bàn phím
		InputStreamReader read = new InputStreamReader(System.in);
		// Ghi vào bộ nhớ đệm
		BufferedReader write = new BufferedReader(read);
		System.out.println("Nhập Bán kính của Hình tròn:");
		this.radius = Double.parseDouble(write.readLine());
	}
}
