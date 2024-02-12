package com.myapp.A;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {
	@Autowired 
	ModelDao modeldao;
	public String addvalue(Model m) throws AgeException {
		try {
		if(m.getAge()<18) {
			throw new AgeException("Check the age");
		}else {
		return modeldao.addvalue(m);
	}
		} catch(AgeException ae) {
			return "Invalid age";
		}
	}
	public String addLists(List<Model> m) throws AgeException {
		try {
		for(Model model:m) {
		if(	model.getAge()<18 ){
			throw new AgeException("Check the age");
		}
			
		}
		
		  }catch (AgeException ae) {
				return(ae.getMessage());
			}
		return modeldao.addLists(m);
			
	}
	public List<Model>get() {
		return modeldao.get();
	}
	public Model getById(int id) {
		return modeldao.getById(id);
	}
	public String update(Model m, int id) {
		return modeldao.update(m,id);
	}

}
