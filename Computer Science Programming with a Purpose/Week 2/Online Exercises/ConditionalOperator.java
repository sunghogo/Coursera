public class ConditionalOperator {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 10.0);
        int y = (int) (Math.random() * 10.0);

        //Conditional operator. The conditional operator ?: is a ternary operator (three operands) that enables you to embed a conditional within an expression. The three operands are separated by the ? and : symbols. If the first operand (a boolean expression) is true, the result has the value of the second expression; otherwise it has the value of the third expression.
        int min = (x < y) ? x : y;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("min: " + min);
    }    
}
