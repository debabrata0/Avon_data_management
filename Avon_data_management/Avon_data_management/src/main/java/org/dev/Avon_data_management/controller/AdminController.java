package org.dev.Avon_data_management.controller;

import java.util.List;

import org.dev.Avon_data_management.entity.Admin;
import org.dev.Avon_data_management.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	@PostMapping("admin")
	public Admin saveAdmin(@RequestBody Admin admin) {
		return service.saveAdmin(admin);
	}
	
	@PutMapping("admin")
	public Admin updateAdmnin(@RequestBody Admin admin) {
		return service.updateAdmin(admin);
	}
	
	@GetMapping("admin")
	public List<Admin> getAllAdmin(){
		return service.findAllAdmin();
	}
	
	@DeleteMapping("admin{id}")
	public void deleteAdminbyId(@RequestParam int id) {
		service.deleteAdminbyId(id);
	}
}
