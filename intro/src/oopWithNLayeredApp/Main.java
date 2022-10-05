package oopWithNLayeredApp;


import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.loging.DataBaseLogger;
import oopWithNLayeredApp.core.loging.FileLogger;
import oopWithNLayeredApp.core.loging.Logger;
import oopWithNLayeredApp.core.loging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception{
		Product product1 = new Product(1,"Iphone Xr",10000);
		Logger[] loggers = {new DataBaseLogger(), new FileLogger(), new MailLogger()};
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
	}

}
