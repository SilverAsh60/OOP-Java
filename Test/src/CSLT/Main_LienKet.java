package CSLT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_LienKet {

	public static void main(String[] args) throws IOException {
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(read);
		ArrayList<LienKet> list = new ArrayList<LienKet>();

		int value = 0;
		do {
			System.out.println("Vui lòng chọn chức năng: ");
			System.out.println("1.	Thêm sinh viên vào danh sách.\n"
					+ "2.	In danh sách các đối tượng liên kết có số lượng SV >=200 ra màn hình.\n"
					+ "0.   Thoát khỏi chương trình");
			System.out.println();
			value = Integer.parseInt(input.readLine());
			if (value == 1) {
				inputList(list);
				System.out.println("++++++++++++++++++++++++++++++++");
			} else if (value == 2) {
				xuat200(list);
			}
		} while (value != 0);
	}

	public static void inputList(ArrayList<LienKet> list) throws IOException {
		LienKet a = new LienKet();
		a.nhapDuLieu();
		list.add(a);
	}

	public static void xuat200(ArrayList<LienKet> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSoLuongSV() >= 200) {
				list.get(i).xuatThongTin();
				System.out.println("-------------"+ i +"------------");
			}
		}
	}
}
