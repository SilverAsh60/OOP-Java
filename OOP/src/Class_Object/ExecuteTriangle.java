package Class_Object;

public class ExecuteTriangle {
	public static void main(String[] args) {
		Tamgiac tg = new Tamgiac();
		if (tg.hopLe()) {
			tg.nhapDL();
			System.out.println("Chu vi hình tam giác là:" + tg.chuVi());
			System.out.println("Diện tích hình tam giác là:" + tg.dienTich());
		}
	}
}