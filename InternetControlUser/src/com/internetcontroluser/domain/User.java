package com.internetcontroluser.domain;

import java.util.Date;

public class User {
	private String name;
	private String secondname;
	private String macaddress;
	private String ipaddress;
	private String plan;
	private Date dateToPay;
	private int usedTraffic;
	
	public User(String name, String secondname, String macaddress, String ipaddress, String plan, Date dateToPay, int usedTraffic){
		this.name = name;
		this.secondname = secondname;
		this.macaddress = macaddress;
		this.ipaddress = ipaddress;
		this.plan = plan;
		this.dateToPay = dateToPay;
		this.usedTraffic = usedTraffic;
	}
	
	public User(String nameOther, String secondnameOther, int usedTraffic){
		this.name = nameOther;
		this.secondname = secondnameOther;
		this.usedTraffic = usedTraffic;
	}
	
	public User(String nameNew, String secondNameNew, String plan){
		this.name = nameNew;
		this.secondname = secondNameNew;
		this.plan = plan;
	}
	
	public User(String name, String plan){
		this.name = name;
		this.plan = plan;
	}
	
	public User(String name, Date dayToPay){
		this.name = name;
		this.dateToPay = dayToPay;
	}

	public String getName() {
		return name;
	}

	public String getSecondname() {
		return secondname;
	}

	public String getMacaddress() {
		return macaddress;
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public String getPlan() {
		return plan;
	}

	public Date getDateToPay() {
		return dateToPay;
	}

	public int getUsedTraffic() {
		return usedTraffic;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	public void setMacaddress(String macaddress) {
		this.macaddress = macaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public void setDateToPay(Date dateToPay) {
		this.dateToPay = dateToPay;
	}

	public void setUsedTraffic(int usedTraffic) {
		this.usedTraffic = usedTraffic;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", secondname=" + secondname
				+ ", macaddress=" + macaddress + ", ipaddress=" + ipaddress
				+ ", plan=" + plan + ", dateToPay=" + dateToPay
				+ ", usedTraffic=" + usedTraffic + "]";
	}
	
	
}
