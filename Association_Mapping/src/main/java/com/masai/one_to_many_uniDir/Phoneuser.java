package com.masai.one_to_many_uniDir;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "PHONEUSER")
public class Phoneuser {
	@Id
	private int userid;
	
	private String useremail;
	
	private String username;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "USERID")
	private List<Phone> phoneTables;

	
	
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Phone> getPhoneTables() {
		return phoneTables;
	}

	public void setPhoneTables(List<Phone> phoneTables) {
		this.phoneTables = phoneTables;
	}
	
	
}
