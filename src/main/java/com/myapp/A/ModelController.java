package com.myapp.A;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {
	@Autowired
	ModelService modelser;
	@PostMapping(value="add") 
	public String addvalue(@RequestBody Model m) throws AgeException{
		return modelser.addvalue(m);
		
	}
	@PostMapping(value ="addlist")
	public  String addLists (@RequestBody List<Model> m) throws AgeException{
		return modelser.addLists(m);
	}
	@GetMapping(value = "get") 
	public List<Model>get() {
		return modelser.get();
	}
	@GetMapping(value="getId") 
	public Model getById(@PathVariable int id) {
		return modelser.getById(id);
	}
	@PatchMapping (value ="updateByOne") 
	public String update(@RequestBody Model m,@PathVariable int id) {
		return modelser.update(m,id);
		
	}
	

}
