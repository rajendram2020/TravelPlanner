package com.ibm.travelplanner.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BaseEntity implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    private String id;



	public String getId() {

		return id;

	}

	public void setId(String id) {

		this.id = id;

	}

}
