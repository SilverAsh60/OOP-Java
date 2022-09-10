package ArrayList;

import java.util.*;
import java.util.stream.Collectors;

public class ManagerTeamer {
	// Khởi tạo DS Teamer
	private List<Teamer> teamers;

	public List<Teamer> getTeamers() {
		return teamers;
	}

	public void setTeamers(List<Teamer> teamers) {
		this.teamers = teamers;
	}
	// Hàm khởi tạo

	public ManagerTeamer() {
		this.setTeamers(new ArrayList<>());
	}

	// Tạo phương thức thêm
	public void addTeamer(Teamer teamer) {
		this.teamers.add(teamer);
	}

	// Tạo phương tìm theo tên sử dụng filter collection
	public List<Teamer> searchTeamerByName(String name) {
		return this.teamers.stream().filter(t -> t.getName().contains(name)).collect(Collectors.toList());
	}

	// Phương thức hiển thị dùng foreach
	public void showListTeamer() {
		this.teamers.forEach(t -> System.out.println(t.toString()));
	}
}
