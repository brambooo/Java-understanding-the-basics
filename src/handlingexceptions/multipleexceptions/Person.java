package handlingexceptions.multipleexceptions;

public class Person {
	private String name;
	private int age;
	private int yearSalary;
	
	public Person(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.yearSalary = salary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return yearSalary;
	}

	public void setSalary(int salary) {
		this.yearSalary = salary;
	}
	
	public int salaryOverYears(int years) throws NumberFormatException {
		int salarOverYears = (yearSalary*years);
		return salarOverYears;
	}
	

}
