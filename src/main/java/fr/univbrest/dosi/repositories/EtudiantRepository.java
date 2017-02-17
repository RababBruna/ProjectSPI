package fr.univbrest.dosi.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.Etudiant;

public interface EtudiantRepository extends CrudRepository<Etudiant,String >{
	
 Etudiant findByNoEtudiant(String noEtudiant);
 Etudiant findByNom(String nom);
}
