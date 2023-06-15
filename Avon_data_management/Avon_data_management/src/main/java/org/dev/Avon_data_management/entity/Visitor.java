package org.dev.Avon_data_management.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Table(name="visitor_information")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Visitor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String contactNo;
	private int age;
	private String gendar;
	private String visitingTime;
	private String visitingDate;
	private String idProofType;
	private String idProofNumber;
	private String address;
}
