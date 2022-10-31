package katmanliMimari.business;

import katmanliMimari.core.loging.Logger;
import katmanliMimari.dataAccess.InstractorDao;
import katmanliMimari.entities.Instractor;

public class InstractorManager {
	
	private InstractorDao instractorDao;
	
	private Logger[] loggers;
	
	public InstractorManager (InstractorDao instractorDao, Logger[] loggers) {
		this.instractorDao=instractorDao;
		this.loggers=loggers;
	}
	
	public void add(Instractor instractor) {
		System.out.println(instractor.getName()+" isimli eğitmen oluşruruldu.");
		instractorDao.add(instractor);
		
		for (Logger logger : loggers) {
			logger.log(instractor.getName()+" eğitmen oluşturuldu.");
		}
	}
	
}
