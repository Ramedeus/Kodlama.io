package katmanliMimari.dataAccess;

import katmanliMimari.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println(category.getCategoryName()+" kursu hibernate ile eklendi.");
	}
	
}
