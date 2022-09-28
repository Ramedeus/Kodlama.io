package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		ProductManager productManager=new ProductManager();
		
		product.id=1;
		product.name="Laptop";
		product.description="Asus Laptop";
		product.price=5000;
		product.stockAmount=3;
		
		System.out.println(product.name);
		
		productManager.add(product);
		
	}

}
