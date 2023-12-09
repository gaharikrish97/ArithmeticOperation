// Abstract class for Arithmetic Expression
abstract class ArithmeticExp {
    public abstract int evaluate();
}

// Abstract class for Binary expressions
abstract class Binary extends ArithmeticExp {
    protected ArithmeticExp left;
    protected ArithmeticExp right;

    public Binary(ArithmeticExp left, ArithmeticExp right) {
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
class Sum extends Binary {
    public Sum(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
}

// Class for Product expressions
class Product extends Binary {
    public Product(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}

