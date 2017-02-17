package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Formation;


public interface FormationInterface {

	public Formation AddFormation(Formation f);
	
	public void Supprimer(String f);
	
	public List<Formation> AllFormation();
	
	public Formation search(String code);
}
