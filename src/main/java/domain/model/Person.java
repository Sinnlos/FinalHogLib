package domain.model;

import java.util.Date;

public class Person {
	
	private String pesel;

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	
	//public Date getDayOfBirth(){}
	
	//public int getAge(){}
	//public Gender getGender(){}
	
	//public boolean checkPesel(){}
	
}

enum Gender{
	Male, Female
}
