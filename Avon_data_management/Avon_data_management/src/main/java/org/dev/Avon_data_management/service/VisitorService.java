package org.dev.Avon_data_management.service;

import java.util.List;
import org.dev.Avon_data_management.entity.Visitor;
import org.dev.Avon_data_management.repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitorService {
	
	@Autowired
	private VisitorRepository repository;
	
	
	public VisitorService(VisitorRepository repository) {
		this.repository = repository;
	}
	
	
	public Visitor save(Visitor visitor) {
		return repository.save(visitor);
	}
	
	public Visitor update(Visitor visitor) {
		return repository.save(visitor);
	}
	
	public List<Visitor> getAllVisitor(){
		return repository.findAll();
	}
	
	public Visitor findById(int id) {
		return repository.findById(id);
	}
	
	public void deleteById(int id) {
		repository.deleteById(id);
	}
}
