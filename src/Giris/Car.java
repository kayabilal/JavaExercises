package Giris;

 class Car {
     // Variables
     String type;
     String model;
     String color;
     int speed;
     int speedLimit;

     Car(String model,int speed,String color){
         this.model=model;
         this.speed=speed;
         this.color=color;
         this.type="Sedan"; // the default values.we have specified in the constructor method rather than mentioned above.
         this.speedLimit=180; //
     }
     Car(){
         System.out.println("parametresiz oluştu");

     }

     //Methods

     void increaseSpeed(int increment){
         this.speed+=increment;
     }

     void decreaseSpeed(int decrease) {
            if(this.speed>0){
                this.speed -=decrease;
            }
     }

    void printSpeed(){
        System.out.println(this.model+"Speed:"+ this.speed);
    }

    void printInfo(){

        System.out.println("Model :" +this.model);
        System.out.println("color :" +this.color);
        System.out.println("type :" +this.type);
        System.out.println("speed :" +this.speed);


    }


}
