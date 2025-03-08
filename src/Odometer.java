// class Odometer {
//     int mileage,initial_mileage;
//     int miles;
//     FuelGauge fuel;
//     public Odometer(int mileage,int initial_mileage, FuelGauge fuel) {
//         this.mileage = mileage;
//         this.fuel = fuel;
//     }
//     public int getMileage() {
//         return mileage;
//     }
//     public void mileage(){
//         if(mileage < 999999){
//             mileage++;
//             System.out.println("Mileage: " + mileage);
//         }else{
//             System.out.println("The odometer reset to 0.");
//         }
//     }
//     public void distancetraveled(){
//         miles=mileage-initial_mileage;
//         System.out.println("Distance Traveled by the car: " +miles);
//     }
//     public static void main(String[] args) {
//         FuelGauge fuel = new FuelGauge(10);
//         System.out.println("Current fuel: " + fuel.getFuel());
//         Odometer odometer = new Odometer(100000,100000, fuel);
//         System.out.println("Car Mileage: " +odometer.getMileage());
//         odometer.mileage();
//         odometer.distancetraveled();
//     }
// }
//------------------------------------------------------------------------------------------------------------------
// class FuelGauge {
//     int fuel;
//     public FuelGauge(int fuel)
//     {
//         this.fuel = fuel;
//     }
//     public int getFuel() {
//         return fuel;
//     }
//     public void fueladd() 
//     {
//         if (fuel < 15) {
//             fuel++;
//             System.out.println("Added fuel: " + fuel);
//         } else 
//         {
//             System.out.println("Tank is full!");
//         }
//     }
//     public void fuelused()
//     {
//         if(fuel >0)
//         {
//             fuel--;
//             System.out.println("Fueled Burned:" + fuel);
//         }
//         else{
//             System.out.println("Tank is empty");
//         }
//     }
    // public static void main(String[] args) {
    //     FuelGauge fuel = new FuelGauge(10);
    //     fuel.fueladd();
    //     fuel.fuelused();
    //     System.out.println("Current fuel: " + fuel.getFuel());
    // }
// }