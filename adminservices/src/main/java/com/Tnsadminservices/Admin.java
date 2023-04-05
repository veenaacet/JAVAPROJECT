package com.Tnsadminservices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin { 
	private Integer ad_id;
	private String ad_location;
	private String ad_name;
	private double ad_salary;
	private String ad_gender;
	private String ad_mall_name;
	private String ad_mail_Id;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(Integer ad_id, String ad_location, String ad_name, double ad_salary, String ad_gender,
			String ad_mall_name, String ad_mail_Id) {
		super();
		this.ad_id = ad_id;
		this.ad_location = ad_location;
		this.ad_name = ad_name;
		this.ad_salary = ad_salary;
		this.ad_gender = ad_gender;
		this.ad_mall_name = ad_mall_name;
		this.ad_mail_Id = ad_mail_Id;
	}
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	public Integer getAd_id() {
		return ad_id;
	}
	public void setAd_id(Integer ad_id) {
		this.ad_id = ad_id;
	}
	public String getAd_location() {
		return ad_location;
	}
	public void setAd_location(String ad_location) {
		this.ad_location = ad_location;
	}
	public String getAd_name() {
		return ad_name;
	}
	public void setAd_name(String ad_name) {
		this.ad_name = ad_name;
	}
	public double getAd_salary() {
		return ad_salary;
	}
	public void setAd_salary(double ad_salary) {
		this.ad_salary = ad_salary;
	}
	public String getAd_gender() {
		return ad_gender;
	}
	public void setAd_gender(String ad_gender) {
		this.ad_gender = ad_gender;
	}
	public String getAd_mall_name() {
		return ad_mall_name;
	}
	public void setAd_mall_name(String ad_mall_name) {
		this.ad_mall_name = ad_mall_name;
	}
	public String getAd_mail_Id() {
		return ad_mail_Id;
	}
	public void setAd_mail_Id(String ad_mail_Id) {
		this.ad_mail_Id = ad_mail_Id;
	}
	public String toString()
	{
			return "Admin Id:"+ad_id+" Admin Name:"+ad_name+" Admin Location:"+ad_location+" Admin Salary:"+ad_salary+"Mall Name:"+"mall_name"+
				"Admin Gender"+ad_gender+" Admin MailId:"+ad_mail_Id;
	}
	

}
