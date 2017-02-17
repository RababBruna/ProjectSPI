package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.business.FormationImpl;
import fr.univbrest.dosi.business.FormationInterface;
import fr.univbrest.dosi.repositories.EtudiantRepository;
import fr.univbrest.dosi.repositories.FormationRepository;


	@RestController
	public class Controller {

		
		
         @Autowired
          FormationInterface FRM;
		
		@RequestMapping(value="/formation",method=RequestMethod.GET)
			public  List<Formation> LesFormations(){
			
			return   Lists.newArrayList(FRM.AllFormation());
		}
		
		@RequestMapping(value="/formation/{codeformation}")
		public  Formation search(@PathVariable("codeformation") String code){
		
		return   FRM.search(code);
	}
		@RequestMapping(value="/AjoutFormation")
		public  Formation Add(@RequestBody Formation frm){
		
		return   FRM.AddFormation(frm);
	}
		@RequestMapping(value="/DeleteFormation/{codeformation}")
		public  void Delete(@PathVariable("codeformation") String code){
		 FRM.Supprimer(code);
	}
		

}
