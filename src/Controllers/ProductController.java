//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : ProductController.java
//  @ Date : 14/12/2017
//  @ Author : 
//
//


package Controllers;


import Models.Platform;
import Models.Product;

import java.util.Scanner;

public class ProductController {
	public static boolean addProduct(Product product) {
		if (Product.exists(product)) {
			System.out.println("Product already exists");
			return false;
		}

		Product.addToDB(product);
		return true;
	}

	public static boolean addSuggestedProduct(Product product) {

		if (Product.existsSuggested(product)) {
			System.out.println("Product already exists");
			return false;
		}

		Product.addToSuggestedDB(product);
		return true;
	}

	public static boolean deleteSuggestedProduct(Product product) {

		if (Product.existsSuggested(product)) {
			return Product.deleteSuggestedDB(product);
		}
		return false;
	}

	public void viewProduct() {

	}


	//Console Function
	public static Product ChooseSuggestedProduct()
	{
		Scanner sc = new Scanner(System.in);
		int i = 0;
		if(Platform.SuggestedProducts.size() > 0) {
			for (Product product : Platform.SuggestedProducts) {
				System.out.println(++i + ". " + product.viewDetails());
			}
			System.out.print("Choose Product: ");
			while ((i = sc.nextInt()) < 1 || i > Platform.SuggestedProducts.size()) //Input-Validation
				System.out.print("Invalid Input");

			return Platform.SuggestedProducts.get(i - 1);
		}
		return null;
	}


}
