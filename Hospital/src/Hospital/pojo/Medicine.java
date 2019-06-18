package Hospital.pojo;

/**
 * 药物实体类
 * @author moline-x
 * 2019-06-18
 * **/
public class Medicine {
	private Integer mid;
	private String mname;
	private String mfunction;
	private Integer mclass;
	private	Double mprice;
	
	public Medicine(Integer mid, String mname, String mfunction, Integer mclass, Double mprice) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mfunction = mfunction;
		this.mclass = mclass;
		this.mprice = mprice;
	}

	public Medicine() {
		super();
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMfunction() {
		return mfunction;
	}

	public void setMfunction(String mfunction) {
		this.mfunction = mfunction;
	}

	public Integer getMclass() {
		return mclass;
	}

	public void setMclass(Integer mclass) {
		this.mclass = mclass;
	}

	public Double getMprice() {
		return mprice;
	}

	public void setMprice(Double mprice) {
		this.mprice = mprice;
	}

	@Override
	public String toString() {
		return "Medicine [mid=" + mid + ", mname=" + mname + ", mfunction=" + mfunction + ", mclass=" + mclass
				+ ", mprice=" + mprice + "]";
	}
	
	
	
	
	

}
