package CSLT;

import java.io.*;

public class testSinhVien {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nhap so luong sinh vien: ");
		int n = Integer.parseInt(reader.readLine());
		SinhVien[] arr = new SinhVien[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Ho ten: ");
			String name = reader.readLine();
			System.out.print("Ngay Sinh: ");
			String ngaySinh = reader.readLine();
			System.out.print("Dia Chi: ");
			String diaChi = reader.readLine();
			System.out.print("Email: ");
			String email = reader.readLine();
			System.out.print("SDT: ");
			String SDT = reader.readLine();
			System.out.print("MSSV: ");
			String MSSV = reader.readLine();
			arr[i] = new SinhVien(name, ngaySinh, diaChi, email, SDT, MSSV);
		}
		SapXepGiamDan(arr);
		printArray(arr);
		System.out.println();
		SapXepTangDan(arr);
		printArray(arr);		
	}

	 static void SapXepGiamDan(SinhVien arr[]) {
		int n = arr.length;
		SinhVien value = null;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j].compareTo(arr[j+1]) == 1) {
					// swap arr[j+1] và arr[i]
					value = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = value;
				}
	}
	 
	 static void SapXepTangDan(SinhVien arr[]) {
			int n = arr.length;
			SinhVien value = null;
			for (int i = 0; i < n - 1; i++)
				for (int j = 0; j < n - i - 1; j++)
					if (arr[j].compareTo(arr[j+1]) == -1) {
						// swap arr[j+1] và arr[i]
						value = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = value;
					}
		}
	
	static void printArray(SinhVien arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i].hoVaTen() + " ");
        System.out.println();
        }
    }
}