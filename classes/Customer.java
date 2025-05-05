package classes;

import java.util.Date;

import abstracts.Person;

public class Customer extends Person {
	private int id;
	private Date dateOfJoin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}


}
