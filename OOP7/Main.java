package OOP7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр калькулятора
        Calculator calculator = new Calculator();
         Scanner scanner = new Scanner(System.in);

        // Ввод данных с консоли
        System.out.println("Введите число 1: ");
        double operand1 = scanner.nextDouble();

        System.out.println("Введите число 2:");
        double operand2 = scanner.nextDouble();

        // Устанавливаем стратегию сложения
        calculator.setOperation(new Addition());
        double result1 = calculator.executeOperation(operand1, operand2);

        // Устанавливаем стратегию вычитания
        calculator.setOperation(new Subtraction());
        double result2 = calculator.executeOperation(operand1, operand2);

        // Устанавливаем стратегию умножения
        calculator.setOperation(new Multiplication());
        double result3 = calculator.executeOperation(operand1, operand2);

        // Устанавливаем стратегию деления
        calculator.setOperation(new Division());
        double result4 = calculator.executeOperation(operand1, operand2);

        // Вывод результатов
        System.out.println("Результат:");
        System.out.println("Сложение: " + result1);
        System.out.println("Вычитание: " + result2);
        System.out.println("Умножение: " + result3);
        System.out.println("Деление: " + result4);
   
        // Закрываем Scanner
        scanner.close();
    }
}
