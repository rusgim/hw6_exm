public class Main {
    public static void main(String[] args) {
        //задание 1
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        //задание 2
        System.out.println(" ");
        int clientDeviceYear = 2010;
        int clientOS1 = 1;
        if (clientDeviceYear >= 2015 && clientDeviceYear <= 2022) {
            if (clientOS1 == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS1 == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS1 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        //задание 3
        System.out.println(" ");
        int year = 1900;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
        //задание 4
        System.out.println(" ");
        int deliveryDistance = 120;
        int numberOfDeliveryDays = 0;
        if (deliveryDistance <= 20) {
            numberOfDeliveryDays = numberOfDeliveryDays + 1;
            System.out.println("Потребуется " + numberOfDeliveryDays + " день для доставки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            numberOfDeliveryDays = numberOfDeliveryDays + 2;
            System.out.println("Потребуется " + numberOfDeliveryDays + " дня для доставки");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            numberOfDeliveryDays = numberOfDeliveryDays + 3;
            System.out.println("Потребуется " + numberOfDeliveryDays + " дня для доставки");
        } else if (deliveryDistance > 100 && deliveryDistance <= 140) {
            numberOfDeliveryDays = numberOfDeliveryDays + 4;
            System.out.println("Потребуется " + numberOfDeliveryDays + " дня для доставки");
        }
        //задание 5
        System.out.println(" ");
        int monthNumber = 14;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Сезон - зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон - весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон - лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон - осень");
                break;
            case 12:
                System.out.println("Сезон - зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}