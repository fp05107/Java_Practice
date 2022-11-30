package com.masai.one_to_many_uniDir;

import javax.persistence.*;

@Entity
@Table(name = "PHONE")
public class Phone {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int phoneid;
	private String phonetype;
	private long phoneno;
	private int userid;

	public int getPhoneid() {
		return phoneid;
	}

	public void setPhoneid(int phoneid) {
		this.phoneid = phoneid;
	}

	public String getPhonetype() {
		return phonetype;
	}

	public void setPhonetype(String phonetype) {
		this.phonetype = phonetype;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

}
