package com.basic.singleTable.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FourWheelerRecord")
public class FourWheeler extends Vehicle {
	@Column(name = "Steering_type")
	String steeringFourWheeler;
	@Column
	String viper;

	public String getSteeringTwoWheeler() {
		return steeringFourWheeler;
	}

	public void setsteeringFourWheelerr(String steeringFourWheeler) {
		this.steeringFourWheeler = steeringFourWheeler;
	}

	public String getSteeringFourWheeler() {
		return steeringFourWheeler;
	}

	public void setSteeringFourWheeler(String steeringFourWheeler) {
		this.steeringFourWheeler = steeringFourWheeler;
	}

	public String getViper() {
		return viper;
	}

	public void setViper(String viper) {
		this.viper = viper;
	}

	@Override
	public String toString() {
		return "FourWheeler [steeringFourWheeler=" + steeringFourWheeler + ", viper=" + viper + "]";
	}

}
