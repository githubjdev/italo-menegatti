package dev.italo.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryRepository<T, ID> {

	/*Banco de dados*/
	private Map<ID, T> storage = new HashMap<>();
	
	
	public void save(ID id, T entity) {
		storage.put(id, entity);
	}
	
	public T findById(ID id) {
		return storage.get(id);
	}
	
	public List<T> findAll(){
		return new ArrayList<>(storage.values());
	}
	
	public void delete(ID id) {
		storage.remove(id);
	}
	
}
