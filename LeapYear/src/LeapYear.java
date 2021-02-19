public class LeapYear {
    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                System.out.println("evenly divisible by 4 ");
                if (year % 100 == 0) {
                    System.out.println("evenly divisible by 4 and 100");
                    if (year % 400 == 0) {
                        System.out.println("evenly divisible by 4, 100, and 400. This is a leap year.");
                        return true;
                    } else {

                        System.out.println("This is not a leap year");
                        return false;
                    }
                } else {
                    System.out.println("This is a leap year.");
                    return true;
                }
            } else {
                System.out.println("This is not a leap year");
                return false;
            }
        }
        return false;
    }
}
