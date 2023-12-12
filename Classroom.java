/**
 * 
 */
package object;

/**
 * 
 */
public  class  Classroom {

	/**
	 * @param args
	 */
	protected String MaLop ; 
	protected String MaKhoaHoc ; 
	protected int ChiPhiHocTap ; 
	protected String NgayTaoLop ; 
	protected int MaxStudent ;
	
	
	public Classroom() {

	}


	public Classroom(String maLop, String maKhoaHoc, int chiPhiHocTap, String ngayTaoLop, int maxStudent) {

		MaLop = maLop;
		MaKhoaHoc = maKhoaHoc;
		ChiPhiHocTap = chiPhiHocTap;
		NgayTaoLop = ngayTaoLop;
		MaxStudent = maxStudent;
	}


	public String getMaLop() {
		return MaLop;
	}


	public String getMaKhoaHoc() {
		return MaKhoaHoc;
	}


	public int getChiPhiHocTap() {
		return ChiPhiHocTap;
	}


	public String getNgayTaoLop() {
		return NgayTaoLop;
	}


	public int getMaxStudent() {
		return MaxStudent;
	}


	public void setMaLop(String maLop) {
		MaLop = maLop;
	}


	public void setMaKhoaHoc(String maKhoaHoc) {
		MaKhoaHoc = maKhoaHoc;
	}


	public void setChiPhiHocTap(int chiPhiHocTap) {
		ChiPhiHocTap = chiPhiHocTap;
	}


	public void setNgayTaoLop(String ngayTaoLop) {
		NgayTaoLop = ngayTaoLop;
	}


	public void setMaxStudent(int maxStudent) {
		MaxStudent = maxStudent;
	}


	public double tong_phi() {
		return this.ChiPhiHocTap*this.MaxStudent ;
	}
	

	@Override
	public String toString() {
		return "Classroom MaLop=" + MaLop + ", MaKhoaHoc=" + MaKhoaHoc + ", ChiPhiHocTap=" + ChiPhiHocTap
				+ ", NgayTaoLop=" + NgayTaoLop + ", MaxStudent=" + MaxStudent + " ";
	}
	
	

}
