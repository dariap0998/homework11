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
        if (clientOS == 0 && clientDeviceYear > 2022) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear <= 2022) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear > 2022) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2022) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int check3(int deliveryDistance) {
        if (deliveryDistance > 100) {
            return -1; }
            int deliveryDay = 1;
            if (deliveryDistance > 20) {
                deliveryDay = deliveryDay + 1;
            }
            if (deliveryDistance > 60) {
                deliveryDay = deliveryDay + 1;
            }
            return deliveryDay;
        }



        public static void task1 () {
            System.out.println("Задача 1");
            int year = 2000;
            mainCheck(year);
        }

        public static void task2 () {
            System.out.println("Задача 2");
            int clientOS = 0;
            int clientDeviceYear = 2022;
            check2(clientOS, clientDeviceYear);
        }

        public static void task3 () {
            System.out.println("Задача 3");
            int deliveryDay = check3(610);
            if (deliveryDay == -1) {
                System.out.println("К сожалению, доставки нет!");
            } else
                System.out.println("Доставка займет " + deliveryDay + " день!");

        }

}




