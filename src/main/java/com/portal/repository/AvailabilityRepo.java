package com.portal.repository;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

import com.portal.model.AvailabilityModel;

@Configuration
public interface AvailabilityRepo extends CrudRepository<AvailabilityModel, String> {



}
