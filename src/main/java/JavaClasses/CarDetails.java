package JavaClasses;

public class CarDetails {

    //Example of different methods in same class
    String carName;
    String carModelNumber;
    Long carPrice;

    public CarDetails(){ // default Constructor

    }
    public  void CarName(){ //void method

        System.out.println("Car Name is:" +carName);
    }
    public String getCarModelNumber(){ //non-void method

        return carModelNumber;
    }
    public void carColor(String color){ //with argument method
        System.out.println("Car Color is:" +color);
    }

    public Long getCarPrice() { // Without argument method

        return carPrice;
    }

    /*public static void main(String[] args) {

        CarDetails carInfo = new CarDetails();

        carInfo.carName="BMW";
        carInfo.carModelNumber="DX3,2.3";
        carInfo.carPrice=43090900l;


        carInfo.CarName();
        System.out.println("Car Model Number:" +carInfo.carModelNumber);
        carInfo.carColor("RED");
        System.out.println("Car Price is:" +carInfo.carPrice);



    }*/
}
