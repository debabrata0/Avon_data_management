package org.dev.Avon_data_management.service;

import java.util.List;

import org.dev.Avon_data_management.entity.Admin;
import org.dev.Avon_data_management.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
	
	
	private AdminRepository repository;

	@Autowired
	public AdminService(AdminRepository repository) {
		super();
		this.repository = repository;
	}
	
	
	public Admin saveAdmin(Admin admin) {
		return repository.save(admin);
	}
	
	public Admin updateAdmin(Admin admin) {
		return repository.save(admin);
	}
	
	public List<Admin> findAllAdmin(){
		return repository.findAll();
	}
	
	
	
	
	public void deleteAdminbyId(int id) {
		repository.deleteById(id);
	}
	
	
}
