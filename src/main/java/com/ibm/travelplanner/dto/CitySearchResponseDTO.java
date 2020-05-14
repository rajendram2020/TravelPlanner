package com.ibm.travelplanner.dto;

import java.util.List;

public class CitySearchResponseDTO {
	
	private List<Data> data;
	
	public static class Data{
		
		private String cityName;
		
		private String cityCode;
		
		private String countryName;
		
		private String countryCode;
		
		private String regionCode;
		
		private String subType;
		
		private String name;
		
		private String detailedName;
		
		private String iataCode;

		public String getCityName() {
			return cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		public String getCityCode() {
			return cityCode;
		}

		public void setCityCode(String cityCode) {
			this.cityCode = cityCode;
		}

		public String getCountryName() {
			return countryName;
		}

		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}

		public String getCountryCode() {
			return countryCode;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

	

		public String getRegionCode() {
			return regionCode;
		}

		public void setRegionCode(String regionCode) {
			this.regionCode = regionCode;
		}

		public String getSubType() {
			return subType;
		}

		public void setSubType(String subType) {
			this.subType = subType;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDetailedName() {
			return detailedName;
		}

		public void setDetailedName(String detailedName) {
			this.detailedName = detailedName;
		}

		public String getIataCode() {
			return iataCode;
		}

		public void setIataCode(String iataCode) {
			this.iataCode = iataCode;
		}
		
	}

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

}
