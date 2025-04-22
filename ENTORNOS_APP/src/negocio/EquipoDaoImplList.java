package negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entidades.Equipo;

public class EquipoDaoImplList implements EquipoDao{
	
	private List<Equipo> leq;
	 
	
	
	public EquipoDaoImplList() {
		super();
		this.leq = new ArrayList<>();
		cargarDatos();	
	}
	
	
	private void cargarDatos() {
		leq.add(new Equipo("AAA", "Los+Chulos", LocalDate.of(2025,  4, 16)));
		leq.add(new Equipo("BBB", "LosSobraos", LocalDate.of(2025, 4, 10)));
	}

	@Override
	public int insertOne(Equipo obj) {
		if (leq.contains(obj))
			return 0;
		else if (leq.add(obj));
		    return 1;
			
	}

	@Override
	public int updateOne(Equipo obj) {
		int index =leq.indexOf(obj);
		if (index != -1) {
			leq.set(index, obj);
			return 1;
		}
		return 0;
	}

	@Override
	public int deleteOne(String objId) {
		for(Equipo ele: leq) {
			if(ele.getId().equals(objId)) {
				leq.remove(ele);
				return 1;
			}
		}
		return 0;
	}

	@Override
	public List<Equipo> findAll() {
	
		return leq;
	}

	@Override
	public Equipo findById(String objId) {
		for(Equipo ele: leq) {
			if (ele.getId().equals(objId))
				return ele;
		}
		return null;
	}
	

}