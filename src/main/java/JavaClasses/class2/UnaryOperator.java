package JavaClasses.class2;

public class UnaryOperator {
    public static void main(String[] args) {
        int num = 6;
        //Unary Plus(+)operator
        num = +num;
        System.out.println("Unary Plus(+)operator Value is:" +num);

        // Increment(++)Operator
        num = num++;
        System.out.println("Unary Increment(++)Operator Value is:" +num);

        // Pre-Increment(++)Operator
        num = ++num;
        System.out.println("Unary Pre-Increment(++)Operator Value is:" +num);

        // Decrement(--)Operator
        num = num--;
        System.out.println("Unary Decrement(--)Operator Value is:" +num);

        // Pre-Decrement(--)Operator
        num = --num;
        System.out.println("Unary Pre-Decrement(--)Operator Value is:" +num);

        //Unary Minus(-)operator
        num = -num;
        System.out.println("Unary Minus (-) Operator Value is:" +num);

    }
}
