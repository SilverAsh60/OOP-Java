package CSLT;

import java.io.IOException;

public abstract class Xe {
	public String maSo;
	public String hieuXe;

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public String getHieuXe() {
		return hieuXe;
	}

	public void setHieuXe(String hieuXe) {
		this.hieuXe = hieuXe;
	}

	public Xe() {

	}

	public abstract void nhapDuLieu() throws NumberFormatException, IOException;

	public abstract String phanHang();

	public abstract void xuatThongTin();
}
