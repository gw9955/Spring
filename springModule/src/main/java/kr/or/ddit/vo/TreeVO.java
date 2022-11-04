package kr.or.ddit.vo;

import java.util.Date;

public class TreeVO {
	private String orgcode;
	private Date orgstartdate;
	private Date orgenddate;
	private String orgname;
	private String orglevel;
	private int orgstep;
	private String orguppercode;
	private String orgnote;

	public TreeVO() {
	}

	public String getOrgcode() {
		return orgcode;
	}

	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	public Date getOrgstartdate() {
		return orgstartdate;
	}

	public void setOrgstartdate(Date orgstartdate) {
		this.orgstartdate = orgstartdate;
	}

	public Date getOrgenddate() {
		return orgenddate;
	}

	public void setOrgenddate(Date orgenddate) {
		this.orgenddate = orgenddate;
	}

	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

	public String getOrglevel() {
		return orglevel;
	}

	public void setOrglevel(String orglevel) {
		this.orglevel = orglevel;
	}

	public int getOrgstep() {
		return orgstep;
	}

	public void setOrgstep(int orgstep) {
		this.orgstep = orgstep;
	}

	public String getOrguppercode() {
		return orguppercode;
	}

	public void setOrguppercode(String orguppercode) {
		this.orguppercode = orguppercode;
	}

	public String getOrgnote() {
		return orgnote;
	}

	public void setOrgnote(String orgnote) {
		this.orgnote = orgnote;
	}

	@Override
	public String toString() {
		return "TreeVO [orgcode=" + orgcode + ", orgstartdate=" + orgstartdate + ", orgenddate=" + orgenddate
				+ ", orgname=" + orgname + ", orglevel=" + orglevel + ", orgstep=" + orgstep + ", orguppercode="
				+ orguppercode + ", orgnote=" + orgnote + "]";
	}

}
