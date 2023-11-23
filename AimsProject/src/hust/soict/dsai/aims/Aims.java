//BuiTaDuc 20215035
package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.test.cart.DigitalVideoD;

public class Aims {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cart of Bui Ta Duc 20215035\n");
				// Create a new cart
				Cart anOrder = new Cart();
				// Create a new dvd object and 
				DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
				DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
				DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
				DigitalVideoDisc dvd4 = new DigitalVideoDisc("Spider-man", "Action", 20.99f);
				
				// Add dvd to the cart
				anOrder.addDigitalVideoDisc(dvd1);
				anOrder.addDigitalVideoDisc(dvd2);
				anOrder.addDigitalVideoDisc(dvd3);
				anOrder.addDigitalVideoDisc(dvd4);
				System.out.println();
				
				// Remove dvd from the cart
				anOrder.removeDigitalVideoDisc(dvd3);
				anOrder.removeDigitalVideoDisc(dvd4);
				
				System.out.println();

				// print total cost of the items in the cart
				System.out.println("Total Cost is: ");
				System.out.println(anOrder.totalCost());
				
				//Bui Ta Duc 20215035
				DigitalVideoDisc[] listDVD = {dvd1, dvd2, dvd3};
				anOrder.addDigitalVideoDisc(listDVD);
				anOrder.addDigitalVideoDisc(dvd1, dvd4);
	}
}
