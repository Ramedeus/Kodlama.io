package staticDemo;

public class ProductManager {
	public void add(Product product) {
		if(ProductValidator.validate(product)) {
			System.out.println("Ürün eklendi");
		} else {
			System.out.println("Ürün geçersiz");
		}
	}
}
