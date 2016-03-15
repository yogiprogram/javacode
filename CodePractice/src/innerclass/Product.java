package innerclass;

public class Product {

	int itemid;
	String description;
	String category;
	double price;
	double sTax;

	
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public Product(int itemid, String description, String category, double price, double sTax) {
		super();
		this.itemid = itemid;
		this.description = description;
		this.category = category;
		this.price = price;
		this.sTax = sTax;
	}

	public Product(int itemid, String category, double price, double sTax) {
		super();
		this.itemid = itemid;
		this.category = category;
		this.price = price;
		this.sTax = sTax;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the itemid
	 */
	public int getItemid() {
		return itemid;
	}

	/**
	 * @param itemid
	 *            the itemid to set
	 */
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the sTax
	 */
	public double getsTax() {
		return sTax;
	}

	/**
	 * @param sTax
	 *            the sTax to set
	 */
	public void setsTax(double sTax) {
		this.sTax = sTax;
	}

}
