package OOP7;

// Интерфейс стратегии операции
interface Operation {
    double calculate(double a, double b);
}

// Конкретные стратегии для операций
class Addition implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}

class Subtraction implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}

class Multiplication implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}

class Division implements Operation {
    @Override
    public double calculate(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Число не может быть равно 0");
        }
        return a / b;
    }
}