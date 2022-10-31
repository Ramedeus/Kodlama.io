package katmanliMimari.business;

import katmanliMimari.core.loging.Logger;
import katmanliMimari.dataAccess.CategoryDao;
import katmanliMimari.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	
	private Logger[] loggers;
	
	
	public CategoryManager (CategoryDao categoryDao,Logger[] loggers) {
		this.categoryDao=categoryDao;
		this.loggers=loggers;
	}
	
	public void add(Category category) throws Exception {
		if (category.getCategoryName()=="PHP") {
			throw new Exception(category.getCategoryName()+" kategorisi mevcuttur.");
		}
		
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
	
	
}
