package com.oracle.po;

import java.util.List;

public class TD0Organization {
	private String id;
	private String orgno;
	private String orgcode;
	private String orgname;
	private String exetype;
	private String areacode;
	private String linkadd;
	private String listingdate;
	private String standalonedate;
	private String areatype;
	private String zbbdocdate;
	private String orglevel;
	private String orgpro;
	private String zipcode;	
	private List<TD0Orgattached> orgattachedlist;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public String getExetype() {
		return exetype;
	}
	public void setExetype(String exetype) {
		this.exetype = exetype;
	}
	public String getAreacode() {
		return areacode;
	}
	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}
	public String getLinkadd() {
		return linkadd;
	}
	public void setLinkadd(String linkadd) {
		this.linkadd = linkadd;
	}
	public String getListingdate() {
		return listingdate;
	}
	public void setListingdate(String listingdate) {
		this.listingdate = listingdate;
	}
	public String getStandalonedate() {
		return standalonedate;
	}
	public void setStandalonedate(String standalonedate) {
		this.standalonedate = standalonedate;
	}
	public String getAreatype() {
		return areatype;
	}
	public void setAreatype(String areatype) {
		this.areatype = areatype;
	}
	public String getZbbdocdate() {
		return zbbdocdate;
	}
	public void setZbbdocdate(String zbbdocdate) {
		this.zbbdocdate = zbbdocdate;
	}
	public String getOrglevel() {
		return orglevel;
	}
	public void setOrglevel(String orglevel) {
		this.orglevel = orglevel;
	}
	public String getOrgpro() {
		return orgpro;
	}
	public void setOrgpro(String orgpro) {
		this.orgpro = orgpro;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public List<TD0Orgattached> getOrgattachedlist() {
		return orgattachedlist;
	}
	public void setOrgattachedlist(List<TD0Orgattached> orgattachedlist) {
		this.orgattachedlist = orgattachedlist;
	}
	@Override
	public String toString() {
		return "TD0Organization [id=" + id + ", orgno=" + orgno + ", orgcode="
				+ orgcode + ", orgname=" + orgname + ", exetype=" + exetype
				+ ", areacode=" + areacode + ", linkadd=" + linkadd
				+ ", listingdate=" + listingdate + ", standalonedate="
				+ standalonedate + ", areatype=" + areatype + ", zbbdocdate="
				+ zbbdocdate + ", orglevel=" + orglevel + ", orgpro=" + orgpro
				+ ", zipcode=" + zipcode + ", orgattachedlist="
				+ orgattachedlist + "]";
	}
	

	
	
}
