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
    }
}