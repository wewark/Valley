//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : VirtualStore.java
//  @ Date : 14/12/2017
//  @ Author : 
//
//



package Models;


import java.util.ArrayList;

public class VirtualStore extends Store {
	public ArrayList<VirtualStoreProduct> products;

	public VirtualStore(int ID, String name, StoreOwner storeOwner) {
		super(ID, name, storeOwner);
	}

	@Override
	public boolean addProduct(Product product, float Price) {
		if(product instanceof VirtualProduct) {
			products.add(new VirtualStoreProduct(Price, (VirtualProduct) product));
			return true;
		}
		else return false;
	}
}
