package classes;

import abstracts.Vehicle;
import interfaces.CustomerInterface;
import interfaces.VehicleInterface;


public class Manager implements CustomerInterface, VehicleInterface {
	private Customer[] customers = new Customer[100];
	private Vehicle vehicles[] = new Vehicle[100];

    // For customer
	public void insertCustomer(Customer customer) {
		int flag = 0;
		for (int i = 0; i < customers.length; i++) {
			if (customers[i] == null) {
				customers[i] = customer;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Customer is Inserted");
		} else {
			System.out.println("Unable to Insert");
		}
	}

	public void removeCustomer(Customer customer) {
		int flag = 0;
		for (int i = 0; i < customers.length; i++) {
			if (customers[i] == customer) {
				customers[i] = null;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Customer Removed");
		} else {
			System.out.println("Can Not Remove");
		}
	}

	public void showAllCustomers() {
		for (Customer customer : customers) {
			if (customer != null) {
				System.out.println("____________________________________________");
				System.out.println("Customer's ID: " + customer.getId());
				System.out.println("Customer's Name: " + customer.getName());
				System.out.println("Customer's Email: " + customer.getEmail());
				System.out.println("Customer's Mobile: " + customer.getMobile());
				System.out.println("Customer's gender: " + customer.getGender());
				System.out.println("Customer's date of birth: " + customer.getDob());
				System.out.println("Customer's date of join: " + customer.getDateOfJoin());
				System.out.println("____________________________________________");
			}
		}
	}

	public Customer getCustomer(int id) {
		Customer customer = null;

		for (int i = 0; i < customers.length; i++) {
			if (customers[i] != null) {
				if (customers[i].getId() == id) {
					customer = customers[i];
					break;
				}
			}
		}
		if (customer != null) {
			System.out.println("Customer Found");
		} else {
			System.out.println("Customer is Not Found");
		}
		return customer;
	}

	// For vehicle
	public void insertVehicle(Vehicle vehicle) {
		int flag = 0;
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] == null) {
				vehicles[i] = vehicle;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Vehicle is Inserted");
		} else {
			System.out.println("Unable to Insert");
		}
	}

	public void removeVehicle(Vehicle vehicle) {
		int flag = 0;
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] == vehicle) {
				vehicles[i] = null;
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Vehicle Removed");
		} else {
			System.out.println("Can Not Remove");
		}
	}

	public void showAllVehicles() {
		for (Vehicle vehicle : vehicles) {

			if (vehicle != null) {
				System.out.println("____________________________________________");
				System.out.println("Vehicles Id: " + vehicle.getId());
				System.out.println("Vehicles name: " + vehicle.getName());
				System.out.println("Vehicles Year: " + vehicle.getYear());
				System.out.println("Vehicle Company name: " + vehicle.getMake());
				System.out.println("____________________________________________");
			}
		}
	}

	public Vehicle getVehicle(int id) {
		Vehicle vehicle = null;

		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] != null) {
				if (vehicles[i].getId() == id) {
					vehicle = vehicles[i];
					break;
				}
			}
		}
		if (vehicle != null) {
			System.out.println("Vehicles Found");
		} else {
			System.out.println("Vehicles Not Found");
		}
		return vehicle;
	}


	public void searchCustomer(Customer customer) {

		System.out.println("____________________________________________");
		System.out.println("Customer's ID: " + customer.getId());
		System.out.println("Customer's Name: " + customer.getName());
		System.out.println("Customer's Email: " + customer.getEmail());
		System.out.println("Customer's Mobile: " + customer.getMobile());
		System.out.println("Customer's gender: " + customer.getGender());
		System.out.println("Customer's date of birth: " + customer.getDob());
		System.out.println("Customer's date of join: " + customer.getDateOfJoin());
		System.out.println("____________________________________________");

	}

	public void searchVehicle(Vehicle vehicle) {
		System.out.println("____________________________________________");;
		System.out.println("Vehicle ID: " + vehicle.getId());
		System.out.println("Vehicle Name: " + vehicle.getName());
		System.out.println("Vehicle Year: " + vehicle.getYear());
		System.out.println("Vehicle Company name: " + vehicle.getMake());
		System.out.println("Vehicle Model: " + vehicle.getModel());
		System.out.println("____________________________________________");

	}

}
