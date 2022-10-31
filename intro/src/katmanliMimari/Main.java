package katmanliMimari;

import katmanliMimari.business.CategoryManager;
import katmanliMimari.business.CourseManager;
import katmanliMimari.business.InstractorManager;
import katmanliMimari.core.loging.DataBaseLogger;
import katmanliMimari.core.loging.FileLogger;
import katmanliMimari.core.loging.Logger;
import katmanliMimari.core.loging.MailLogger;
import katmanliMimari.dataAccess.HibernateCategoryDao;
import katmanliMimari.dataAccess.HibernateInstractorDao;
import katmanliMimari.dataAccess.JdbcCourseDao;
import katmanliMimari.entities.Category;
import katmanliMimari.entities.Course;
import katmanliMimari.entities.Instractor;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new DataBaseLogger(), new FileLogger(), new MailLogger() };

		Instractor instractor = new Instractor(1, "Erdem", "U", "JAVA");
		Course course = new Course(1, "Programlama", 10, instractor, 5, 15);
		Category category = new Category(1,"JAVA");
		
		InstractorManager instractorManager = new InstractorManager(new HibernateInstractorDao(), loggers);
		instractorManager.add(instractor); 
		
		System.out.println("-----------");
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course);
		
		System.out.println("-----------");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category);

	}

}
