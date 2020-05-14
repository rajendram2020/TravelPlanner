package com.ibm.travelplanner.service;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.resources.Location;
import com.ibm.travelplanner.config.SecurityConfiguration;
import com.ibm.travelplanner.dto.CitySearchResponseDTO;
import com.ibm.travelplanner.dto.LocationResponseMapper;

@Service
public class TravelPlannerService {

	private final static Logger logger = Logger.getLogger(TravelPlannerService.class.getName());

	@Autowired
	private SecurityConfiguration configuaration;
	
	public CitySearchResponseDTO citySearch(String subType, String id) {
		Location location[]=null;
		logger.info("subType: "+subType+" id: "+id);
		Amadeus amadeus = getAmadeusConnection();
		try {
		location= amadeus.referenceData.locations.get(Params.with("subType", subType).
				and("keyword", id));
		}catch(Exception exp) {
		
		}	
	
		List<Location> locations = Arrays.asList(location);
		LocationResponseMapper responseMapper = new LocationResponseMapper();
		
		CitySearchResponseDTO response=responseMapper.convert(locations);
		return response;
	}
	
	public Amadeus getAmadeusConnection() {
		Amadeus amadeus = Amadeus.builder(configuaration.getClientId(), configuaration.getClientSecret())
				.setLogger(logger).setLogLevel("debug").build();

		return amadeus;
	}

}
