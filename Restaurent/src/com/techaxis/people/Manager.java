package com.techaxis.people;

public class Manager extends RestaurentStaff {
	private String[] duties;

	public void sendEmail() {
		System.out.println("This is email for the Manager Only!!");
	}
	/**
	 * @return the duties
	 */
	public String[] getDuties() {
		return duties;
	}

	/**
	 * @param duties the duties to set
	 */
	public void setDuties(String[] duties) {
		this.duties = duties;
	}

}
