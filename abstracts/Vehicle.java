package abstracts;

public class Vehicle {
	protected int id;
	protected String name;
	protected int Year;
	protected String Make;
	protected String Model;

	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}
	
	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public int getYear() {

		return Year;
	}

	public void setYear(int year) {

		Year = year;
	}

	public String getMake() {

		return Make;
	}

	public void setMake(String make) {

		Make = make;
	}

	public String getModel() {

		return Model;
	}

	public void setModel(String model) {

		Model = model;
	}



}
