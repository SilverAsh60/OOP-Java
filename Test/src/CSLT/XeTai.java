package CSLT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class XeTai extends Xe {
	public long trongTai;
	private double giaBan;
	public long getTrongTai() {
		return trongTai;
	}

	public void setTrongTai(long trongTai) {
		this.trongTai = trongTai;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public XeTai() {
		
		// TODO Auto-generated constructor stub
	}


	@Override
	
	public void nhapDuLieu() throws NumberFormatException, IOException{
		 InputStreamReader read=new InputStreamReader(System.in);
		 BufferedReader write=new BufferedReader(read);
		System.out.println("Mã số xe:");
		this.maSo=write.readLine();
		System.out.println("Hiệu xe:");
		this.hieuXe=write.readLine();
		System.out.println("Trọng tải xe:");
		this.trongTai=Long.parseLong(write.readLine());
		System.out.println("Giá bán xe:");
		this.giaBan=Double.parseDouble(write.readLine());

	}

	@Override
	public String phanHang() {
		if(this.trongTai<=3)return "hạng nhẹ";
		else if(this.trongTai>3&&this.trongTai<=7)return "hạng trung";
		else
		return "hạng nặng";
	}	

	@Override
	public void xuatThongTin() {
		System.out.println("Mã số xe:"+super.getMaSo());
		System.out.println("Hiệu xe:"+super.getHieuXe());
		System.out.println("Trọng tải xe:"+this.getTrongTai());
		System.out.println("Giá bán xe:"+this.getGiaBan());
		System.out.println("Phân hạng xe:"+this.phanHang());

	}

}
