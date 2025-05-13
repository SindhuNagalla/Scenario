package com.nit;


class Employee{
	
	private String employeeName;
	private String department;
	private double baseSalary;
	private int performanceScore;

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public int getPerformanceScore() {
		return performanceScore;
	}
	public void setPerformanceScore(int performanceScore) {
		this.performanceScore = performanceScore;
	}
	public double calculateBonus() throws InvalidInputException {
		double bonus=0.0;
		if(performanceScore>=1 && performanceScore<=10)
		{
			if(performanceScore>=8 && performanceScore<=10)
			{
				bonus=baseSalary*0.2;
			}
			else if(performanceScore>=5 && performanceScore<=7)
			{
				bonus=baseSalary*0.1;
			}
			else
			{
				bonus=0.0;
			}
		}
		else
		{
			throw new InvalidInputException();
		}
		return bonus;
	}
}

class InvalidInputException extends Exception{
	
}
public class EmployeeTester{
	
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmployeeName("Sindhu");
		e.setDepartment("IT");
		e.setBaseSalary(10000);
		e.setPerformanceScore(8);
		
		System.out.println("Employee Name:"+e.getEmployeeName());
		System.out.println("Employee Name:"+e.getDepartment());
		System.out.println("Employee Name:"+e.getBaseSalary());
		System.out.println("Employee Name:"+e.getPerformanceScore());
		
		try {
			double bonus=e.calculateBonus();
			System.out.println("Calculated Bonus:"+bonus);
		}
		catch(InvalidInputException e1)
		{
			System.out.println(e1);
		}
		
	}
}
