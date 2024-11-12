class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isValidDate() {
        return isValidMonth(month) && isValidDay(day, month, year);
    }

    private boolean isValidMonth(int month) {
        return month >= 1 && month <= 12;
    }

    private boolean isValidDay(int day, int month, int year) {
        int[] daysInMonth = {31, 28 + (isLeapYear(year) ? 1 : 0), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return day >= 1 && day <= daysInMonth[month - 1];
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void nextDay() {
        if (isValidDate()) {
            int[] daysInMonth = {31, 28 + (isLeapYear(year) ? 1 : 0), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            day++;
            if (day > daysInMonth[month - 1]) {
                day = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            }
        } else {
            System.out.println("Invalid date.");
        }
    }

    public void displayDate() {
        System.out.println(String.format("Date: %02d/%02d/%04d", day, month, year));
    }
}

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(31, 12, 2024);
        date.displayDate();
        date.nextDay();
        date.displayDate();

        Date invalidDate = new Date(32, 13, 2024);
        invalidDate.displayDate();
    }
}
