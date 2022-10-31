package katmanliMimari.dataAccess;

import katmanliMimari.entities.Instractor;

public class HibernateInstractorDao implements InstractorDao{

	@Override
	public void add(Instractor instractor) {
		System.out.println(instractor.getName()+ " eğitmen Hibernate ile eklendi.");		
	}

}
