package Class_Object;

import java.util.Scanner;

public class Tamgiac {
	private float canh1;
	private float canh2;
	private float canh3;

	public float getCanh1() {
		return canh1;
	}

	public void setCanh1(float canh1) {
		this.canh1 = canh1;
	}

	public float getCanh2() {
		return canh2;
	}

	public void setCanh2(float canh2) {
		this.canh2 = canh2;
	}

	public float getCanh3() {
		return canh3;
	}

	public void setCanh3(float canh3) {
		this.canh3 = canh3;
	}

//Phương thức nhập dữ liệu
	public void nhapDL() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hãy nhập cạnh thứ nhất:");
		canh1 = sc.nextFloat();
		System.out.println("Hãy nhập cạnh thứ hai:");
		canh2 = sc.nextFloat();
		System.out.println("Hãy nhập cạnh thứ ba:");
		canh3 = sc.nextFloat();
		sc.close();
	}// Phương thức tính chu vi(method)

	public float chuVi() {
		return (this.canh1 + this.canh2 + this.canh3);
	}

	// Phương thức tính diện tích(method)
	public double dienTich() {
		float p = this.chuVi() / 2;
		return (Math.sqrt(p * (p - this.canh1) * (p - this.canh2) * (p - this.canh3)) / 2);
	}

	// Phương thức kiểm tra
	public boolean hopLe() {
		return (this.canh1 + this.canh3 > this.canh2 && this.canh2 + this.canh3 > this.canh1
				&& this.canh1 + this.canh2 > this.canh3);

	}
}