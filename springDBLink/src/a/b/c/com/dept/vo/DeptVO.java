package a.b.c.com.dept.vo;

public class DeptVO {
	
	private String deptid;
	private String deptname;
	private String depttel;
	private String deleteyn;
	
	public DeptVO() {

	}

	public DeptVO(String deptid, String deptname, String depttel, String deleteyn) {
		
		this.deptid = deptid;
		this.deptname = deptname;
		this.depttel = depttel;
		this.deleteyn = deleteyn;
	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getDepttel() {
		return depttel;
	}

	public void setDepttel(String depttel) {
		this.depttel = depttel;
	}
	
	public String getDeleteyn() {
		return deleteyn;
	}
	
	public void setDeleteyn(String deleteyn) {
		this.deleteyn = deleteyn;
	}
	
}
