package Interface;

import java.io.IOException;

public class AppIShape {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Rectangle rec = new Rectangle();
		rec.input();
		Circle c = new Circle();
		c.input();
		System.out.println("Vậy chu vi hình chữ nhật là:" + rec.getPerimeter());
		System.out.println("Vậy diện tích hình chữ nhật là:" + rec.gerArea());
		System.out.println("Vậy chu vi hình tròn là:" + c.getPerimeter());
		System.out.println("Vậy diện tích hình tròn là:" + c.gerArea());

	}

}
