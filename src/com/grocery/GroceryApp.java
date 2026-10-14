package com.grocery;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;



public class GroceryApp {

	public static void main(String[] args) {
		
		GroceryService service = new GroceryServiceIMPL();
		
		Scanner sc = new Scanner(System.in);
		
		boolean exit = true;
		int ch = 8;
		
		while(exit) {
			try {
				//listing all the products
				
				ArrayList<Product> products = service.getproduct();
				ArrayList<CartItem> cart = new ArrayList<>();
				
				boolean shopping = true;
				
				while(shopping) {
					
				for(Product p: products) {
					System.out.println("product Id:"+p.getId()+" product:"+p.getName()+" rs:"+p.getPrice());
				}
				System.out.println("enter '0' to exit the shopping cart...");
				
				
				//select the product
				
				System.out.println("Enter product Id: ");
				int id = sc.nextInt();
				
				if(id != 1 && id !=2 && id !=3 && id !=4 && id !=5) {
					shopping = false;
					break;
				}
				
				System.out.println("Enter product Quantity: ");
				int quant = sc.nextInt();
				
				
					
				for(Product p:products) {

					if(p.getId()==id) {
						cart.add(new CartItem(p,quant));
						System.out.println("product added into the cart.....");
						System.out.println("--------------------------------------------------\n");
						
						}
					
				}
								
			}//while loop shopping ended
				
				
				
				//calculating total
				double total =0;
				for(CartItem cartitem:cart) {
					
					total += cartitem.getProduct().getPrice()*cartitem.getQuantity();
				}
				
				System.out.println("select bagType:");
				System.out.println("1.plastic bag");
				System.out.println("2.Wooden bag");
				System.out.println("3.No bag");
				
				System.out.print("selected bag: ");
				int type = sc.nextInt();
				
				while(type != 1 && type != 2 && type != 3) {
					System.out.print("enter valid option: ");
					type = sc.nextInt();
				}
				switch(type) {
					case 1: 
						System.out.println("Plastic bag");
						break;
					case 2:
						System.out.println("Wooden bag");
						break;
					case 3:
						System.out.println("No bag");
						break;
						
				}
				
				
				System.out.println("select paymentType:");
				System.out.println("1.UPI");
				System.out.println("2.Card");
				System.out.println("3.Cash");
				
				System.out.print("selected payment type: ");
				int ptype = sc.nextInt();
				
				while(ptype!=1 && ptype!=2 && ptype!=3) {
					System.out.print("enter valid option: ");
					ptype = sc.nextInt();
				}
				
				switch(ptype) {
					case 1: 
						System.out.println("UPI");
						break;
					case 2:
						System.out.println("Card");
						break;
					case 3:
						System.out.println("Cash");
						break;	
				}
				
				service.saveOrder(total, type, ptype);
				
				System.out.println("payment successfull: "+total);
				
				
				
				
				System.out.println("enter '0' to exit...");
				System.out.println("else enter any number to continue shopping ..");
				ch = sc.nextInt();
				if(ch == 0) {
					exit = false;
					System.out.println("Thankyou visit again :)");
				}
				
				
				
	
			}
			catch(SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}


}
