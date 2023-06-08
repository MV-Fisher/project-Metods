public class Main {
    public static void printTask(int num) {
        System.out.println("Задача № " + num +".") ;
    }
    public static void jostYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
            System.out.println(year + " - год является високосным.");
        }else {
            System.out.println( year + " - год не является високосным.");
        }
    }
    public static void myPhone(int clientDeviceYear, int clientOS) {
        if ( clientDeviceYear < 2015 ) {
            if (clientOS == 0) {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегчённую версию приложения для Android по ссылке.");
            }
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android.");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
    }
    public static void deliveryDistance(int deliveryDistance) {
        if ( deliveryDistance > 100 ) {
            System.out.println("Извините, доставки нет.");
        } else if ( deliveryDistance < 20 ) {
            System.out.println("Доставка карты займёт сутки.");
        } else if ( deliveryDistance > 20 && deliveryDistance < 60 ) {
            System.out.println("Доставка карты займёт двое суток.");
        } else if( deliveryDistance > 60 && deliveryDistance < 100 ) {
            System.out.println("Доставка карты займёт трое суток.");
        }
    }
    public static void main(String[] args) {
        printTask(1) ;
        jostYear(2023);
        printTask(2);
        myPhone(2014,1);
        printTask(3);
        deliveryDistance(95);
    }
}
