package com.ibm.travelplanner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.travelplanner.dto.CitySearchResponseDTO;
import com.ibm.travelplanner.service.TravelPlannerService;
@CrossOrigin(origins="*")
@RestController
public class TravelPlannerController {
	
	@Autowired
	TravelPlannerService travelPlannerService;
	
	@PostMapping(value="/city/{subType}/{id}")
	public ResponseEntity<CitySearchResponseDTO> citySearch(@PathVariable(value = "subType") String subType, @PathVariable(value = "id") String cityShortCode) {			
		
		 
        return ResponseEntity.ok().body(travelPlannerService.citySearch(subType, cityShortCode));  
    }
	

}
