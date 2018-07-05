package com.techaxis.people;

abstract public class PersonalInformation {
	private String name;
	private String email;
	private String id;
	private String phonoNo;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the phonoNo
	 */
	public String getPhonoNo() {
		return phonoNo;
	}
	/**
	 * @param phonoNo the phonoNo to set
	 */
	public void setPhonoNo(String phonoNo) {
		this.phonoNo = phonoNo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonalInformation [name=" + name + ", email=" + email + ", id=" + id + ", phonoNo=" + phonoNo + "]";
	}

}
