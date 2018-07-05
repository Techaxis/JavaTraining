package com.techaxis.people;

import java.util.ArrayList;

//import java.util.Arrays;

public class PeopleController {
	private void loadAndShowChefInformation() {
		Address hemAddress = new Address();
		hemAddress.setStreet1("Lalitypur 324 Kumaripati Lalitpur");
		hemAddress.setSteet2("house no 32 4th floor room no 32");
		hemAddress.setDistrict("Lalitpur");
		hemAddress.setCity("Lagankhel");
		hemAddress.setCountry("Nepal");
		hemAddress.setZipCode("4324");
		hemAddress.setState("7");
		

		Chef chef1 = new Chef();
		ArrayList <String> foodList=new ArrayList<>();
		foodList.add("MOMO");
		foodList.add("PIZZA");
		foodList.add("MOMO");
		foodList.add("PIZZA");
		foodList.add("MOMO");
		foodList.add("PIZZA");
		chef1.setFoodListChefCanPrepare(foodList);
		chef1.setName("Hari Bahadur");

		chef1.setEmail("bibek@gmail.com");
		chef1.setPhonoNo("9848772605");
		chef1.setAddress(hemAddress);
		// chef1.setAge(21);
		chef1.setQualification("Food Expert");
		//chef1.setExpertyInFoodMaking("MOMO");
		System.out.println(chef1);
		//return NULL;
	}

	private RestaurentStaff loadAndShowStaffInformation() {
		RestaurentStaff staff1 = new RestaurentStaff();
		Address hemAddress = new Address();
		hemAddress.setStreet1("Lalitypur 324 Kumaripati Lalitpur");
		hemAddress.setSteet2("house no 32 4th floor room no 32");
		hemAddress.setDistrict("Lalitpur");
		hemAddress.setCity("Lagankhel");
		hemAddress.setCountry("Nepal");
		hemAddress.setZipCode("4324");
		hemAddress.setState("7");
		staff1.setName("Hari Bahadur");

		staff1.setEmail("bibek@gmail.com");
		staff1.setPhonoNo("9848772605");
		staff1.setAddress(hemAddress);
		staff1.setAge(21);
		staff1.setQualification("Food Expert");

		RestaurentStaff staff2 = new RestaurentStaff();
		staff2.setName("Hari Bahadur");
		staff2.setEmail("bibek@gmail.com");
		staff2.setPhonoNo("9848772605");
		staff2.setAddress(hemAddress);
		staff2.setAge(21);
		RestaurentStaff staff3 = new RestaurentStaff();
		staff3.setName("Hari Bahadur");

		staff3.setEmail("bibek@gmail.com");
		staff3.setPhonoNo("9848772605");
		staff3.setAddress(hemAddress);
		staff3.setAge(21);
		staff3.setQualification("Manager Expert");

		staff1.setQualification("account Expert");
		System.out.println(staff1);
		System.out.println(staff2);
		System.out.println(staff3);
		Utility util = new Utility();
		System.out.println(util.AVAILABLE_FOOD[0]);
		return staff1;

	}

	private void loadAndShowCostumer() {
		CustomerInformation customer1 = new CustomerInformation();
		customer1.setName("Bibek");
		customer1.setEmail("bibek@gmail.com");
		customer1.setPhonoNo("9848772605");
		customer1.setId("BEX1");
		customer1.setOrderFoodName("MOMO");
		customer1.setQuantity(2);
		customer1.setBillingAmount(350);

		CustomerInformation customer2 = new CustomerInformation();
		customer2.setName("Hari");
		customer2.setEmail("hari@gmail.com");
		customer2.setPhonoNo("78947237983");
		customer2.setId("BEC12");
		customer2.setOrderFoodName("BUFF MOMO");
		customer2.setQuantity(3);
		customer2.setBillingAmount(450);

		CustomerInformation customer3 = new CustomerInformation();
		customer3.setName("Hari");
		customer3.setEmail("hari@gmail.com");
		customer3.setPhonoNo("78947237983");
		customer3.setId("BEC12");
		customer3.setOrderFoodName("BUFF MOMO");
		customer3.setQuantity(3);
		customer3.setBillingAmount(450);

		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RestaurentStaff hemInfo=new RestaurentStaff();
		PeopleController people = new PeopleController();
		//people.loadAndShowCostumer();
		//people.loadAndShowStaffInformation();
		people.loadAndShowChefInformation();
		//System.out.println(hemInfo.getAddress().getZipCode());
	}
}
