package com.ibm.travelplanner.dto;

import java.util.ArrayList;
import java.util.List;

import com.amadeus.resources.Location;
import com.amadeus.resources.Location.Address;

public class LocationResponseMapper {
	
	public CitySearchResponseDTO convert(List<Location> locations) {
		
		CitySearchResponseDTO cityResponseDTO=new CitySearchResponseDTO();
		
		List<CitySearchResponseDTO.Data> listDataDTO=new ArrayList<CitySearchResponseDTO.Data>();
		
		for(Location location:locations) {
			CitySearchResponseDTO.Data dataDTO=new CitySearchResponseDTO.Data();
			
			dataDTO.setName(location.getName());
			dataDTO.setDetailedName(location.getDetailedName());
			
			dataDTO.setSubType(location.getSubType());
			
			dataDTO.setIataCode(location.getIataCode());
			Address address=location.getAddress();
			dataDTO.setCityCode(address.getCityCode());
			dataDTO.setCityName(address.getCityName());
			dataDTO.setCountryCode(address.getCountryCode());
			dataDTO.setCountryName(address.getCountryName());
			dataDTO.setRegionCode(address.getRegionCode());			
			listDataDTO.add(dataDTO);
		
			
			
			
			
			
		}
		cityResponseDTO.setData(listDataDTO);
		
		return cityResponseDTO;
	}

}
