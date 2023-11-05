package JavaClasses;

public class PersonTest {
    public static void main(String[] args) {

        Person personInfo = new Person();
        personInfo.name="Thomas";
        personInfo.age=32;
        System.out.println("Thomas age:"+personInfo.age);
        personInfo.jobID=12353l;
        personInfo.salary=89000.21;
        personInfo.country="Denmark";
        System.out.println(personInfo.country);

        Person personInfo1 = new Person("Wasid",6.9f);
        System.out.println(personInfo1.name);
        System.out.println(personInfo1.salary);
    }
}
