public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void mainCheck(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный!");
        } else {
            System.out.println(year + " год - не високосный!");
        }
    }

    public static void check2(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear > 2022) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear > 2022) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void check3(int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет " + deliveryDay + " день!");
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Доставка займет " + (deliveryDay + 1) + " дня!");
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Доставка займет " + (deliveryDay + 2) + " дня!");
            } else {
                System.out.println("К сожалению, доставки нет!");
            }
        }
    }


        public static void task1() {
            System.out.println("Задача 1");
            int year = 2000;
            mainCheck(year);
        }

        public static void task2() {
            System.out.println("Задача 2");
            int clientOS = 0;
            int clientDeviceYear = 2022;
            check2(clientOS, clientDeviceYear);
        }

        public static void task3() {
            System.out.println("Задача 3");
            int deliveryDistance = 101;
            check3(deliveryDistance);
        }
    }


