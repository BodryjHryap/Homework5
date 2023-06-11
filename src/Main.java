public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1(){
        System.out.println("Задание 1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Выберите только первую или вторую ОС");
        }
    }

    public static void task2(){
        System.out.println("Задание 2");
        int clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientDeviceYear <= 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if(clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task3(){
        System.out.println("Задание 3");
        int year = 2023;
        if (year % 4 == 0 && year % 400 == 0 || year % 100 != 0){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4(){
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance <= 20){
            System.out.println("На доставку потребуется: " + deliveryDays + " день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            deliveryDays += 1;
            System.out.println("На доставку потребуется: " + deliveryDays + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            deliveryDays += 2;
            System.out.println("На доставку потребуется: " + deliveryDays + " дня");
        } else {
            System.out.println("Свыше 100км доставки нет");
        }
    }

    public static void task5(){
        System.out.println("Задание 5");
        int monthNumber = 11;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + "-й месяц является зимой");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц является весной");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц является летом");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц является осенью");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}