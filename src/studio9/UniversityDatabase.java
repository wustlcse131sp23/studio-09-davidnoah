package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;



public class UniversityDatabase {
	private final Map<String, Student> database;
	public UniversityDatabase(){
		this.database = new HashMap<>();
	}
	
	public void addStudent(String accountName, Student student) {
		database.put(accountName, student);
	}

	public int getStudentCount() {
		return database.size();
	}

	public String lookupFullName(String accountName) {
		if(database.get(accountName) == null) {
			return null;
		}
		else {
			return database.get(accountName).getFullName();
		}
		
	}

	public double getTotalBearBucks() {
		double total = 0.0;
		Student e;
		for(String s : database.keySet()) {
			e = database.get(s);
			total += e.getBearBucksBalance();
		}
		return total;
	}
}
