package JavaClasses5;



public class Variables {

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

}
