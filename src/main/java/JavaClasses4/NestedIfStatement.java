package JavaClasses4;

public class NestedIfStatement {
    public static void main(String[] args) {
        int ScoredRuns = 101;


        if (ScoredRuns <= 199) {


            if (ScoredRuns >= 100) {
                System.out.println("Scored: Century");

            } else {
                System.out.printf("Scored: Missing the Century");
            }
        }
    }
}


