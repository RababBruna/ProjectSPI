package fr.univbrest.dosi.business;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

import fr.univbrest.dosi.Stub.FormationRepositoryStub;
import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.repositories.FormationRepository;

@Component
public class FormationImpl implements FormationInterface {

	@Autowired
	private FormationRepository FRM;

	public FormationImpl(FormationRepositoryStub Stub){
		this.FRM=new FormationRepositoryStub();
	}
	
	public FormationImpl(){}
	
	public Formation AddFormation(Formation f){
		return FRM.save(f);
		
	}
	
	public void Supprimer(String f){
		FRM.delete(f);
	}
	
	public List<Formation> AllFormation(){
	return	Lists.newArrayList(FRM.findAll());
	}
	
	public Formation search(String code){
		return FRM.findOne(code);
	}
	
	
}
