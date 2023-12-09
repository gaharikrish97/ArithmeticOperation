// Abstract class for Arithmetic Expression
abstract class ArithmeticExp {
    public abstract int evaluate();
}

// Abstract class for Binary expressions
abstract class BinaryExp extends ArithmeticExp {
    public ArithmeticExp left;
    public ArithmeticExp right;

    public BinaryExp(ArithmeticExp left, ArithmeticExp right) {
        this.left = left;
        this.right = right;
    }
}

// Class for Numbers
class Number extends ArithmeticExp {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }
}

// Class for Sum expressions
class Sum extends BinaryExp {
    public Sum(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
}

// Class for Product expressions
class Product extends BinaryExp {
    public Product(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}

// Main class with updated structure
public class ArithmeticOperation {
    public static void main(String[] args) {
        // Constructing for a sample expression 3 + 2 * 5
        ArithmeticExp term = new Sum(
                new Number(3),
                new Product(new Number(2), new Number(5))
        );

        System.out.println(evaluate(term));
    }

    // Evaluating the expression recursively
    public static int evaluate(ArithmeticExp term) {
        return term.evaluate();
    }
}
