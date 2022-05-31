class Vehicle {
    int maxSpeed;
    
    Vehicle(){
        System.out.println("Vehicle constructor");
    }
    
    Vehicle(int maxSpeed){
         System.out.println("Vehicle constructor w/ speed");
         this.maxSpeed = maxSpeed;
    }
    
}

class Car extends Vehicle {
    
    Car(){
        super();
        System.out.println("Car constructor");
    }
    
}