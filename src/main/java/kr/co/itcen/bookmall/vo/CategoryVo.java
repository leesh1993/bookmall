package kr.co.itcen.bookmall.vo;

public class CategoryVo {
	private int ctgr_no;
	private String ctgr_name;
	
	public int getCtgr_no() {
		return ctgr_no;
	}
	public void setCtgr_no(int ctgr_no) {
		this.ctgr_no = ctgr_no;
	}
	public String getCtgr_name() {
		return ctgr_name;
	}
	public void setCtgr_name(String ctgr_name) {
		this.ctgr_name = ctgr_name;
	}
	
	@Override
	public String toString() {
		return "CategoryVo [ctgr_no=" + ctgr_no + ", ctgr_name=" + ctgr_name + "]";
	}
		
}
