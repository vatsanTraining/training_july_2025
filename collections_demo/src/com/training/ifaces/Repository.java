package com.training.ifaces;

import java.util.List;

public interface Repository<T> {

	boolean add(T stud) throws DuplicateElementException;
  
	List<T> findAll();
   
   T findById(int id) throws ElementNotFoundException;
   
   boolean remove(int id) throws ElementNotFoundException;
}
