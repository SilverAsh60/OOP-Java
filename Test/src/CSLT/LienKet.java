package CSLT;

import java.util.Scanner;

public class LienKet implements Nagoya_U, Stanford_U {
	public String maNganh;
	public String tenNganh;
	public int soLuongSV;
	public double hocPhiToanPhan;

	public String getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}

	public String getTenNganh() {
		return tenNganh;
	}

	public void setTenNganh(String tenNganh) {
		this.tenNganh = tenNganh;
	}

	public int getSoLuongSV() {
		return soLuongSV;
	}

	public void setSoLuongSV(int soLuongSV) {
		this.soLuongSV = soLuongSV;
	}

	public double getHocPhiToanPhan() {
		return hocPhiToanPhan;
	}

	public void setHocPhiToanPhan(double hocPhiToanPhan) {
		this.hocPhiToanPhan = hocPhiToanPhan;
	}

	public LienKet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double hocPhi2() {
		// TODO Auto-generated method stub
		return (10 * this.hocPhiToanPhan / 100);
	}

	@Override
	public double hocphi1() {
		// TODO Auto-generated method stub
		return (15 * this.hocPhiToanPhan / 100);
	}

	public void nhapDuLieu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã ngành:");
		this.maNganh = sc.nextLine();
		System.out.println("Nhập tên ngành:");
		this.tenNganh = sc.nextLine();
		System.out.println("Nhập số lượng sinh viên:");
		this.soLuongSV = sc.nextInt();
		System.out.println("Nhập học phí toàn phần:");
		this.hocPhiToanPhan = sc.nextDouble();
		
	}

	public void xuatThongTin() {
		System.out.println("Mã Ngành:" + this.getMaNganh());
		System.out.println("Tên Ngành:" + this.getTenNganh());
		System.out.println("Số lượng sinh viên:" + this.getSoLuongSV());
		System.out.println("Học phí toàn phần:" + (this.getHocPhiToanPhan() + this.hocphi1() + this.hocPhi2()));
	}
}