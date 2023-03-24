import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	static Scanner s = new Scanner(System.in);
	
	public static Product Create() {
		
		int ID;
		String Name;
		int Price;
		
		
		System.out.println("Enter ID");
		
		ID = Integer.parseInt(s.nextLine());
		
		System.out.println("Enter Name");
		
		Name = s.nextLine();
		
		System.out.println("Enter Price");
		
		Price = Integer.parseInt(s.nextLine());
		
		Product newProduct = new Product(ID, Name, Price);
		
		
		return newProduct;
	}
	
	
	public static void Read(ArrayList<Product> Products) {
		for (int i = 0; i < Products.size(); i++) {
			System.out.println("------------------------------");
			System.out.println("Product Id: " + Products.get(i).getID());
			System.out.println("Product Name: " + Products.get(i).getName());
			System.out.println("Product Price: " + Products.get(i).getPrice());
		}
		
		
	}
	
	public static void Update(ArrayList<Product> Products) {	
		System.out.println("Update Product. Enter ID of Product to update: ");
		int ID = Integer.parseInt(s.nextLine());
		
		int ProductIndex = getIndexByID(Products, ID);
		if (ProductIndex < 0) {
			System.out.println("Error Product not found");
		}
		else {
		
		System.out.println("Enter new Name");
		String Name = s.nextLine();
		System.out.println("Enter new Price");
		int Price = Integer.parseInt(s.nextLine());
		
		Products.get(ProductIndex).setName(Name);
		Products.get(ProductIndex).setPrice(Price);
		
		}
	}
	
	
	public static void Delete(ArrayList<Product> Products) {
		System.out.println("Deleting Product. Enter ID of Product to Delete: ");
		int ID = Integer.parseInt(s.nextLine());
		int ProductIndex = getIndexByID(Products, ID);
		if (ProductIndex < 0) {
			System.out.println("Error Product not found");
		}
		else {
		Products.remove(ProductIndex);
		}
		
	}
	
	// helper function to get index by Product id for update and delete operations
	public static int getIndexByID(ArrayList<Product> Products, int ID) {
		for(int i = 0; i < Products.size(); i++) {
			if (Products.get(i).getID() == ID)
				return i;
		}
			return -1; // Product Not Found
		
	}
	
public static void main(String[] args) {
	
	
	
	ArrayList<Product> Products = new ArrayList<Product>();
	
	
	// add 10 products first then ask for CRUD operations
	for (int i = 0; i < 10; i++) {
		Products.add(Create());
	}

	int choice;
	
	do {
	System.out.println("1 - Create");
	System.out.println("2 - Read");
	System.out.println("3 - Update");
	System.out.println("4 - Delete");
	System.out.println("5 - Exit");
	choice = Integer.parseInt(s.nextLine());
		
		switch(choice) {
		case 1:
			Products.add(Create());
			break;
		case 2:
			Read(Products);
			break;
		case 3:
			Update(Products);
			break;
		case 4:
			Delete(Products);
			break;
		case 5:
			System.out.println("GoodBye");
			break;		}
	}while(choice !=5);
	s.close();
}
	
	
}

