class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    private String period;

    public Clock(int hours, int minutes, int seconds) {
        if (isValidTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            this.period = (hours >= 12) ? "PM" : "AM";
            if (this.hours > 12) {
                this.hours -= 12; // Convert to 12-hour format if hours > 12
            }
        } else {
            System.out.println("Invalid time input.");
        }
    }

    private boolean isValidTime(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 23) {
            return false;
        }
        if (minutes < 0 || minutes > 59) {
            return false;
        }
        if (seconds < 0 || seconds > 59) {
            return false;
        }
        return true;
    }

    public void displayTime() {
        System.out.println(String.format("Time: %02d:%02d:%02d %s", hours, minutes, seconds, period));
    }

    public void setTime(int hours, int minutes, int seconds) {
        if (isValidTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            this.period = (hours >= 12) ? "PM" : "AM";
            if (this.hours > 12) {
                this.hours -= 12; // Convert to 12-hour format if hours > 12
            }
        } else {
            System.out.println("Invalid time input.");
        }
    }

    public void setAMPM(int hours, int minutes, int seconds, String period) {
        if (isValidTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            this.period = period.toUpperCase();
            if (this.period.equals("AM") && this.hours == 12) {
                this.hours = 0; // Convert 12 AM to 00 hours
            }
            if (this.period.equals("PM") && this.hours != 12) {
                this.hours += 12; // Convert PM hours to 24-hour format
            }
        } else {
            System.out.println("Invalid time input.");
        }
    }
}

public class ClockTest {
    public static void main(String[] args) {
        Clock clock = new Clock(13, 45, 30);
        clock.displayTime(); // Should display time in 12-hour format (AM/PM)

        clock.setTime(6, 30, 45);
        clock.displayTime(); // Should display time in 12-hour format (AM/PM)

        clock.setAMPM(8, 59, 59, "PM");
        clock.displayTime(); // Should display 8:59:59 PM
    }
}
