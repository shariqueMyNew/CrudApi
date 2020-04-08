package com.portal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.portal.model.AvailabilityModel;
import com.portal.service.AvailabilityService;

@RestController
public class AvailabilityController {
	@Autowired
	AvailabilityService service;

	@RequestMapping(method = RequestMethod.GET, value = "/check")
	public String check() {
		return "...Working Fine...";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/get/{templateName}")
	public List<AvailabilityModel> getTemplate(@PathVariable String templateName) {
		// System.out.println(service.getData(templateName));
		return service.getData(templateName);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/create", consumes = MediaType.ALL_VALUE, produces = MediaType.ALL_VALUE)
	public String createTemplate(@RequestBody AvailabilityModel t) {
		return service.addData(t);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/update/{templateName}", consumes = MediaType.ALL_VALUE, produces = MediaType.ALL_VALUE)
	public String updateTemplate(@RequestBody AvailabilityModel model, @PathVariable String templateName) {
		return service.updateData(model, templateName);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{templateName}", consumes = MediaType.ALL_VALUE, produces = MediaType.ALL_VALUE)
	public String deleteTemplate(@PathVariable String templateName) {
		return service.deleteData(templateName);

	}
}
