import classes.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import abstracts.Vehicle;

public class Start {
	private static SimpleDateFormat SDFormat = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String args[]) throws ParseException {
		boolean choice = true;
		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();
		System.out.println("Admin login");
		while(choice){

			Scanner input = new Scanner(System.in);
			String user, pass;

			System.out.println("Enter your username:");
			user = input.nextLine();

			System.out.println("Enter your Password:");
			pass = input.nextLine();

			if(user.equals("fardin") && pass.equals("21-44863-2") || user.equals("kousik") && pass.equals("21-44864-2") || user.equals("kowshik") && pass.equals("21-44860-2") || user.equals("prottoy") && pass.equals("21-45640-3")) {

				while(choice) {
					System.out.println("____________________________________________");
					System.out.println("Welcome to Car Rental Management System!!!");
					System.out.println("========================");
					System.out.println("1. Vehicle Management");
					System.out.println("2. Customer Management");
					System.out.println("3. Rental Management");
					System.out.println("4. Exit the Application");
					System.out.println("========================");
					System.out.println("Please Choose an option.");
					System.out.println("____________________________________________");

					int first = sc.nextInt();

					switch (first) {

						case 1:

							System.out.println("____________________________________________");
							System.out.println("You have selected Vehicle Management");
							System.out.println("###################");
							System.out.println("1. Add New Vehicle");
							System.out.println("2. Remove Vehicle");
							System.out.println("3. Search Vehicle");
							System.out.println("4. See all Vehicle");
							System.out.println("5. Go Back");
							System.out.println("###################");
							System.out.println("Please Choose an option.");
							System.out.println("____________________________________________");
							int second1 = sc.nextInt();

							switch (second1) {
								case 1:

									System.out.println("You have Selected to Add a new Vehicle\n");
									System.out.print("Enter Vehicle Id: ");
									int vehicleID = sc.nextInt();
									
									System.out.print("Enter Vehicle Name: ");
									String name = sc.next();
									
									System.out.print("Enter Vehicle Company name: ");
									String make = sc.next();

									System.out.print("Enter Vehicle Model: ");
									String model = sc.next();

									System.out.print("Enter the Vehicle's year of release: ");
									int year = sc.nextInt();

									System.out.print("Enter Vehicle rent price: ");
									double rentPrice = sc.nextDouble();

									Vehicle v = new Vehicle();
									v.setId(vehicleID);
									v.setName(name);
									v.setMake(make);
									v.setModel(model);
									v.setYear(year);
									manager.insertVehicle(v);
									break;

								case 2:

									System.out.println("You have Selected to remove an existing Vehicle");
									System.out.print("Enter Vehicle Id: ");

									manager.removeVehicle(manager.getVehicle(sc.nextInt()));

									break;

								case 3:

									System.out.println("You have Selected to Search an existing Vehicle");
									System.out.print("Enter Vehicle Id: ");
									Vehicle vehicle = manager.getVehicle(sc.nextInt());
									if (vehicle != null) {
										manager.searchVehicle(vehicle);
									}


									break;

								case 4:

									System.out.println("You have Selected to see all Vehicle");

									manager.showAllVehicles();


									break;

								case 5:

									System.out.println("You have Selected to Go Back");
									break;


								default:

									System.out.println("Invalid Input");
									break;
							}

							break;

						case 2:
							
							System.out.println("____________________________________________");
							System.out.println("You have selected Customer Management");
							System.out.println("###########################");
							System.out.println("1. Create New Customer");
							System.out.println("2. Remove Existing Customer");
							System.out.println("3. See all Customers");
							System.out.println("4. Search a Customers");
							System.out.println("5. Go Back");
							System.out.println("###########################");
							System.out.println("What do you want to do?");
							System.out.println("____________________________________________");
							
							int second2 = sc.nextInt();

							switch (second2) {
								case 1:

									System.out.print("Enter Customer id: ");
									int id = sc.nextInt();
									
									System.out.print("Enter Customer Name: ");
									String name1 = sc.next();

									System.out.print("Enter Customer Email: ");
									String email = sc.next();

									System.out.print("Enter Customer Mobile: ");
									String mobile = sc.next();

									System.out.print("Enter Customer gender('male or female'): ");
									String gender = sc.next();

									System.out.print("Enter Customer Date of birth(dd/MM/yyyy): ");
									String dob = sc.next();

									System.out.print("Enter Customer Date of Join(dd/MM/yyyy): ");
									String doJ = sc.next();

									Customer c = new Customer();
									c.setId(id);
									c.setName(name1);
									c.setEmail(email);
									c.setMobile(mobile);
									c.setGender(gender);
									c.setDob(SDFormat.parse(dob));
									c.setDateOfJoin(SDFormat.parse(doJ));

									manager.insertCustomer(c);
									break;

								case 2:

									System.out.print("Enter Customer id: ");
									int cusid = sc.nextInt();

									manager.removeCustomer(manager.getCustomer(cusid));
									break;

								case 3:

									manager.showAllCustomers();
									break;

								case 4:

									System.out.print("Enter Customer id: ");
									int cusids = sc.nextInt();
									Customer cus3 = manager.getCustomer(cusids);
									if (cus3 != null) {
										manager.searchCustomer(cus3);
									}
								{
									System.out.println("customer not found");
								}

								break;

								case 5:

									System.out.println("Going Back . . .");
									break;

								default:

									System.out.println("Invalid Input");
									break;
							}

							break;

						case 3:
							
							System.out.println("____________________________________________");
							System.out.println("You have selected Rental Management");
							System.out.println("#############################################");
							System.out.println("1. Rent Car ");
							System.out.println("2. Go Back");
							System.out.println("#############################################");
							System.out.println("What do you want to do?");
							System.out.println("____________________________________________");
							
							int second3 = sc.nextInt();

							switch (second3) {
								case 1:

									System.out.print("Enter Rental id: ");
									int rentalID = sc.nextInt();

									System.out.print("Enter Customer id: ");
									int cusID = sc.nextInt();

									System.out.print("Enter Vehicle ID: ");
									int vehicleID = sc.nextInt();

									System.out.print("Enter Renting Date (dd/mm/yyyy): ");
									String rentDate = sc.next();

									System.out.print("Enter Renting Return Date (dd/mm/yyyy): ");
									String returnDate = sc.next();


									Customer cus1 = manager.getCustomer(cusID);
									Vehicle vehicle1 = manager.getVehicle(vehicleID);

									if (vehicle1 != null && cus1 != null) {
										Rentals rental = new Rentals();
										rental.setId(rentalID);
										rental.setCustomerID(cus1);
										rental.setVehicleID(vehicle1);
										rental.setRentDate(SDFormat.parse(rentDate));
										rental.setReturnDate(SDFormat.parse(returnDate));
										System.out.println("Rent is done");
										break;
									} else {
										System.out.println("Vehicle id or customer id is not correct, try again");
									}

									break;

								case 2:

									System.out.println("Going Back . . .");
									break;

								default:

									System.out.println("Invalid Input");
									break;
							}

							break;

						case 4:

							System.out.println("You have selected to exit the application");
							System.out.println("Thank you for using Car rent management System");
							choice = false;
							sc.close();
							break;

						default:

							System.out.println("Invalid option");
							break;
					}
				}
			}
			else{
				System.out.println("Invalid username or password!!!");
				System.out.println("Try again!!!");
			}

		}

	}

}
