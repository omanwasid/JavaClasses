package JavaClasses;

public class Person {
    String name; ////Example of different modifiers in same class
    int age;
    private float height=5.9f;
    private String occupation="Civil Engineer";
    long jobID;
    double salary;
    protected String  country;

    public Person (){ //Default Constructor

    }

    public Person(String name, float height) { //Constructor with argument
        this.name = name;
        this.height = height;
    }
    public String getCountry(){  //Constructor with argument
        return country;
    }

}

