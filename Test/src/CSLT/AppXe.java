package CSLT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AppXe {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader re = new InputStreamReader(System.in);
		BufferedReader wr = new BufferedReader(re);
		int n;
		System.out.println("Nhập n xe tải:");
		n = Integer.parseInt(wr.readLine());
		ArrayList<Xe> list = new ArrayList<Xe>();
		for (int i = 0; i < n; i++) {
			themDS(list);
		}
		xuatHangTrung(list);
	}

	public static void themDS(ArrayList<Xe> list) throws NumberFormatException, IOException {
		Xe X = new XeTai();
		X.nhapDuLieu();
		list.add(X);
	}

	public static void xuatHangTrung(ArrayList<Xe> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).phanHang() == "hạng trung") {
				list.get(i).xuatThongTin();
				System.out.println("----------------" + i + "----------------");
			}
		}
	}
}
