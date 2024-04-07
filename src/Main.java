public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("\nTask1");
        int userOperatingSystem = 1;
        if (userOperatingSystem == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if  (userOperatingSystem == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Такая система не поддерживается");
        }
        //Task 2
        System.out.println("\nTask2");
        int operatingSystemYear = 2013;
        if (userOperatingSystem == 1 && operatingSystemYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (userOperatingSystem == 1 && operatingSystemYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (userOperatingSystem == 0 && operatingSystemYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (userOperatingSystem == 0 && operatingSystemYear >= 2015) {
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
            days = days +1;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = days +1;  
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставке нет");
        }
    }
}