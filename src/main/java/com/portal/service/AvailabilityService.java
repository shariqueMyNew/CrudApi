package com.portal.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.portal.model.AvailabilityModel;
import com.portal.repository.AvailabilityRepo;

@Service
public class AvailabilityService {
	@Autowired
	AvailabilityRepo repo;

	public String updateData(AvailabilityModel model, String name) {
		repo.save(model);
		return "Updated Successfully";
	}

	public String deleteData(String name) {
		repo.deleteById(name);
		return name + " Deleted Succesfully...";
	}

	public String addData(AvailabilityModel t) {
		repo.save(t);
		return "Inserted Successfully..";

	}

	public List<AvailabilityModel> getData(String templateName) {
		List<AvailabilityModel> result = new ArrayList<>();
		repo.findById(templateName).ifPresent(result::add);
		return result;

	}

}
