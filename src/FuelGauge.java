// •	The FuelGauge Class: This class will simulate a fuel gauge. Its responsibilities are 
// as follows:
//  •	To	know	the	car’s	current	amount	of	fuel,	in	gallons.
//  •	To	report	the	car’s	current	amount	of	fuel,	in	gallons.
//  •	To	be	able	to	increment	the	amount	of	fuel	by	1	gallon.	This	simulates	putting	fuel	
// in the car. (The car can hold a maximum of 15 gallons.)
//  •	To	be	able	to	decrement	the	amount	of	fuel	by	1	gallon,	if	the	amount	of	fuel	is	
// greater than 0 gallons. This simulates burning fuel as the car runs.
//  •	The Odometer Class: This class will simulate the car’s odometer. Its responsibilities are 
// as follows:
//  •	To	know	the	car’s	current	mileage.
//  •	To	report	the	car’s	current	mileage.
//  •	To	be	able	to	increment	the	current	mileage	by	1	mile.	The	maximum	mileage	the	
// odometer can store is 999,999 miles. When this amount is exceeded, the odometer 
// resets the current mileage to 0.
//  •	To	be	able	to	work	with	a	FuelGauge object. It should decrease the FuelGauge 
// object’s current amount of fuel by 1 gallon for every 24 miles traveled. (The car’s 
// fuel economy is 24 miles per gallon.)
//-----------------------------------------------------------START OF THE CODE---------------------------------------------------------
//------------------------------------------------------------FUELGAUGE CLASS----------------------------------------------------------
class FuelGauge {
    int fuel;
    public FuelGauge(int fuel) {
        this.fuel = (fuel > 15) ? 15 : fuel;
    }
    public int getFuel() {
        return fuel;
    }
    public void addFuel() {
        if (fuel < 15) {
            fuel++;
            System.out.println("Added fuel: " + fuel + " gallons");
        } else {
            System.out.println("Tank is full!");
        }
    }
    public void burnFuel() {
        if (fuel > 0) {
            fuel--;
            System.out.println("Fuel burned: " + fuel + " gallons remaining");
        } else {
            System.out.println("Tank is empty! The car cannot move.");
        }
    }
}
//------------------------------------------------------------ODOMETER CLASS-----------------------------------------------------------
class Odometer {
    int mileage;
    int initialMileage;
    FuelGauge fuel;
    public Odometer(int mileage, FuelGauge fuel) {
        this.mileage = mileage;
        this.initialMileage = mileage;
        this.fuel = fuel;
    }
    public int getMileage() {
        return mileage;
    }
    public void drive() {
        if (fuel.getFuel() > 0) {
            mileage++;
            System.out.println("Mileage: " + mileage + " miles");
            if (mileage > 999999) {
                mileage = 0;
                System.out.println("The odometer reset to 0.");
            }
            if ((mileage - initialMileage) % 24 == 0) {
                fuel.burnFuel();
            }
        } else {
            System.out.println("Car cannot move. Out of fuel!");
        }
    }
    public void distanceTraveled() {
        int miles = mileage - initialMileage;
        System.out.println("Distance Traveled by the car: " + miles + " miles");
    }
//------------------------------------------------------------MAIN CLASS----------------------------------------------------------
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge(10);
        Odometer odometer = new Odometer(100000, fuelGauge);
        while (fuelGauge.getFuel() > 0) {
            odometer.drive();
        }
        odometer.distanceTraveled();
        System.out.println("The car has run out of fuel!");
    }
}
//----------------------------------------------------------END OF THE CODE---------------------------------------------------------