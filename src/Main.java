import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Выберите операцию (+, -, *, /, %, ^, sqrt): ");
        String operation = scanner.next();
        double result;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: Деление на ноль.");
                    return;
                }
                break;
            case "%":
                result = num1 % num2;
                break;
            case "^":
                result = Math.pow(num1, num2);
                break;
            case "sqrt":
                if (num1 >= 0) {
                    result = Math.sqrt(num1);
                } else {
                    System.out.println("Ошибка: Корень из отрицательного числа.");
                    return;
                }
                System.out.printf("Результат (корень из %.2f): %.2f\n", num1, result);
                return; // Выход из функции после корня
            default:
                System.out.println("Ошибка: Неверная операция.");
                return;
        }
        System.out.printf("Результат: %.2f\n", result);
    }
}