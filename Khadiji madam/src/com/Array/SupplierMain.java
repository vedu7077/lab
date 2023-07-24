package com.Array;

import java.util.ArrayList;
import java.util.Scanner;

class Supplier {
	int sId;
	String sName;
	Item item;
	
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	

}
	

 class Item {
	int iId;
	String iName;
	int iPrice;
	public int getiId() {
		return iId;
	}
	public void setiId(int iId) {
		this.iId = iId;
	}
	public String getiName() {
		return iName;
	}
	public void setiName(String iName) {
		this.iName = iName;
	}
	public int getiPrice() {
		return iPrice;
	}
	public void setiPrice(int iPrice) {
		this.iPrice = iPrice;
	}
	
	

}


 public class SupplierMain {
	 
	 
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			ArrayList<Supplier>al=new ArrayList();
			System.out.print("Enter the No. of Supplier: ");
			int num=sc.nextInt();
			for(int i=0;i<num;i++) {
				System.out.print("Enter the Supplier id: ");
				int sId=sc.nextInt();
				System.out.print("Enter the Supplier name: ");
				String sName=sc.next();
				System.out.print("Enter the item id: ");
				int iId=sc.nextInt();
				System.out.print("Enter the item Name: ");
				String iName=sc.next();
				System.out.print("Enter the item price: ");
				int iPrice=sc.nextInt();
				
				Supplier sp=new Supplier();
				sp.setsId(sId);
				sp.setsName(sName);
				sp.setItem(new Item());
				sp.getItem().setiId(iId);
				sp.getItem().setiName(iName);
				sp.getItem().setiPrice(iPrice);
				al.add(sp);

			}
			System.out.println("==================================");
			for(Supplier sp:al) {
				System.out.println(sp.getsId()+" "+sp.getsName()+" "+sp.getItem().getiId()+" "+sp.getItem().getiName()+" "+sp.getItem().getiPrice());
			}
			System.out.println("price is greter than 1000 :");
			for(Supplier sp:al) {
				if(sp.getItem().getiPrice()>1000)
				System.out.println(sp.getsId()+" "+sp.getsName()+" "+sp.getItem().getiId()+" "+sp.getItem().getiName()+" "+sp.getItem().getiPrice());

			}
			
		}

	
		

	}


