package com.nt.bo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeBO extends BaseBO {
	private String qlfy;
	
	public EmployeeBO() {
		System.out.println("EmployeeBO:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "EmployeeBO [qlfy=" + qlfy + ", toString()=" + super.toString() + "]";
	}
	
	
}
