package com.techaxis.people;

import java.util.ArrayList;

public class Chef extends RestaurentStaff {
	//private String expertyInFoodMaking;
	//private final float BONUS_PERCENTAGE_FOR_CHEF = 0.10f;

	private ArrayList<String> foodListChefCanPrepare=new ArrayList<>() ;

	/**
	 * @return the foodListChefCanPrepare
	 */
	public ArrayList<String> getFoodListChefCanPrepare() {
		return foodListChefCanPrepare;
	}

	/**
	 * @param foodListChefCanPrepare the foodListChefCanPrepare to set
	 */
	/*public void setFoodListChefCanPrepare(ArrayList<String> foodListChefCanPrepare) {
		this.foodListChefCanPrepare = foodListChefCanPrepare;
	}*/

	public void setFoodListChefCanPrepare(ArrayList<String> foodList) {
		// TODO Auto-generated method stub
		this.foodListChefCanPrepare = foodList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+"Chef [foodListChefCanPrepare=" + foodListChefCanPrepare + "]";
	}

	

	

}
