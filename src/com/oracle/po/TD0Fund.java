package com.oracle.po;

public class TD0Fund {

	private String id;
	private String orgid;
	private String orgname;
	private String orgno;
	private String orgcode;
	private String yearly;
	private int prefund;
	private int businessfund;
	private int dutyfund;
	private int buildfund;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public String getOrgno() {
		return orgno;
	}
	public void setOrgno(String orgno) {
		this.orgno = orgno;
	}
	public String getOrgcode() {
		return orgcode;
	}
	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}
	public String getYearly() {
		return yearly;
	}
	public void setYearly(String yearly) {
		this.yearly = yearly;
	}
	public int getPrefund() {
		return prefund;
	}
	public void setPrefund(int prefund) {
		this.prefund = prefund;
	}
	public int getBusinessfund() {
		return businessfund;
	}
	public void setBusinessfund(int businessfund) {
		this.businessfund = businessfund;
	}
	public int getDutyfund() {
		return dutyfund;
	}
	public void setDutyfund(int dutyfund) {
		this.dutyfund = dutyfund;
	}
	public int getBuildfund() {
		return buildfund;
	}
	public void setBuildfund(int buildfund) {
		this.buildfund = buildfund;
	}
	public String getOrgid() {
		return orgid;
	}
	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}
	@Override
	public String toString() {
		return "TD0Fund [id=" + id + ", orgid=" + orgid + ", orgname="
				+ orgname + ", orgno=" + orgno + ", orgcode=" + orgcode
				+ ", yearly=" + yearly + ", prefund=" + prefund
				+ ", businessfund=" + businessfund + ", dutyfund=" + dutyfund
				+ ", buildfund=" + buildfund + "]";
	}
	
	
}
