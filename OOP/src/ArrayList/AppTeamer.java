package ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppTeamer {

	public AppTeamer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader write = new BufferedReader(read);
		// Khai báo đối tượng quản lý
		ManagerTeamer managerTeamer = new ManagerTeamer();
		// In ra menu
		Label_1: while (true) {
			System.out.println("**********************************");
			System.out.println("Nhấn phím 1 để thêm nhân sự.");
			System.out.println("Nhấn phím 2 để tìm kiếm theo tên.");
			System.out.println("Nhấn phím 3 để hiển thị thông tin.");
			System.out.println("Nhấn phím 4 để thoát.");
			System.out.println("**********************************");
			String line = write.readLine();
			// Chọn theo option
			switch (line) {
			// Nhập leader hay Staff
			case "1": {
				System.out.println("Nhấn a để thêm Leader");
				System.out.println("Nhấn b để thêm Staff");
				String type = write.readLine();
				// Nhập thông tin
				switch (type) {
				case "a": {
					InputStreamReader re = new InputStreamReader(System.in);
					BufferedReader wr = new BufferedReader(re);
					System.out.println("Nhập Tên của Leader:");
					String name = wr.readLine();
					System.out.println("Nhập Tuổi của Leader:");
					int age = Integer.parseInt(wr.readLine());
					System.out.println("Nhập Giới tính của Leader:");
					String gender = wr.readLine();
					System.out.println("Nhập Địa chỉ của Leader:");
					String address = wr.readLine();
					System.out.println("Nhập Cấp bậc của Leader:");
					String level = wr.readLine();
					Teamer leader = new Leader(name, age, gender, address, level);
					managerTeamer.addTeamer(leader);
					System.out.println("leader.toString");
					break;
				}
				case "b": {
					InputStreamReader re = new InputStreamReader(System.in);
					BufferedReader wr = new BufferedReader(re);
					System.out.println("Nhập Tên của Staff:");
					String name = wr.readLine();
					System.out.println("Nhập Tuổi của Staff:");
					int age = Integer.parseInt(wr.readLine());
					System.out.println("Nhập Giới tính của Staff:");
					String gender = wr.readLine();
					System.out.println("Nhập Địa chỉ của Staff:");
					String address = wr.readLine();
					System.out.println("Nhập Nhiệm vụ của Staff:");
					String task = wr.readLine();
					Teamer staff = new Staff(name, age, gender, address, task);
					managerTeamer.addTeamer(staff);
					System.out.println("staff.toString");
					break;
				}
				default:
					System.out.println("Bạn chọn chưa đúng.");
					break;
				}
				break;
			}
			// --Tìm kiếm theo tên
			case "2": {
				System.out.println("Nhập tên để tìm kiếm nhân sự.");
				String name = write.readLine();
				managerTeamer.searchTeamerByName(name).forEach(teamer -> System.out.println(teamer.toString()));
				break;
			}
			case "3":
				managerTeamer.showListTeamer();
				break;
			case "4":
				System.out.println("Bạn đã thoát chương trình.");
				break Label_1;
			}
		}

	}

}
