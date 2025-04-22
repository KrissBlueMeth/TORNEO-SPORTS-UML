package negocio;

import java.util.List;

public interface CrudGenerico<J,PK> {

	int insertOne(J obj);
	int updateOne(J obj);
	int deleteOne(PK objId);
	List<J> findAll();
	J findById(PK objId);
}
