//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//CASE1//
        System.out.println("CASE1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;

            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;

            default:
                System.out.println("Ошибка");


        }
        System.out.println("     ");


//CASE2//
        System.out.println("CASE2");
        int clientDeviceYear = 2015;

        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015 && clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015 && clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для android по ссылке");
            }
        }
        System.out.println("     ");


//CASE3//
        System.out.println("CASE3");
        int year = 1924;

        if (year >= 1584 && (year % 4) == 0 && (year % 100) != 0) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - обычный год.");
        }
        System.out.println("     ");

//CASE4//
        System.out.println("CASE4");
        int deliveryDistance = 95;

        if (deliveryDistance < 20) {
            int time = 1;
            System.out.println("Потребуется дней: " + time);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            int time = 2;
            System.out.println("Потребуется дней: " + time);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            int time = 3;
            System.out.println("Потребуется дней: " + time);

        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("     ");

//CASE5//
        System.out.println("CASE5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println(monthNumber + " - зимний месяц.");
                break;

            case 3, 4, 5:
                System.out.println(monthNumber + " - весенний месяц.");
                break;

            case 6, 7, 8:
                System.out.println(monthNumber + " - летний месяц.");
                break;

            case 9, 10, 11:
                System.out.println(monthNumber + " - осенний месяц.");
                break;

            default:
                System.out.println("Нет такого месяца.");

        }

    }


}
    
