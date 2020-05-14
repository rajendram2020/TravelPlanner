package com.ibm.travelplanner.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.travelplanner.domain.TravelPlannerHistory;

public interface CustomerPlanningHistoryRepository extends MongoRepository<TravelPlannerHistory, String>{ 
	

}
