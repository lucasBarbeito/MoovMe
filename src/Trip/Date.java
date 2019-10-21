package Trip;

public class Date {

    private int day, month, year, hour, minute;

    public Date(int day, int month, int year, int hour, int minute) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
    }

    public static Date getInstantTime() {
        throw new RuntimeException("Hacer Metodo get instatnt time");
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int diferenceInMinutes(Date otherTime) {
        return (otherTime.getMinute() - minute) + (otherTime.getHour() - hour) * 60;
    }
}
