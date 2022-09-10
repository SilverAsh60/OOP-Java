package CSLT;

import java.util.ArrayList;
import java.util.Scanner;

public class AppLienKet {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<LienKet> list = new ArrayList<LienKet>();
		int value;
		System.out.println("Mời bạn chọn các chức năng sau:");
		label_1: do {
			System.out.println("1.Thêm danh sách sinh viên.");
			System.out.println("2.Xuất danh sách sinh viên có số lượng sinh viên >200 sinh viên.");
			System.out.println("3. Thoát chương trình.");
			System.out.println();
			value = sc.nextInt();
			switch (value) {
			case 1:
				themDS(list);
				break;
			case 2:
				xuat200(list);
				break;
			case 3:
				break label_1;
			default:
				System.out.println("Bạn nhập sai chức năng\n");
				System.out.println("Bạn vui lòng chọn lại chức năng:");
				break;
			}

		} while (true);
		sc.close();
	}

	public static void themDS(ArrayList<LienKet> list) {
		LienKet LK = new LienKet();
		LK.nhapDuLieu();
		list.add(LK);
	}

	public static void xuat200(ArrayList<LienKet> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSoLuongSV() >= 200) {
				list.get(i).xuatThongTin();
				System.out.println(list.size());
				System.out.println("-------------" + i + "------------");
			}
		}
	}
}