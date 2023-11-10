package JavaClasses5;

public class VariablesAndMethods {

    public String firstName= "Robin"; //Instance Variable-Inside class but not any static word
    public static int age = 21;    //Static Variable contains static word and also inside the class



    String designation;

    public static void printAge() {

        System.out.println(age);
    }
    public void printDesignation(String designation){ //with argument method
        System.out.println("designation  is:" +designation);
    }

    public void printLastName(){

        String lastName = "Andersson"; //Local Variable-inside only specific method
        System.out.println(lastName);

    }
     public  void printFirstName(){

        String firstName="Robin";

    }

    public  int printSalary() {

        int salary = 50000;
        return salary;
    }
    public  String printCountry() {

        String country = "Denamrk";
        return country;
    }
    public int addValue(int num1, int num2){

        int sum=num1+num2;
        return sum;

    }

    public static void main(String[] args) {
        VariablesAndMethods test= new VariablesAndMethods();
        test.designation = "Manager";
        System.out.println(test.designation);
        System.out.println(test.firstName);
        test.printLastName();
        System.out.println(test.age);
        System.out.println(test.addValue(10,20));
        System.out.println(test.printSalary());
        System.out.println(test.printCountry());
    }

}


