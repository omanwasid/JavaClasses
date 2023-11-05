package JavaClasses4;

public class WhileLoop {
    public static void main(String[] args) {
        int x = 1, sum = 0;

        while (x <= 10) {
            sum = sum + x;
            System.out.println(sum);
            x++;
        }
            System.out.println("Sum Total: " + sum);
    }
}
