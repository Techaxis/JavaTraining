package com.techaxis.foodInfo;

public class Table {
	public static void main(String[] args) {
		Table tablefeatures=new Table();
		tablefeatures.getInformation();
		tablefeatures.showInformation(null,null);
		tablefeatures.showInformationOfMenu(null,null,null,null);
		//tablefeatures.showInformationOfEnergy(null,null,null,null.null)
	}

	//private void showInformationOfMenu(Object object, Object object2, Object object3, Object object4) {
		// TODO Auto-generated method stub
		
	//}

	private void showInformationOfMenu(String[]menuItem, int[] price, String[]menuCatogory, boolean []isbevrage) {
		// TODO Auto-generated method stub
		for(int i=0;i<menuItem.length;i++)
		{
			System.out.println("Menu Item\t\tmenu Catogory\t\tprice\t\tIs bevrage?");
			System.out.println(menuItem[i]+"\t\t"+menuCatogory[i]+"\t\t"+price+"\t\t"+isbevrage[i]);
		}
		
	}

	private void showInformation(int []tableNumber,int []tableCapacity) {
		// TODO Auto-generated method stub
	for(int i=0;i<tableNumber.length;i++)	
		System.out.println("The table No is="+tableNumber[i]+"capacity with this table="+tableCapacity[i]);
	}

	public void getInformation() {
		// TODO Auto-generated method stub
		int []tableNumber= {1,2,3,4,5,6,7};
		int []tableCapacity= {3,4,3,6,4,7,3};
		showInformation(tableNumber,tableCapacity);
	}
	public void getInformationOfMenu() {
		 String []menuItems= {"chickenmomo","buff-momo","Veg-MOMO","coke","sprite","fanta","beer"};
		 int []price= {140,130,120,40,40,50,400};
		 String []menuCatogory= {"non-veg","non-veg","Veg","Veg","Veg","Veg","Veg"};
		 boolean[]isBevreage= {false,false,false,true,true,true,true};
		 showInformationOfMenu(menuItems,price,menuCatogory,isBevreage);
	}
public void getInformationOfEnergy() {
	// String []menuItems= {"chickenmomo","buff-momo","Veg-MOMO","coke","sprite","fanta","beer"};
	 //double []energyTotal= {104.43,103.21,100.43,50.43,34.43,32.43,54.23};
	 //double[]protenTotal={104.43,103.21,100.43,50.43,34.43,32.43,54.23};
	 //double[]fiberTotal={104.43,103.21,100.43,50.43,34.43,32.43,54.23};
	 //double[]carbohydrate={104.43,103.21,100.43,50.43,34.43,32.43,54.23};
	// showInformationOfEnergy(menuItems,energyTotal,protenTotal,fiberTotal,carbohydrate);
	 
}

//private void showInformationOfEnergy(String[] menuItems, double[] energyTotal, double[] protenTotal,
		//double[] fiberTotal, double[] carbohydrate) {
	// TODO Auto-generated method stub
	//for(int i=0;i<energyTotal.length;i++)	
	//	System.out.println("
//}
}
