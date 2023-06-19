public class Main {
    public static void main(String[] args) {
        printNumberTask(1) ;
        checkingLongYear(2023);
        printNumberTask(2);
        anableCklientPhone(2016,0);
        printNumberTask(3);
        anableDistanceToCklient(95);
    }
    public static void checkingLongYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
            System.out.println( year + " - год является високосным.");
        }else {
            System.out.println( year + " - год не является високосным.");
        }
    }
    public static void anableCklientPhone(int clientDeviceYear, int clientOS) {
        int Year = 2015 ;
        int OS = 0 ;
        int OS2 = 1 ;
        if (clientOS != OS && clientOS != OS2 ) {
            System.out.println("Операционная система не поддерживается.");
        } else if ( clientDeviceYear < Year ) {
            if (clientOS == OS) {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегчённую версию приложения для Android по ссылке.");
            }
        } else if (clientOS == OS2) {
            System.out.println("Установите версию приложения для Android.");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
    }
    public static int anableDistanceToCklient(int deliveryDistance) {
        int deliveryDays = 0 ;
        if ( deliveryDistance > 100 ) {
            deliveryDays = -1 ;
        } else if ( deliveryDistance < 20 ) {
            deliveryDays = 1 ;
        } else if ( deliveryDistance > 20 && deliveryDistance < 60 ) {
            deliveryDays = 2 ;
        } else if( deliveryDistance > 60 && deliveryDistance < 100 ) {
            deliveryDays = 3 ;
        }
        System.out.println("Доставка займёт: " + deliveryDays + " дня(дней)."  );
        return deliveryDays ;
    }
    public static void printNumberTask(int num) {
        System.out.println("Задача № " + num + ".") ;
    }
}
// Домашнее задание выполненно с учётом замечаний.
// Домашнее задание считаю выполненным.
