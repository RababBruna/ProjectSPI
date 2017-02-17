package fr.univbrest.dosi.Stub;

import java.util.ArrayList;
import java.util.List;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.repositories.FormationRepository;

public class FormationRepositoryStub implements FormationRepository{

private List<Formation> Donnees=new ArrayList<Formation>();


@Override
public long count() {
	// TODO Auto-generated method stub
	return this.Donnees.size() ;
}

@Override
public void delete(Formation f) {
	// TODO Auto-generated method stub
	this.Donnees.remove(f);
}

@Override
public void delete(String arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void delete(Iterable<? extends Formation> arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll() {
	// TODO Auto-generated method stub
	
}

@Override
public boolean exists(String arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public Iterable<Formation> findAll() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Iterable<Formation> findAll(Iterable<String> arg0) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Formation findOne(String arg0) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Formation> S save(S formation) {
	// TODO Auto-generated method stub
	 this.Donnees.add(formation);
	 return formation;
}

@Override
public <S extends Formation> Iterable<S> save(Iterable<S> arg0) {
	// TODO Auto-generated method stub
	return null;
}

}


