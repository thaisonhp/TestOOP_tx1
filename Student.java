/**
 * 
 */
package object;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * 
 */
public class Student extends Classroom{

	/**
	 * @param args
	 */
	
	private String MaHV ; 
	private String FullName ; 
	private String Address ; 
	private int PhoneNumber ;

	
	public Student() {
		
	}


	public Student(String maLop, String maKhoaHoc, int chiPhiHocTap, String ngayTaoLop, int maxStudent, String maHV,
			String fullName, String address, int phoneNumber) {
		super(maLop, maKhoaHoc, chiPhiHocTap, ngayTaoLop, maxStudent);
		MaHV = maHV;
		FullName = fullName;
		Address = address;
		PhoneNumber = phoneNumber;
	}

	public String getMaHV() {
		return MaHV;
	}

	public String getFullName() {
		return FullName;
	}

	public String getAddress() {
		return Address;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setMaHV(String maHV) {
		MaHV = maHV;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	public double tong_phi(int kichthuocmangsinhvien) {
		return this.ChiPhiHocTap*kichthuocmangsinhvien; 
	}
	
	@Override
	public String toString() {
		return "Student ["+super.toString()+"MaHV=" + MaHV + ", FullName=" + FullName + ", Address=" + Address + ", PhoneNumber="
				+ PhoneNumber + "]";
	}

}
