package com.techaxis.people;

public class Utility {
	final public static String[] AVAILABLE_FOOD = new String[] { "momo", "burger", "PIZZA", "coke", "Beer" };
	//private final float BONUS_PERCENTAGE_FOR_CHEF=(float)0.1;
	
	/**
	 * @return the availableFood
	 */
	public String[] getAvailableFood() {
		return AVAILABLE_FOOD;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Utility [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
