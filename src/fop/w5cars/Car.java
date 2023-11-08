package fop.w5cars;

public class Car {

   String brand;
   LicensePlate lp;
   int chassisNumber = 0;

   public Car(String brand, LicensePlate lp) {
      this.brand = brand
      this.lp = lp;
   }


   public String printCar(){
      return "Brand: " + this.brand + "\t Licence Plate: " + this.lp.printLP();
   }

}
