public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("\nTask1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Такая система не поддерживается");
        }
        //Task 2
        System.out.println("\nTask2");
        int clientDeviceYear = 2013;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите  версию приложения для iOS по ссылке");
        } else {
            System.out.println("Такая система не поддерживается");
        }
        //Task 3
        System.out.println("\nTask3");
        int year = 2021;
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.printf("%s. год является високосным.%n", year);
        } else {
            System.out.printf("%s. год не является високосным.%n", year);
        }
        //Task 4
        System.out.println("\nTask4");
        int deliveryDistance = 95;
        int days = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days += 1;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days += 1;
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет");
        }
        //Task 5
        System.out.println("\nTask5");
        int monthNumber = 4;
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Введен неправильный месяц");
        }
    }
}