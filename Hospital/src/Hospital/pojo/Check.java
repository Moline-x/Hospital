package Hospital.pojo;

/**
 * 项目检查实体类
 * @author moline-x
 *2019-06-18
 */
public class Check {
	private Integer jid;
	private String jname;
	private String jremark;
	private Double jprice;
	
	public Check(Integer jid, String jname, String jremark, Double jprice) {
		super();
		this.jid = jid;
		this.jname = jname;
		this.jremark = jremark;
		this.jprice = jprice;
	}

	public Check() {
		super();
	}

	public Integer getJid() {
		return jid;
	}

	public void setJid(Integer jid) {
		this.jid = jid;
	}

	public String getJname() {
		return jname;
	}

	public void setJname(String jname) {
		this.jname = jname;
	}

	public String getJremark() {
		return jremark;
	}

	public void setJremark(String jremark) {
		this.jremark = jremark;
	}

	public Double getJprice() {
		return jprice;
	}

	public void setJprice(Double jprice) {
		this.jprice = jprice;
	}

	@Override
	public String toString() {
		return "Check [jid=" + jid + ", jname=" + jname + ", jremark=" + jremark + ", jprice=" + jprice + "]";
	}
	
	
	
	

}
