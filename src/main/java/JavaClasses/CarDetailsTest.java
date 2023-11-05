package JavaClasses;

public class CarDetailsTest {
    public static void main(String[] args) {


            CarDetails carInfo = new CarDetails();

            carInfo.carName="BMW";
            carInfo.carModelNumber="DX3,2.3";
            carInfo.carPrice=43090900l;


            carInfo.CarName();
            System.out.println("Car Model Number:" +carInfo.carModelNumber);
            carInfo.carColor("RED");
            System.out.println("Car Price is:" +carInfo.carPrice);



        }
    }

