package CSLT;

public class SinhVien implements Comparable<SinhVien> {
	private String name;
	private String ngaySinh;
	private String diaChi;
	private String email;
	private String SDT;
	private String MSSV;

	public SinhVien() {
		super();
	}

	public SinhVien(String name, String ngaySinh, String diaChi, String email, String sDT, String mSSV) {
		super();
		this.name = name;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.email = email;
		SDT = sDT;
		MSSV = mSSV;
	}

	public String getName() {
		String HoTen = "";
		for (int i = this.name.length() - 1; i >= 0 && this.name.charAt(i) != ' '; i--) {
			HoTen = this.name.charAt(i) + HoTen;
		}
		return HoTen;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSDT() {
		return SDT;
	}

	public void setSDT(String sDT) {
		SDT = sDT;
	}

	public String getMSSV() {
		return MSSV;
	}

	public void setMSSV(String mSSV) {
		MSSV = mSSV;
	}

	@Override
	public String toString() {
		return "SinhVien [name=" + name + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", email=" + email
				+ ", SDT=" + SDT + ", MSSV=" + MSSV + "]";
	}

	@Override
	public int compareTo(SinhVien OBJ) {
		String thisName = this.getName();
		String thatName = OBJ.getName();
		if (thisName.length() < thatName.length()) {
			for (int i = 0; i < thisName.length(); i++) {
				if ((int) thisName.charAt(i) < (int) thatName.charAt(i))
					return 1;
				else if ((int) thisName.charAt(i) > (int) thatName.charAt(i))
					return -1;
			}
		} else {
			for (int i = 0; i < thatName.length(); i++) {
				if ((int) thisName.charAt(i) < (int) thatName.charAt(i))
					return 1;
				else if ((int) thisName.charAt(i) > (int) thatName.charAt(i))
					return -1;
			}
		}

		// TODO Auto-generated method stub
		return 0;
	}

	public String hoVaTen() {
		return this.name;
	}
}
