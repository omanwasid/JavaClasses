package JavaClasses4;

public class IfElseIfStatement {
    public static void main(String[] args) {

        int ScoredRuns = 0;

        if (ScoredRuns >= 200) {
            System.out.println("Scored: Double Century");
        }

        else if (ScoredRuns >= 100 && ScoredRuns < 200) {
            System.out.println("Scored: Century");
        }

        else if (ScoredRuns >= 50 && ScoredRuns < 100) {
            System.out.println("Scored: Half-Century");
        }

        else if (ScoredRuns > 0 && ScoredRuns < 50) {
            System.out.println("ScoredRuns: Regular");
        }else
            System.out.printf("Scored: DUCK");
    }
}

