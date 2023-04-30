package com.rayuduclasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.rayuduclasses.DMS.Models.Dog;

/**
 * @author S555576 Venkata Rayudu Adapa
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {
	
	List<Dog> findByName(String name);

}


