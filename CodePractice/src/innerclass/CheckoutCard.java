package innerclass;

import java.util.ArrayList;
import java.util.List;

public class CheckoutCard {

	
	static List<Product> listProduct = new ArrayList<>();

	static{
		listProduct.add(new Product(1,"prod_A_1", "A", 212.5, .2));
		listProduct.add(new Product(2,"prod_A_2", "A", 142.1, .2));
		listProduct.add(new Product(3,"prod_A_3", "A", 332.1, .2));
		listProduct.add(new Product(4,"prod_A_4", "A", 132.6, .2));
		listProduct.add(new Product(1,"prod_B_1", "B", 132.1, .2));
		listProduct.add(new Product(2,"prod_B_2", "B", 123.1, .2));
		listProduct.add(new Product(3,"prod_B_3", "B", 444.1, .2));
		listProduct.add(new Product(4,"prod_B_4", "B", 555,	  .2));
		listProduct.add(new Product(1,"prod_C_1", "C`", 545.1, .2));
		listProduct.add(new Product(2,"prod_C_2", "C", 1222.1, .2));
	}

	
}
