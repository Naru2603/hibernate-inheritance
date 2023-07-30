package com.basic.singleTable.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TwoWheelerRecord")
public class TwoWheeler extends Vehicle {
	@Column(name = "Steering_type")
	String steeringTwoWheeler;
	@Column
	String stand;

	public String getSteeringTwoWheeler() {
		return steeringTwoWheeler;
	}

	public void setSteeringTwoWheeler(String steeringTwoWheeler) {
		this.steeringTwoWheeler = steeringTwoWheeler;
	}

	public String getstand() {
		return stand;
	}

	public void setstand(String stand) {
		this.stand = stand;
	}

	@Override
	public String toString() {
		return "TwoWheeler [steeringTwoWheeler=" + steeringTwoWheeler + ", stand=" + stand + "]";
	}

}
