package org.dev.Avon_data_management.controller;

import java.util.List;

import org.dev.Avon_data_management.entity.Visitor;
import org.dev.Avon_data_management.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitorController {
	
	private VisitorService service;

	@Autowired
	public VisitorController(VisitorService service) {
		this.service = service;
	}
	
	@PostMapping("visitor")
	public Visitor saveVisitor(@RequestBody Visitor visitor) {
		return service.save(visitor);
	}
	
	@PutMapping("visitor")
	public Visitor updateVisitor(Visitor visitor) {
		return service.update(visitor);
	}
	
	@GetMapping("visitor")
	public List<Visitor> getAllVisitor(){
		return service.getAllVisitor();
	}
	
	@GetMapping("visitor{id}")
	public Visitor getById(@RequestParam int id) {
		return service.findById(id);
	}
	
	@DeleteMapping("visitor{id}")
	public void deleteById(@RequestParam int id) {
		service.deleteById(id);
	}
	
}
