package org.dev.Avon_data_management.repository;

import org.dev.Avon_data_management.entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository  extends JpaRepository<Visitor, Integer>{

	Visitor findById(int id);
	
}
