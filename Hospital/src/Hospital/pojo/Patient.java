package Hospital.pojo;


/**
 * 病人实体类
 * @author moline-x
 * 2019-06-18
 */
public class Patient {
	private Integer pid;
	private String pname;
	private Integer page;
	private String psex;
	private Integer pphone;
	
	public Patient(Integer pid, String pname, Integer page, String psex, Integer pphone) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.psex = psex;
		this.pphone = pphone;
	}
	
	
	public Patient(String pname, Integer page, String psex, Integer pphone) {
		super();
		this.pname = pname;
		this.page = page;
		this.psex = psex;
		this.pphone = pphone;
	}

	public Patient() {
		super();
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getPsex() {
		return psex;
	}

	public void setPsex(String psex) {
		this.psex = psex;
	}

	public Integer getPphone() {
		return pphone;
	}

	public void setPphone(Integer pphone) {
		this.pphone = pphone;
	}

	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", page=" + page + ", psex=" + psex + ", pphone=" + pphone
				+ "]";
	}
	

}
