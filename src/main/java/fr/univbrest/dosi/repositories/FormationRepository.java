package fr.univbrest.dosi.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.Candidat;
import fr.univbrest.dosi.bean.Formation;

public interface FormationRepository extends CrudRepository<Formation, String> {
 
	
}
