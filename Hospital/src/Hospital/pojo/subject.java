package Hospital.pojo;

/**
 *科室实体类 
 * @author moline-x
 * 2019-06-18
 * **/
public class subject {
	private Integer kid;
	private String kname;
	private Integer knum;
	private String kremark;
	
	public subject(Integer kid, String kname, Integer knum, String kremark) {
		super();
		this.kid = kid;
		this.kname = kname;
		this.knum = knum;
		this.kremark = kremark;
	}

	public subject() {
		super();
	}

	public Integer getKid() {
		return kid;
	}

	public void setKid(Integer kid) {
		this.kid = kid;
	}

	public String getKname() {
		return kname;
	}

	public void setKname(String kname) {
		this.kname = kname;
	}

	public Integer getKnum() {
		return knum;
	}

	public void setKnum(Integer knum) {
		this.knum = knum;
	}

	public String getKremark() {
		return kremark;
	}

	public void setKremark(String kremark) {
		this.kremark = kremark;
	}

	@Override
	public String toString() {
		return "subject [kid=" + kid + ", kname=" + kname + ", knum=" + knum + ", kremark=" + kremark + "]";
	}
	
	

}
