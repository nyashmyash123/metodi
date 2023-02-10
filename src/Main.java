public class Main {
    public static void countLeapYear (short year) {
        if ((year % 400) == 0) {
            System.out.println(year + " високосный год");
        } else if ((year % 100) == 0) {
            if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
                System.out.println(year + " невисокосный год");
            } else if ((year % 4) == 0) {
            } else
                System.out.println(year + " високосный год");
        } else
            System.out.println(year + " невисокосный год");
    }

    public static void installSystem (int clientOS, int dateRelease) {
        if (clientOS == 1 && dateRelease > 2015)
            System.out.println("Установите версию приложения для iOS по ссылке");
        @@ -20,6 +17,7 @@ else if (clientOS == 1 && dateRelease <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void countDays(int deliveryRange) {
        short deliveryTime;
        if (deliveryRange <= 20) {
            @@ -38,8 +36,9 @@ public static void countDays(int deliveryRange) {
                System.out.println("Потребуется дней: " + deliveryTime);
            }
        }

        public static void main(String[] args) {
            short year = 1900;
            short year = 1700;
            countLeapYear(year);
            int clientOS = 0;
            int dateRelease = 2016;