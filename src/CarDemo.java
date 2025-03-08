public class CarDemo{
    public static void main(String[] args) {
        Car myCar = new Car(2022, "Toyota");
        System.out.println("Car Make: " + myCar.getMake());
        System.out.println("Year Model: " + myCar.getYearModel());

        System.out.println("\n---Accelerating---");
        myCar.accelerate();
        System.out.println(myCar.speed);
        System.out.println("\n ---Brake------");
        myCar.brake();
        System.out.println(myCar.speed);


        
    }
}
 class Car {
    int year_model,speed;
    String make;

    public Car(int year_model ,String make){
        this.year_model = year_model;
        this.make = make;
        speed =0;
    }
    int getYearModel(){
        return year_model;
    }
    int getSpeed(){
        return speed;
    }
    String getMake(){
        return make;
    }
    public void accelerate(){
        speed = speed + 5;
    }
    public void brake(){
        speed = speed - 5;
    }

    

    
}
