package OOP7;

// Контекст, использующий стратегию
class Calculator {
    private Operation operation; // Стратегия операции

    // Метод для установки стратегии
    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    // Метод для выполнения операции
    public double executeOperation(double a, double b) {
        if (operation == null) {
            throw new IllegalStateException("Operation not set");
        }
        return operation.calculate(a, b);
    }
}