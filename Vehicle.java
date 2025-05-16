package com.nit.FunctionalInterfaces;

public class Vehicle
{
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Vehicle(String name)
	{
		super();
		this.name=name;
	}

	class Car
	{
		int numberOfDoors;
		double fuelEfficiency;
		
		public void calculateFuelConsumption(double distance)
		{
			double fuel=distance/fuelEfficiency;
			System.out.println("Fuel:"+fuel);
		}

		public Car(int numberOfDoors, double fuelEfficiency) {
			super();
			this.numberOfDoors = numberOfDoors;
			this.fuelEfficiency = fuelEfficiency;
		}

		public void setNumberOfDoors(int numberOfDoors) {
			this.numberOfDoors = numberOfDoors;
		}

		public void setFuelEfficiency(double fuelEfficiency) {
			this.fuelEfficiency = fuelEfficiency;
		}

		public int getNumberOfDoors() {
			return numberOfDoors;
		}

		public double getFuelEfficiency() {
			return fuelEfficiency;
		}
	}
	class Truck
	{
		double loadCapacity;
		String cargoType;
		
		public void determineAvailableSapce(double currentLoad)
		{
			double available=currentLoad-loadCapacity;
			System.out.println("availale Capacity"+available);
		}


		public double getLoadCapacity() {
			return loadCapacity;
		}

		public String getCargoType() {
			return cargoType;
		}

		public Truck(double loadCapacity, String cargoType) {
			super();
			this.loadCapacity = loadCapacity;
			this.cargoType = cargoType;
		}



		public void setLoadCapacity(double loadCapacity) {
			this.loadCapacity = loadCapacity;
		}

		public void setCargoType(String cargoType) {
			this.cargoType = cargoType;
		}
		
	}
	
	class MotorCycle
	{
		int engineCapacity;
		boolean hasSpecialFeatures;
		
		public MotorCycle(int engineCapacity, boolean hasSpecialFeatures) {
			super();
			this.engineCapacity = engineCapacity;
			this.hasSpecialFeatures = hasSpecialFeatures;
		}

		public void checkSpecialFeatures()
		{
			System.out.println("-special features:"+(hasSpecialFeatures?"yes":"No"));
		}

		public int getEngineCapacity() {
			return engineCapacity;
		}

		public boolean isHasSpecialFeatures() {
			return hasSpecialFeatures;
		}
		
	}
	public static void main(String[] args)
	{
		Vehicle v=new Vehicle("Sedan");
		Vehicle.Car c=v.new Car(4,15.5);
		System.out.println("Vehicle Details");
		System.out.println("Car:"+v.getName());
		System.out.println("-Number of Doors:"+c.getNumberOfDoors());
		System.out.println("-Fuel Efficiency:"+c.getFuelEfficiency()+"km/l"+"\n");
		
		Vehicle v1=new Vehicle("Cargo Truck");
		Vehicle.Truck t=v1.new Truck(10.5,"Goods");
		System.out.println("Truck:"+v1.getName());
		System.out.println("-Load Capacity:"+t.getLoadCapacity()+" tons");
		System.out.println("-Cargo Type:"+t.getCargoType()+"\n");
		
		Vehicle v2=new Vehicle("Sports Bike");
		Vehicle.MotorCycle m=v2.new MotorCycle(1000,true);
		System.out.println("Motorcycle:"+v2.getName());
		System.out.println("-Engine Capacity:"+m.getEngineCapacity()+" cc");
		m.checkSpecialFeatures();
		
		
	}

}
