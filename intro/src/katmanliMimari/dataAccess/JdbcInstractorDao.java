package katmanliMimari.dataAccess;

import katmanliMimari.entities.Instractor;

public class JdbcInstractorDao implements InstractorDao {

	@Override
	public void add(Instractor instractor) {
		System.out.println(instractor.getName() + " eğitmen JDBC ile eklendi.");
	}

}
