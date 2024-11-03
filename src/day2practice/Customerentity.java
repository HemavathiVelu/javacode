package day2practice;

public class Customerentity {
	private int cid;
	private String cname,address,city;
	
	
	public int getCid() {
		return cid;
	}
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customerentity [cid=" + cid + ", cname=" + cname + ", address=" + address + ", city=" + city + "]";
	}
	
	
	
	
	
	
	
	

}
