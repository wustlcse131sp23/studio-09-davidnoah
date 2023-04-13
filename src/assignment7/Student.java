package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.

public class Student {

	private String firstName = "";
	private String lastName = "";
	private int ID = 0;
	private int attemptedCredits = 0;
	private int passingCredits = 0;
	private double gradeQualityPoints = 0;
	private double bearBucks = 0.0;
	private double gradePointAverage = 0.0;
	private int submittedGrades = 0;
	
	public Student(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = id;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

	public int getId() {
		return ID;
	}

	public void depositBearBucks(double amount) {
		bearBucks += amount;
	}

	public double getBearBucksBalance() {
		return bearBucks;
	}
}
