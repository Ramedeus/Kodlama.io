package staticDemo;

public class Main {
	
	public static void main (String[] args) {
		ProductManager productManager=new ProductManager();
		Product product=new Product();
		
		product.name="";
		product.price=100;
		
		productManager.add(product);
		
	}
	
	
}
