package katmanliMimari.dataAccess;

import katmanliMimari.entities.Category;

public class JdbcCategroyDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println(category.getCategoryName()+" kursu JDBC ile eklendi");
	}

}
