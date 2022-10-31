package katmanliMimari.business;

import katmanliMimari.core.loging.Logger;
import katmanliMimari.dataAccess.CourseDao;
import katmanliMimari.entities.Course;

public class CourseManager {
	private CourseDao courseDao;

	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getCourseName() == "Yazılım") {
			throw new Exception(course.getCourseName() + " kursu mevcuttur.");
		}

		if (course.getPrice() < 0) {
			throw new Exception(" Bir kursun fiyatı 0 dan küçük olamaz");
		}

		System.out.println(course.getCourseName() + " kursu eklendi");
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}

}
