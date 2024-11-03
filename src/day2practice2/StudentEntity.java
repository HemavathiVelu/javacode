package day2practice2;

public class StudentEntity {
	int sid,graduationyear;
	String sname,dept,stream,Mobileno;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getGraduationyear() {
		return graduationyear;
	}
	public void setGraduationyear(int graduationyear) {
		this.graduationyear = graduationyear;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getMobileno() {
		return Mobileno;
	}
	public void setMobileno(String mobileno) {
		Mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "StudentEntity [sid=" + sid + ", graduationyear=" + graduationyear + ", sname=" + sname + ", dept="
				+ dept + ", stream=" + stream + ", Mobileno=" + Mobileno + "]";
	}
	

}
