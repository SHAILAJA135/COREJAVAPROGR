package com.tnsif.multilevelinheritance;

public class City {
      private String Cityname;

	public String getCityname() {
		return Cityname;
	}

	public void setCityname(String cityname) {
		Cityname = cityname;
	}

	@Override
	public String toString() {
		return "City [Cityname=" + Cityname + "]";
	}
      
}
