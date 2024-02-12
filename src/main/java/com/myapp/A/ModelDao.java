package com.myapp.A;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ModelDao {
	
	@Autowired
	ModelRepository modelresp;
	public String addvalue(Model m) {
		modelresp.save(m);
		return "successfully";
	}
	public  String addLists(List<Model> m) {
		modelresp.saveAll(m);
		return "Save Successfully";
		
	}
	public List<Model>get() {
		return modelresp.findAll();
	}
	public Model getById(int id) {
		return modelresp.findById(id).get();
	}
	public String update(Model m, int id) {
		Model s = modelresp.findById(id).get();
		s.setAge(s.getAge());
		return "update Successfully";
		
	}
	

}
