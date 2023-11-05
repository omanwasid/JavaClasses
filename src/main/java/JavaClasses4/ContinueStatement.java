package JavaClasses4;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3)
                continue;
            System.out.println("Iteration: " + i);
        }
        System.out.println("Loop completed.");
    }


}


