package JavaClasses4;

public class BreakStatement {
    public static void main(String[] args)
        {

            for (int i = 0; i < 10; i++) {
                 if (i == 5)
                     break;
                System.out.println("Iteration: " + i);
            }
            System.out.println("Loop completed.");
        }


    }