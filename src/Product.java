
public class Product {
	private int ID;
	private String Name;
	private int Price;
	
	Product(int _id, String _name, int Price){
		this.setID(_id);
		this.setName(_name);
		this.setPrice(Price);
	}
	
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public int getPrice() {
		return Price;
	}
	
	public void setPrice(int price) {
		Price = price;
	}
	
	/*
	 * In the main class, create an array of 10 objects of Product type and perform CRUD (Create, Read, Update,
Delete) operations with the below options.
1-Create Record
2- Read Record
3- Update Record
4- Delete Record
5- Exit
	 */
}
