package add;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Введіть суму покупки: ");
        double purchaseAmount = scanner.nextDouble();


        double discount = calculateDiscount(purchaseAmount);

        // Сума до оплати
        double amountToPay = purchaseAmount - discount;

        System.out.printf("Загальна сума покупки: %.2f грн%n", purchaseAmount);
        System.out.printf("Сума знижки: %.2f грн%n", discount);
        System.out.printf("Сума до оплати: %.2f грн%n", amountToPay);
    }

    // Метод для обчислення знижки
    public static double calculateDiscount(double purchaseAmount) {
        double discount = 0.0;

        // Перевірка суми покупки.
        // Визначення знижки.
        if (purchaseAmount <= 5000) {
            discount = purchaseAmount * 0.05;
        } else if (purchaseAmount > 5000 && purchaseAmount <= 10000) {
            discount = purchaseAmount * 0.10;
        } else if (purchaseAmount > 10000) {
            discount = purchaseAmount * 0.15;
        }

        return discount;
    }
}