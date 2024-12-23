package com.employe.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employe.dto.EmployeDTO;
import com.employe.model.EmployeEntity;
import com.employe.repository.EmployeRepo;

@Service
public class EmployeService {

	@Autowired
	private EmployeRepo employRepo;

	@Autowired
	private ModelMapper modelMapper;

	public EmployeDTO addEmploye(EmployeDTO employeDTO) {
		EmployeEntity employeEntity = modelMapper.map(employeDTO, EmployeEntity.class);
		employRepo.save(employeEntity);
		return employeDTO;

	}

	public EmployeDTO getEmploye(Long employeId) {
		Optional<EmployeEntity> employe = employRepo.findById(employeId);
		EmployeDTO employeDTO = modelMapper.map(employe, EmployeDTO.class);
		return employeDTO;

	}
	public EmployeDTO updateEmploye(Long employeId, EmployeDTO employeDTO) {
		Optional<EmployeEntity> optionalEmploye = employRepo.findById(employeId);

	    
	        EmployeEntity employeEntity = optionalEmploye.get();

	        employeEntity.setEmployeName(employeDTO.getEmployeName());
	        employeEntity.setEmployeAddress(employeDTO.getEmployeAddress());
	        employeEntity.setEmployeNumber(employeDTO.getEmployeNumber());
	        employeEntity.setEmployeAge(employeDTO.getEmployeAge());
	        employeEntity.setEmployeGender(employeDTO.getEmployeGender());

	        EmployeEntity updatedEmploye = employRepo.save(employeEntity);
			EmployeDTO employeDTO1 = modelMapper.map(updatedEmploye, EmployeDTO.class);
		    return employeDTO1;

	}
	
	
	public boolean deleteEmploye(Long employeId) {
	   employRepo. deleteById(employeId);
		return true;

	}
}
