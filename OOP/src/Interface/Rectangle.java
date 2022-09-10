package Interface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle implements Ishape {
	private double length;
	private double width;

//Hàm khởi tạo không có tham số truyền vào
	public Rectangle() {
	}

//Phương thức ghi đè
	@Override
	public double getPerimeter() {
		return length * width;
	}

	// Phuong thuc ghi đè tính chu vi
	@Override
	public double gerArea() {
		return (length + width) * 2;
	}

	public void input() throws NumberFormatException, IOException {
		// Lấy đối tượng từ bàn phím
		InputStreamReader read = new InputStreamReader(System.in);
		// Ghi vào bộ nhớ đệm
		BufferedReader write = new BufferedReader(read);
		System.out.println("Nhập chiều dài của hình chữ nhật:");
		this.length = Double.parseDouble(write.readLine());
		System.out.println("Nhập chiều rộng của hình chữ nhật:");
		this.width = Double.parseDouble(write.readLine());
	}
}
