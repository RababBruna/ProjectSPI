package fr.univbrest.dosi.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gemstone.gemfire.internal.Assert;

import fr.univbrest.dosi.Stub.FormationRepositoryStub;
import fr.univbrest.dosi.bean.Candidat;
import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.business.FormationImpl;
import fr.univbrest.dosi.business.FormationInterface;

public class FormationRepositoryTest {

	   private FormationRepositoryStub FS;
	   private FormationInterface Formation;
	
	 

	    @Before
	    public void init() {
	  this.FS=new FormationRepositoryStub();
	  this.Formation = new FormationImpl(this.FS);
	       
	       
	    }
	    
	    
	    @Test
	    public void Formationajoutée(){
	    	Formation frm1 = new Formation("M2DOSI",new Date(), "diplome1", "Dosi", new Date(), new BigDecimal(5), "Formation1");
	           Formation resultat = Formation.AddFormation(frm1);

	    	assertThat(resultat.getCodeFormation()).isEqualTo("M2DOSI");
	    }
	    
	    
	    
	    @Test
	    public void touteFormation(){
	    	
	    	
	    }
}
