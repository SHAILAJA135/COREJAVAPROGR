package com.tnsif.override;

public class Sbi extends Rbi {
	public float getRateOfIntrest() {
		System.out.println(super.getRateOfIntrest());
		return 5.5f;
	}

}
